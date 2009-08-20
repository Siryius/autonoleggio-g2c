package it_progetto_tsw2.actions.anagrafica;

import java.util.List;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import it_progetto_tsw2.services.*;
import it_progetto_tsw2_hibernate.Optional;
import java.util.*;

public class CampiVeicoloAction extends BaseVeicoloAction
{
	
	@Validations( visitorFields = {
            @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) }
    )
	public String execute() throws Exception 
	{
		Iterator tmp_OptionalIterator;
		OptionalService optionalService =new OptionalServiceImpl();
		List listOptional= optionalService.findAllOptional();
		System.out.println("Num opt"+listOptional.size());
		tmp_OptionalIterator=listOptional.iterator();
		super.setAllOptionalIterator(tmp_OptionalIterator);
		return SUCCESS;
	}

}