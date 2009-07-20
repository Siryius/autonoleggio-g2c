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
	private Optional optional;
	private OptionalService service=new OptionalServiceImpl();
	
	public Optional getModel()
	{
		return optional;
	}
	
	public Optional getOptional() {
		return optional;
	}
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
	
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			optional = new Optional();
		}
		catch(Exception e)
		{
			System.out.println("BaseOptionalAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}
