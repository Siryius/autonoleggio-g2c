package it_progetto_tsw2;

import org.apache.struts2.interceptor.*;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import it_progetto_tsw2_hibernate.*;
import it_progetto_tsw2.services.*;

import java.util.*;

public class ServiceOptionalAction extends BaseOptionalAction 
{
	
	public String insertOptional()throws Exception 
	{
	    Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_optional.getNome_optional()+" "+tmp_optional.getDescrizione_optional()+" "+tmp_optional.getSupplemento_optional());
			tmp_service.persist(tmp_optional,tmp_optional.getNome_optional());		
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
			tmp_service.deleteOptional(tmp_optional,tmp_optional.getNome_optional());
			
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
			tmp_optional=tmp_service.findByNome_optional(tmp_optional.getNome_optional());
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
