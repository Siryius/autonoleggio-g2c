package it_progetto_tsw2;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

public class CampiClienteAction extends BaseClienteAction
{
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	public String execute() throws Exception 
	{
		return SUCCESS;
	}

}