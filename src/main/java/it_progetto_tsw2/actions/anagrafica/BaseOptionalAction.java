package it_progetto_tsw2.actions.anagrafica;


import it_progetto_tsw2.actions.BaseAction;

import org.hibernate.Session;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it_progetto_tsw2.services.*;
import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.*;

import java.util.*;
import org.apache.struts2.config.ParentPackage;
import com.opensymphony.xwork2.validator.annotations.*;

@ParentPackage("base-package")
//@Validation
public class BaseOptionalAction extends BaseAction implements ModelDriven<Optional> , Preparable
{
	protected Optional optional;
	private OptionalService service;
	private Iterator allOptionIterator;
	
	
	public Optional getModel()
	{
		return optional;
	}
	
	public Optional getOptional() {
		return optional;
	}
	
	//@Validations( visitorFields = { @VisitorFieldValidator(message = "", fieldName= "optional", appendPrefix = true) } )
	public void setOptional(Optional optional) {
		this.optional = optional;
	}
	
	public void setOptionalService(OptionalService service) {
		this.service = service;
	}
	
	public OptionalService getService()
	{
		return service;
	}
	
	public Iterator getAllOptionIterator() {
		return allOptionIterator;
	}

	
	public void setAllOptionIterator(Iterator allOptionIterator) {
		this.allOptionIterator = allOptionIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			optional = new Optional();
			service = new OptionalServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseOptionalAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}
