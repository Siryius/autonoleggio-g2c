package it.unisa.tsw2.actions.prenotazione;

import java.util.Date;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Prenotazione;

import org.apache.struts2.config.ParentPackage;

import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("enterPrenotazione")

public class BasePrenotazioneAction extends BaseAction implements ModelDriven<Prenotazione>
{
	protected Prenotazione prenotazione=null;
	
	public Prenotazione getModel()
	{
		return prenotazione;
	}
	
	public void setModel(Object model)
	{
		this.prenotazione=(Prenotazione)model;
	}
	
	public void setModel(Prenotazione model)
	{
		this.prenotazione=model;
	}

	public Prenotazione getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

	
}
