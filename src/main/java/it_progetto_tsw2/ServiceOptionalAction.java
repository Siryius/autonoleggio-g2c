package it_progetto_tsw2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.*;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import it_progetto_tsw2_hibernate.*;
import it_progetto_tsw2.services.*;

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
			System.out.println("Errore in insertOptional");
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
			tmp_service.updateOptional(tmp_optional,tmp_optional.getNome_optional());
			
		}
		catch(Exception e)
		{
			System.out.println("Errore in updateOptional");
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
			System.out.println("Errore in deleteOptional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchOptional() throws Exception 
	{
		Optional tmp_optional=super.getOptional();
		OptionalService tmp_service=super.getService();
		try
		{
			System.out.println("Ciao");
			tmp_optional.setNome_optional("eee");
			System.out.println(tmp_optional.getNome_optional());
			tmp_optional=tmp_service.findByNome_optional(tmp_optional.getNome_optional());
		}
		catch(Exception e)
		{
			System.out.println("Errore in searchOptional");
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
