package it.unisa.tsw2.actions.anagrafica;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Categoria;
import it.unisa.tsw2.domain.Optional;
import it.unisa.tsw2.services.CategoriaService;
import it.unisa.tsw2.services.CategoriaServiceImpl;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
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
