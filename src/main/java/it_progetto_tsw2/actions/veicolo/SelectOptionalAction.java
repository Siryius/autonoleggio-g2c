package it_progetto_tsw2.actions.veicolo;

import it_progetto_tsw2.services.OptionalService;
import it_progetto_tsw2.services.OptionalServiceImpl;
import it_progetto_tsw2_hibernate.Optional;
import it_progetto_tsw2_hibernate.Veicolo;

import java.util.List;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

public class SelectOptionalAction extends BaseVeicoloAction implements Preparable
{
	 private List<Optional> optionals;
	 private Long selectedOptional = null;
	 private OptionalService serviceOptional;
	 
	 public void prepare() throws Exception
	 {
		 serviceOptional=new OptionalServiceImpl();
	     optionals = serviceOptional.findAllOptional();
	 }

	public List<Optional> getOptionals() {
		return optionals;
	}

	public void setOptionals(List<Optional> optionals) {
		this.optionals = optionals;
	}

	public Long getSelectedOptional() {
		return selectedOptional;
	}

	@RequiredFieldValidator(message = "Default message", key = "validation.selectLocation")
	public void setSelectedOptional(Long selectedOptional) {
		this.selectedOptional = selectedOptional;
	}

	public OptionalService getServiceOptional() {
		return serviceOptional;
	}

	public void setServiceOptional(OptionalService service) {
		this.serviceOptional = service;
	}

   public String input() {
       return INPUT;
   }

   public String execute() throws Exception {
   	Veicolo veicolo=super.getVeicolo();
       veicolo.addOptional(serviceOptional.findById(selectedOptional));
       return SUCCESS;
   }

	

}

