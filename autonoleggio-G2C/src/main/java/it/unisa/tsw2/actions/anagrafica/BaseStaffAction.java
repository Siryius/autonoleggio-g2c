package it.unisa.tsw2.actions.anagrafica;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Staff;
import it.unisa.tsw2.services.StaffService;
import it.unisa.tsw2.services.StaffServiceImpl;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BaseStaffAction extends BaseAction implements ModelDriven<Staff> , Preparable
{
	private Staff staff;
	private StaffService service;
	private Iterator allStaffIterator;
	
	
	public Staff getModel()
	{
		return staff;
	}
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public void setStaffService(StaffService service) {
		this.service = service;
	}
	
	public StaffService getService()
	{
		return service;
	}
	
	public Iterator getAllStaffIterator() {
		return allStaffIterator;
	}

	
	public void setAllStaffIterator(Iterator allStaffIterator) {
		this.allStaffIterator = allStaffIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			staff = new Staff();
			service = new StaffServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseStaffAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}
