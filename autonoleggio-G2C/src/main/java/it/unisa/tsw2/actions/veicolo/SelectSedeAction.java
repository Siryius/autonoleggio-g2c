package it.unisa.tsw2.actions.veicolo;

import it.unisa.tsw2.domain.Optional;
import it.unisa.tsw2.domain.Sede;
import it.unisa.tsw2.domain.Veicolo;
import it.unisa.tsw2.services.OptionalService;
import it.unisa.tsw2.services.SedeServiceImpl;
import it.unisa.tsw2.services.OptionalServiceImpl;
import it.unisa.tsw2.services.SedeService;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;

@ParentPackage("enterVeicolo")

@Results( value={
	    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/selectOptional-input.jsp",name="success"),
	    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/veicolo/selectSede-input.jsp")
	})

public class SelectSedeAction extends BaseVeicoloAction implements Preparable
{
	private List<Optional> optionals_1;
	private Long selectedSede = null;
	private SedeService serviceSede;
	private OptionalService serviceOptional;
	
	 public void prepare() throws Exception
	 {
		 serviceSede=new SedeServiceImpl();
		 serviceOptional=new OptionalServiceImpl();
		 optionals_1 = serviceOptional.findAllOptional();
	   
	 }

	public Long getSelectedSede() {
		return selectedSede;
	}

	@RequiredFieldValidator(message = "Default message", key = "validation.selectLocation")
	public void setSelectedSede(Long selectedSede) {
		this.selectedSede = selectedSede;
	}

	public SedeService getServiceSede() {
		return serviceSede;
	}

	public void setServiceSede(SedeService serviceSede) {
		this.serviceSede = serviceSede;
	}

    public String input() {
        return INPUT;
    }

    public String execute() throws Exception {
    	Veicolo veicolo=super.getVeicolo();
        veicolo.setSede(serviceSede.findById(selectedSede));
        veicolo.getSede().getVeicoli().add(veicolo);
        return SUCCESS;
    }

	public List<Optional> getOptionals_1() {
		return optionals_1;
	}

	public void setOptionals_1(List<Optional> optionals_1) {
		this.optionals_1 = optionals_1;
	}

	public OptionalService getServiceOptional() {
		return serviceOptional;
	}

	public void setServiceOptional(OptionalService serviceOptional) {
		this.serviceOptional = serviceOptional;
	}

}
