package it_progetto_tsw2;

import org.hibernate.Session;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it_progetto_tsw2_hibernate.*;
import it_progetto_tsw2.services.*;
import util.HibernateUtil;
import java.util.*;

public class BaseOptionalAction extends BaseAction implements ModelDriven<Optional> , Preparable
{
	protected Optional optional;
	
	protected OptionalService service;
	
	public Optional getModel()
	{
		return optional;
	}
	/*
	public Optional getOptional() {
		return optional;
	}
	public void setOptional(Optional optional) {
		this.optional = optional;
	}*/
	
	
	public void setOptionalService(OptionalService service) {
		this.service = service;
	}
	
	/*
	public OptionalService getService()
	{
		return service;
	}
	*/
	
	
	public void prepare() throws Exception 
	{	
		optional = new Optional(); 
    }
	
	
	
}
