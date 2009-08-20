package it_progetto_tsw2.actions.veicolo;

import it_progetto_tsw2.actions.veicolo.BaseVeicoloAction;
import it_progetto_tsw2.services.VeicoloService;
import it_progetto_tsw2.services.VeicoloServiceImpl;
import it_progetto_tsw2_hibernate.Veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import com.opensymphony.xwork2.validator.annotations.ExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;

@ParentPackage("enterVeicolo")
@Results( value={
    @Result(name="input",value="/jsp/veicolo/selectVeicolo-input.jsp"),
    @Result(type= ServletActionRedirectResult.class,value="completeVeicolo")
})
@Validation
public class SaveVeicoloAction extends BaseVeicoloAction {

    private VeicoloService service=new VeicoloServiceImpl();

    public void setEventService(VeicoloService service) {
        this.service = service;
    }

    @Validations( expressions={
        @ExpressionValidator(message="Default message", key="validate.moreThanTwoOptions",
            expression="optional!=null && optional.size>1" )
    })
    public String execute() throws Exception 
    {
    	Veicolo veicolo=super.getVeicolo();
        service.persist(veicolo, veicolo.getNome_veicolo());
        return SUCCESS;
    }
}
