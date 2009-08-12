package it_progetto_tsw2;

import it_progetto_tsw2.services.CategoriaService;
import it_progetto_tsw2.services.CategoriaServiceImpl;
import it_progetto_tsw2_hibernate.Categoria;
import it_progetto_tsw2_hibernate.Optional;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class BaseCategoriaAction extends BaseAction implements ModelDriven<Categoria> , Preparable
{
	private Categoria categoria;
	private CategoriaService service;
	private Iterator allCategoriaIterator;
	
	
	public Categoria getModel()
	{
		return categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setOptional(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void setCategoriaService(CategoriaService service) {
		this.service = service;
	}
	
	public CategoriaService getService()
	{
		return service;
	}
	
	public Iterator getAllCategoriaIterator() {
		return allCategoriaIterator;
	}

	
	public void setAllCategoriaIterator(Iterator allOptionIterator) {
		this.allCategoriaIterator = allOptionIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			categoria = new Categoria();
			service = new CategoriaServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseCategoriaAction prepare");
			e.printStackTrace();
		}
    }

}
