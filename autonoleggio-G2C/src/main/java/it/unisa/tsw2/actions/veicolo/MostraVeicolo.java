package it.unisa.tsw2.actions.veicolo;

import java.util.Iterator;
import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@ParentPackage("enterVeicolo")
@Results( value={
@Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/mostraVeicolo.jsp",name="success")
})
public class MostraVeicolo extends BaseVeicoloAction
{
	private String idV;


	public String getIdV() {
		return idV;
	}


	public void setIdV(String id) {
		this.idV = id;
	}

	public String execute()throws Exception
	{ 
		veicolo=veicoloService.findById(new Long(idV));
		return SUCCESS;
	}
}
