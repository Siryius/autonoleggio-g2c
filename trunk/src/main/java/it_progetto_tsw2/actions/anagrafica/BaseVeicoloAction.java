package it_progetto_tsw2.actions.anagrafica;

import it_progetto_tsw2.actions.BaseAction;
import it_progetto_tsw2.domain.Veicolo;
import it_progetto_tsw2.services.VeicoloService;
import it_progetto_tsw2.services.VeicoloServiceImpl;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BaseVeicoloAction extends BaseAction implements ModelDriven<Veicolo> , Preparable
{
	private Veicolo veicolo;
	private VeicoloService service;
	
	private Iterator allVeicoloIterator;
	private Iterator allOptionalIterator;
	
	private String[] checkOptional;
	
	
	public Iterator getAllOptionalIterator() {
		return allOptionalIterator;
	}

	public void setAllOptionalIterator(Iterator allOptionalIterator) {
		this.allOptionalIterator = allOptionalIterator;
	}

	public Veicolo getModel()
	{
		return veicolo;
	}
	
	public Veicolo getVeicolo() {
		return veicolo;
	}
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	
	public void setVeicoloService(VeicoloService service) {
		this.service = service;
	}
	
	public VeicoloService getService()
	{
		return service;
	}
	
	public Iterator<Veicolo> getAllVeicoloIterator() {
		return allVeicoloIterator;
	}

	
	public void setAllVeicoloIterator(Iterator allVeicoloIterator) {
		this.allVeicoloIterator = allVeicoloIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			veicolo = new Veicolo();
			service = new VeicoloServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseVeicoloAction prepare");
			e.printStackTrace();
		}
    }

	public String[] getCheckOptional() {
		return checkOptional;
	}

	public void setCheckOptional(String[] checkOptional) {
		this.checkOptional = checkOptional;
	}

	public void setService(VeicoloService service) {
		this.service = service;
	}
	
	
	
}
