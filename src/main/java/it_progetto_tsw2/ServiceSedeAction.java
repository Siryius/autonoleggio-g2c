package it_progetto_tsw2;

import org.apache.struts2.interceptor.*;

import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import it_progetto_tsw2_hibernate.Sede;
import it_progetto_tsw2.services.SedeService;

import java.util.*;

public class ServiceSedeAction extends BaseSedeAction 
{
	
	public String insertSede()throws Exception 
	{
	    Sede tmp_sede=super.getSede();
		SedeService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_sede.getNome_sede());
			tmp_service.persist(tmp_sede,tmp_sede.getNome_sede());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in insertSede");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateSede() throws Exception 
	{
	    Sede tmp_sede=super.getSede();
		SedeService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateSede(tmp_sede);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in updateSede");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteSede() throws Exception 
	{
		Sede tmp_sede=super.getSede();
		SedeService tmp_service=super.getService();
		try
		{
			tmp_service.deleteSede(tmp_sede,tmp_sede.getNome_sede());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in deleteSede");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchSedeByNome_sede() throws Exception 
	{
		Sede tmp_sede=super.getSede();
		SedeService tmp_service=super.getService();
		try
		{
			tmp_sede=tmp_service.findByNome_sede(tmp_sede.getNome_sede());
			super.setSede(tmp_sede);
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in searchSedeByNome_sede");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchSedeByExample() throws Exception 
	{
		Sede tmp_sede=super.getSede();
		SedeService tmp_service=super.getService();
		
		Iterator tmp_sedeIterator=null;
		try
		{
			List sede_search=tmp_service.findByExample(tmp_sede);
			tmp_sedeIterator=sede_search.iterator();
			super.setAllSedeIterator(tmp_sedeIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in searchSedeByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllSede()
	{
		try
		{
			SedeService tmp_service=super.getService();
			Iterator tmp_sedeIterator=null;
			
			List result = tmp_service.findAllSede();
			tmp_sedeIterator=result.iterator();
			super.setAllSedeIterator(tmp_sedeIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceSedeAction Errore in searchAllSede");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}

