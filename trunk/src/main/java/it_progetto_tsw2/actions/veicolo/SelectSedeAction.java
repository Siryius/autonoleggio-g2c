package it_progetto_tsw2.actions.veicolo;

import it_progetto_tsw2.services.SedeServiceImpl;
import it_progetto_tsw2.services.SedeService;
import it_progetto_tsw2_hibernate.Sede;
import it_progetto_tsw2_hibernate.Veicolo;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;

@ParentPackage("enterVeicolo")
@Result(type= ServletActionRedirectResult.class,value="selectSede")
@Validation
public class SelectSedeAction extends BaseVeicoloAction implements Preparable
{
	private List<Sede> sedi;
	private Long selectedSede = null;
	private SedeService serviceSede;
	
	 public void prepare() throws Exception
	 {
		 serviceSede=new SedeServiceImpl();
	     sedi = serviceSede.findAllSede();
	 }

	public List<Sede> getSedi() {
		return sedi;
	}

	public void setSedi(List<Sede> sedi) {
		this.sedi = sedi;
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
        return SUCCESS;
    }

}
