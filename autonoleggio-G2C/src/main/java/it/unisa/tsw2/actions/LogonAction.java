package it.unisa.tsw2.actions;

import javax.servlet.http.HttpServletRequest;

import it.unisa.tsw2.actions.BaseAction;
import it.unisa.tsw2.domain.Utente;

import org.apache.struts2.interceptor.ServletRequestAware;

import it.unisa.tsw2.util.SecurityInterceptor;
import it.unisa.tsw2.services.UtenteService;
import it.unisa.tsw2.services.UtenteServiceImpl;

import org.apache.struts2.config.ParentPackage;

public class LogonAction extends BaseAction implements ServletRequestAware
{
	private String username;
	private String password;
	
	protected UtenteService service=new UtenteServiceImpl();
	private HttpServletRequest request;
	private String messaggio;
	public static final String FAILURE = "failure";

	public void setUserService(UtenteService service) {
		this.service = service;
	}

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public String execute() throws Exception {
		try
		{
		System.out.println("Login");
		System.out.println(username);
		System.out.println(password);
		service=new UtenteServiceImpl();
		Utente ut=service.login(username, password);
		System.out.println(ut.getUsername());
		if(ut!=null){
			request.getSession(true).setAttribute("messaggio",
			null);
			request.getSession(true).setAttribute(SecurityInterceptor.USER_OBJECT,
					ut);
			System.out.println();
			if(ut.getTipo().equals("AM"))
				return "amministratore";
			else
				if(ut.getTipo().equals("ST"))
					return "staff";
				else
					if(ut.getTipo().equals("CL"))
						return "cliente";
		}
		else{
			System.out.println("errore");
			request.getSession(true).setAttribute("messaggio",
					"Autenticazione fallita");
			this.messaggio="Error";
			 return ERROR;
		}

		// } else {
		// addActionError(getText("auth.failed"));
		// return FAILURE;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
