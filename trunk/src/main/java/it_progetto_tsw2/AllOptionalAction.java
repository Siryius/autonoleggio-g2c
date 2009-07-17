package it_progetto_tsw2;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

import com.opensymphony.xwork2.*;

import it_progetto_tsw2.services.OptionalService;
import it_progetto_tsw2_hibernate.*;
import util.HibernateUtil;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

public class AllOptionalAction extends BaseOptionalAction 
{
	private Iterator allOptionIterator;
	
    Optional optional=super.getOptional();
	OptionalService optional_service=super.getService();
	
	public String execute()
	{
		try
		{
			System.out.println("exec allOptional");
			List result = optional_service.findAllOptional();
        allOptionIterator=result.iterator();
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return SUCCESS;
	}

	public Iterator getAllOptionIterator() {
		return allOptionIterator;
	}

	public void setAllOptionIterator(Iterator allOptionIterator) {
		this.allOptionIterator = allOptionIterator;
	}

}
