package it_progetto_tsw2.actions;

import javax.servlet.http.HttpServletRequest;

import it_progetto_tsw2.actions.BaseAction;

import org.apache.struts2.interceptor.ServletRequestAware;

import it_progetto_tsw2.util.RequiresAuthentication;


public class LogoffAction extends BaseAction implements ServletRequestAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	
	
	
	public String execute() throws Exception {
		request.getSession().invalidate();
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request=arg0;
	}
	
	
}
