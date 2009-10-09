package it.unisa.tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@ParentPackage("enterVeicolo")

@Results( value={
    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/enterVeicoloDetails-input.jsp",name="success")
})

public class AddVeicoloAction extends BaseVeicoloAction
{
	public String execute()throws Exception
	{
		return SUCCESS;
	}

}
