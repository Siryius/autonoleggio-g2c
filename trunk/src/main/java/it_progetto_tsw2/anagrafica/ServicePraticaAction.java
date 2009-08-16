package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.services.PraticaService;
import it_progetto_tsw2_hibernate.Pratica;

import java.util.Iterator;
import java.util.List;

public class ServicePraticaAction extends BasePraticaAction 
{
	
	public String insertPratica()throws Exception 
	{
	    Pratica tmp_pratica=super.getPratica();
		PraticaService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_pratica.getNome_pratica());
			tmp_service.persist(tmp_pratica,tmp_pratica.getNome_pratica());		
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in insertPratica");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updatePratica() throws Exception 
	{
	    Pratica tmp_pratica=super.getPratica();
		PraticaService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updatePratica(tmp_pratica);
			
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in updatePratica");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deletePratica() throws Exception 
	{
		Pratica tmp_pratica=super.getPratica();
		PraticaService tmp_service=super.getService();
		try
		{
			tmp_service.deletePratica(tmp_pratica,tmp_pratica.getNome_pratica());
			
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in deletePratica");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchPraticaByNome_pratica() throws Exception 
	{
		Pratica tmp_pratica=super.getPratica();
		PraticaService tmp_service=super.getService();
		try
		{
			tmp_pratica=tmp_service.findByNome_pratica(tmp_pratica.getNome_pratica());
			super.setPratica(tmp_pratica);
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in searchPraticaByNome_pratica");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchPraticaByExample() throws Exception 
	{
		Pratica tmp_pratica=super.getPratica();
		PraticaService tmp_service=super.getService();
		
		Iterator tmp_praticaIterator=null;
		try
		{
			List pratica_search=tmp_service.findByExample(tmp_pratica);
			tmp_praticaIterator=pratica_search.iterator();
			super.setAllPraticaIterator(tmp_praticaIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in searchPraticaByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllPratica()
	{
		try
		{
			PraticaService tmp_service=super.getService();
			Iterator tmp_praticaIterator=null;
			
			List result = tmp_service.findAllPratica();
			tmp_praticaIterator=result.iterator();
			super.setAllPraticaIterator(tmp_praticaIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServicePraticaAction Errore in searchAllPratica");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}

