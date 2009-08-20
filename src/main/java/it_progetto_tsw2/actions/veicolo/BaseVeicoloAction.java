package it_progetto_tsw2.actions.veicolo;

import it_progetto_tsw2.actions.BaseAction;
import it_progetto_tsw2.services.VeicoloService;
import it_progetto_tsw2.services.VeicoloServiceImpl;
import it_progetto_tsw2_hibernate.Veicolo;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("enterVeicolo")
public class BaseVeicoloAction extends BaseAction implements ModelDriven<Veicolo>
{
	private Veicolo veicolo;
	

	public Veicolo getVeicolo()
	{
		return veicolo;
	}
	
	public Veicolo getModel()
	{
		return veicolo;
	}
	
	public void setModel(Object model)
	{
		this.veicolo=(Veicolo)model;
	}
	
	public void setModel(Veicolo model)
	{
		this.veicolo=model;
	}	

	



	
	
	
}
