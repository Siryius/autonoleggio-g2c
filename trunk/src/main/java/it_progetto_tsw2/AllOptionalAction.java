package it_progetto_tsw2;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

import com.opensymphony.xwork2.*;
import it_progetto_tsw2_hibernate.*;
import util.HibernateUtil;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

public class AllOptionalAction extends BaseOptionalAction implements ServletRequestAware 
{
	private Iterator allOptionIterator;
	
	private HttpServletRequest request;

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		request = httpServletRequest;
	}
	
	public String execute() throws Exception 
	{
		
		List result = super.service.findAllOptional();
        allOptionIterator=result.iterator();
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
	
		return SUCCESS;
	}

	public Iterator getAllOptionIterator() {
		return allOptionIterator;
	}

	public void setAllOptionIterator(Iterator allOptionIterator) {
		this.allOptionIterator = allOptionIterator;
	}

}
