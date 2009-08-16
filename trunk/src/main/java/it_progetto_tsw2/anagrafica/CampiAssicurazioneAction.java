package it_progetto_tsw2.anagrafica;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

public class CampiAssicurazioneAction extends BaseAssicurazioneAction
{
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	public String execute() throws Exception 
	{
		return SUCCESS;
	}

}
