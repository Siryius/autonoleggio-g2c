package it_progetto_tsw2.actions;

import javax.servlet.http.HttpServletRequest;

import it_progetto_tsw2.actions.BaseAction;

import org.apache.struts2.interceptor.ServletRequestAware;

import it_progetto_tsw2_hibernate.Utente;
import it_progetto_tsw2.util.SecurityInterceptor;
import it_progetto_tsw2.services.UtenteService;
import it_progetto_tsw2.services.UtenteServiceImpl;

import org.apache.struts2.config.ParentPackage;

public class LogonAction extends BaseAction implements ServletRequestAware
{
	private String login;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public String execute() throws Exception {
		System.out.println("Login");
		System.out.println(login);
		System.out.println(password);
		service=new UtenteServiceImpl();
		Utente ut=service.login(login, password);
		System.out.println("Utente trovato :"+ut.getNome_utente());
		if(ut!=null){
			request.getSession(true).setAttribute("messaggio",
			null);
			request.getSession(true).setAttribute(SecurityInterceptor.USER_OBJECT,
					ut);
			System.out.println("Utente che entra "+ut.getCognome_utente());
			return SUCCESS;
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
}
