package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.action.BaseAction;
import it_progetto_tsw2.services.AssicurazioneService;
import it_progetto_tsw2.services.AssicurazioneServiceImpl;
import it_progetto_tsw2_hibernate.Assicurazione;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BaseAssicurazioneAction extends BaseAction implements ModelDriven<Assicurazione> , Preparable
{
	private Assicurazione assicurazione;
	private AssicurazioneService service;
	private Iterator allAssicurazioneIterator;
	
	
	public Assicurazione getModel()
	{
		return assicurazione;
	}
	
	public Assicurazione getAssicurazione() {
		return assicurazione;
	}
	public void setAssicurazione(Assicurazione assicurazione) {
		this.assicurazione = assicurazione;
	}
	
	public void setAssicurazioneService(AssicurazioneService service) {
		this.service = service;
	}
	
	public AssicurazioneService getService()
	{
		return service;
	}
	
	public Iterator getAllAssicurazioneIterator() {
		return allAssicurazioneIterator;
	}

	
	public void setAllAssicurazioneIterator(Iterator allAssicurazioneIterator) {
		this.allAssicurazioneIterator = allAssicurazioneIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			assicurazione = new Assicurazione();
			service = new AssicurazioneServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseAssicurazioneAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}
