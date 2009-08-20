package it_progetto_tsw2.actions.anagrafica;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class CampiOptionalAction extends BaseOptionalAction
{
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	public String execute() throws Exception 
	{
		return INPUT;
	}

}
