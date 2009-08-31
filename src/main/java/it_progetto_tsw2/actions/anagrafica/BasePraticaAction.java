package it_progetto_tsw2.actions.anagrafica;

import it_progetto_tsw2.actions.BaseAction;
import it_progetto_tsw2.domain.Pratica;
import it_progetto_tsw2.services.PraticaService;
import it_progetto_tsw2.services.PraticaServiceImpl;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BasePraticaAction extends BaseAction implements ModelDriven<Pratica> , Preparable
{
	private Pratica pratica;
	private PraticaService service;
	private Iterator allPraticaIterator;
	
	
	public Pratica getModel()
	{
		return pratica;
	}
	
	public Pratica getPratica() {
		return pratica;
	}
	public void setPratica(Pratica pratica) {
		this.pratica = pratica;
	}
	
	public void setPraticaService(PraticaService service) {
		this.service = service;
	}
	
	public PraticaService getService()
	{
		return service;
	}
	
	public Iterator getAllPraticaIterator() {
		return allPraticaIterator;
	}

	
	public void setAllPraticaIterator(Iterator allPraticaIterator) {
		this.allPraticaIterator = allPraticaIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			pratica = new Pratica();
			service = new PraticaServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BasePraticaAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}

