package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.action.BaseAction;
import it_progetto_tsw2.services.VeicoloService;
import it_progetto_tsw2.services.VeicoloServiceImpl;
import it_progetto_tsw2_hibernate.Veicolo;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BaseVeicoloAction extends BaseAction implements ModelDriven<Veicolo> , Preparable
{
	private Veicolo veicolo;
	private VeicoloService service;
	private Iterator<Veicolo> allVeicoloIterator;
	
	
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

	
	public void setAllVeicoloIterator(Iterator<Veicolo> allVeicoloIterator) {
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
	
	
	
}
