package it_progetto_tsw2.actions.anagrafica;

import it_progetto_tsw2.actions.BaseAction;
import it_progetto_tsw2.domain.Sede;
import it_progetto_tsw2.services.SedeService;
import it_progetto_tsw2.services.SedeServiceImpl;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BaseSedeAction extends BaseAction implements ModelDriven<Sede> , Preparable
{
	private Sede sede;
	private SedeService service;
	private Iterator allSedeIterator;
	
	
	public Sede getModel()
	{
		return sede;
	}
	
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	public void setSedeService(SedeService service) {
		this.service = service;
	}
	
	public SedeService getService()
	{
		return service;
	}
	
	public Iterator getAllSedeIterator() {
		return allSedeIterator;
	}

	
	public void setAllSedeIterator(Iterator allSedeIterator) {
		this.allSedeIterator = allSedeIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			sede = new Sede();
			service = new SedeServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseSedeAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}

