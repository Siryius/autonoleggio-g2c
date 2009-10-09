package it.unisa.tsw2.actions.utente;

import java.util.Date;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Utente;

import org.apache.struts2.config.ParentPackage;

import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("enterUtente")

public class BaseUtenteAction extends BaseAction implements ModelDriven<Utente>
{
	protected Utente utente=null;
	
	public Utente getModel()
	{
		return utente;
	}
	
	public void setModel(Object model)
	{
		this.utente=(Utente)model;
	}
	
	public void setModel(Utente model)
	{
		this.utente=model;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	
}
