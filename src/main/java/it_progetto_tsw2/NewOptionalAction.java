package it_progetto_tsw2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.*;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

public class NewOptionalAction extends BaseOptionalAction 
{
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	
	public String execute() throws Exception 
	{
		
			super.service.persist(super.optional,super.optional.getNome_optional());
			
		
		return SUCCESS;
	}
}
