package it.unisa.tsw2.actions.utente;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@ParentPackage("enterUtente")

@Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/utente/utenteReview.jsp",name="success")
public class CompleteUtenteAction extends BaseUtenteAction
{

	public String execute()throws Exception
	{
		return SUCCESS;
	}

}
