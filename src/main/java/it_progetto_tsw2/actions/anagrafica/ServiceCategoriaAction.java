package it_progetto_tsw2.actions.anagrafica;

import it_progetto_tsw2.domain.Categoria;
import it_progetto_tsw2.services.CategoriaService;

import java.util.Iterator;
import java.util.List;

public class ServiceCategoriaAction extends BaseCategoriaAction 
{
	public String insertCategoria()throws Exception 
	{
	    Categoria tmp_categoria=super.getCategoria();
		CategoriaService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_categoria.getNome_categoria()+" "+tmp_categoria.getDescrizione_categoria()+" "+tmp_categoria.getTariffa_categoria());
			tmp_service.persist(tmp_categoria,tmp_categoria.getNome_categoria());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceCategoriaAction Errore in insertCategoria");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateCategoria() throws Exception 
	{
	    Categoria tmp_categoria=super.getCategoria();
		CategoriaService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateCategoria(tmp_categoria);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceCategoriaAction Errore in updateCategoria");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteCategoria() throws Exception 
	{
		Categoria tmp_categoria=super.getCategoria();
		CategoriaService tmp_service=super.getService();
		try
		{
			tmp_service.deleteCategoria(tmp_categoria,tmp_categoria.getNome_categoria());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceCategoriaAction Errore in deleteCategoria");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchCategoriaByNome_categoria() throws Exception 
	{
		Categoria tmp_categoria=super.getCategoria();
		CategoriaService tmp_service=super.getService();
		try
		{
			tmp_categoria=tmp_service.findByNome_categoria(tmp_categoria.getNome_categoria());
			super.setOptional(tmp_categoria);
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in searchOptionalByNome_optional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchCategoriaByExample() throws Exception 
	{
		Categoria tmp_categoria=super.getCategoria();
		CategoriaService tmp_service=super.getService();
		
		Iterator tmp_categoriaIterator=null;
		try
		{
			List categoria_search=tmp_service.findByExample(tmp_categoria);
			tmp_categoriaIterator=categoria_search.iterator();
			super.setAllCategoriaIterator(tmp_categoriaIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceCategoriaAction Errore in searchCategoriaByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllCategoria()
	{
		try
		{
			CategoriaService tmp_service=super.getService();
			Iterator tmp_categoriaIterator=null;
			
			List result = tmp_service.findAllCategoria();
			tmp_categoriaIterator=result.iterator();
			super.setAllCategoriaIterator(tmp_categoriaIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceCategoriaAction Errore in searchAllCategoria");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}

}
