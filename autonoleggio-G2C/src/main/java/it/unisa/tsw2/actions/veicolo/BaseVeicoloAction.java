package it.unisa.tsw2.actions.veicolo;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Veicolo;
import it.unisa.tsw2.services.VeicoloService;
import it.unisa.tsw2.services.VeicoloServiceImpl;

import java.io.File;
import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
import com.opensymphony.xwork2.validator.annotations.*;
@ParentPackage("enterVeicolo")

public class BaseVeicoloAction extends BaseAction implements ModelDriven<Veicolo>
{
	protected Veicolo veicolo;
	protected VeicoloService veicoloService=new VeicoloServiceImpl();
	
	public Veicolo getVeicolo()
	{
		return veicolo;
	}
	
	public void setVeicolo(Veicolo veicolo)
	{
		this.veicolo=veicolo;
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

	public VeicoloService getVeicoloService() {
		return veicoloService;
	}

	public void setVeicoloService(VeicoloService veicoloService) {
		this.veicoloService = veicoloService;
	}



}
