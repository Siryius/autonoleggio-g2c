package it_progetto_tsw2.actions;


import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;


import org.apache.struts2.config.ParentPackage;

public class IndexAction extends BaseAction
{
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	public String execute() throws Exception 
	{
		return SUCCESS;
	}

}
