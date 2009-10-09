package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Staff;

import java.util.List;

public interface StaffService 
{
	public Staff findByCF_staff(String CF_cliente);
	public List findAllStaff();
	public List findByExample(Staff staff);
	
	public boolean persist(Staff staff, String CF_staff);
	public boolean deleteStaff(Staff staff, String CF_staff);
	public boolean updateStaff(Staff staff);

}
