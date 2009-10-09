package it.unisa.tsw2.actions.anagrafica;

import java.util.List;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import it.unisa.tsw2.domain.Optional;
import it.unisa.tsw2.services.*;
import java.util.*;

public class CampiVeicoloAction extends BaseVeicoloAction
{
	
	
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