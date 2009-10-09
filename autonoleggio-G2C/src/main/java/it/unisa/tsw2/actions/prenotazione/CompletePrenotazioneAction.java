package it.unisa.tsw2.actions.prenotazione;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import it.unisa.tsw2.actions.veicolo.BaseVeicoloAction;

@ParentPackage("enterPrenotazione")

@Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/prenotazione/prenotazioneReview.jsp",name="success")
public class CompletePrenotazioneAction extends BasePrenotazioneAction
{
	public String execute()throws Exception
	{
		return SUCCESS;
	}

}
