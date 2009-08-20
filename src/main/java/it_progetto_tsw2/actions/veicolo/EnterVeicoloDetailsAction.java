package it_progetto_tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import it_progetto_tsw2_hibernate.Veicolo;
import com.opensymphony.xwork2.validator.annotations.*;

@ParentPackage("enterVeicolo")
@Result(type= ServletActionRedirectResult.class,value="selectCategoria",params={"method","input"})
@Validation
public class EnterVeicoloDetailsAction extends BaseVeicoloAction implements Preparable
{
	public void prepare()
	{
		Veicolo veicolo=super.getVeicolo();
		veicolo=new Veicolo();
	}
	
	@VisitorFieldValidator(message="", fieldName="model", shortCircuit=false, appendPrefix=false )
	public String execute()throws Exception
	{
		return SUCCESS;
	}

}
