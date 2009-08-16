package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.services.StaffService;
import it_progetto_tsw2_hibernate.Staff;

import java.util.Iterator;
import java.util.List;

public class ServiceStaffAction extends BaseStaffAction 
{
	
	public String insertStaff()throws Exception 
	{
	    Staff tmp_staff=super.getStaff();
		StaffService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_staff.getCF_utente());
			tmp_service.persist(tmp_staff,tmp_staff.getCF_utente());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in insertStaff");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateStaff() throws Exception 
	{
	    Staff tmp_staff=super.getStaff();
		StaffService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateStaff(tmp_staff);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in updateStaff");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteStaff() throws Exception 
	{
		Staff tmp_staff=super.getStaff();
		StaffService tmp_service=super.getService();
		try
		{
			tmp_service.deleteStaff(tmp_staff,tmp_staff.getCF_utente());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in deleteStaff");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchStaffByCF_staff() throws Exception 
	{
		Staff tmp_staff=super.getStaff();
		StaffService tmp_service=super.getService();
		try
		{
			tmp_staff=tmp_service.findByCF_staff(tmp_staff.getCF_utente());
			super.setStaff(tmp_staff);
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in searchStaffByNome_staff");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchStaffByExample() throws Exception 
	{
		Staff tmp_staff=super.getStaff();
		StaffService tmp_service=super.getService();
		
		Iterator tmp_staffIterator=null;
		try
		{
			List staff_search=tmp_service.findByExample(tmp_staff);
			tmp_staffIterator=staff_search.iterator();
			super.setAllStaffIterator(tmp_staffIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in searchStaffByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllStaff()
	{
		try
		{
			StaffService tmp_service=super.getService();
			Iterator tmp_staffIterator=null;
			
			List result = tmp_service.findAllStaff();
			tmp_staffIterator=result.iterator();
			super.setAllStaffIterator(tmp_staffIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceStaffAction Errore in searchAllStaff");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}
