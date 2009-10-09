package it.unisa.tsw2.actions.anagrafica;

import org.apache.struts2.interceptor.*;

import com.opensymphony.xwork2.validator.annotations.*;

import it.unisa.tsw2.domain.*;
import it.unisa.tsw2.services.*;

import java.util.*;
import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@ParentPackage("base-package")

@Validation()
public class ServiceOptionalAction extends BaseOptionalAction 
{

	@Validations( visitorFields = { @VisitorFieldValidator(message = "Campo", fieldName= "model", appendPrefix = true) } )
	public String insertOptional()throws Exception 
	{
	    Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_optional.getNome()+" "+tmp_optional.getDescrizione()+" "+tmp_optional.getSupplemento());
			tmp_service.persist(tmp_optional,tmp_optional.getNome());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in insertOptional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateOptional() throws Exception 
	{
	    Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateOptional(tmp_optional);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in updateOptional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteOptional() throws Exception 
	{
		Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			tmp_service.deleteOptional(tmp_optional,tmp_optional.getNome());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in deleteOptional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchOptionalByNome_optional() throws Exception 
	{
		Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			tmp_optional=tmp_service.findByNome_optional(tmp_optional.getNome());
			super.setOptional(tmp_optional);
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in searchOptionalByNome_optional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchOptionalByExample() throws Exception 
	{
		Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		
		Iterator tmp_optionalIterator=null;
		try
		{
			List optional_search=tmp_service.findByExample(tmp_optional);
			tmp_optionalIterator=optional_search.iterator();
			super.setAllOptionIterator(tmp_optionalIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in searchOptionalByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllOptional()
	{
		try
		{
			OptionalService tmp_service=super.getService();
			Iterator tmp_optionalIterator=null;
			
			List result = tmp_service.findAllOptional();
			tmp_optionalIterator=result.iterator();
			super.setAllOptionIterator(tmp_optionalIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceOptionalAction Errore in searchAllOptional");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
	
}
