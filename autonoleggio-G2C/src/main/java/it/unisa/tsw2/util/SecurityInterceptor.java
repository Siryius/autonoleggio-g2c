package it.unisa.tsw2.util;

import it.unisa.tsw2.domain.Utente;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.TextProvider;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecurityInterceptor extends AbstractInterceptor 
{
	public static final String USER_OBJECT = "user";
	public static final String LOGIN_RESULT = "authenticate";
	public static final String ERROR_MSG_KEY = "Username o password errati";
	public static final String DEFAULT_MSG = "This page requires registration, please logon or register";
	private List<String> requiresAuthentication;
	private String messaggio="";

	public void setRequiresAuthentication(String authenticate) 
	{
		this.requiresAuthentication = stringToList(authenticate);
	}

	public String intercept(ActionInvocation invocation) throws Exception
	{
		System.out.println("Chiamato interceptor");
		Utente user = (Utente) invocation.getInvocationContext().getSession().get(USER_OBJECT);
		Object action = invocation.getAction();
		boolean annotated = action.getClass().isAnnotationPresent(RequiresAuthentication.class);
		if (user == null
				&& (annotated || requiresAuthentication(invocation.getProxy().getNamespace()))) {
			if (action instanceof ValidationAware) {
				String msg = action instanceof TextProvider ? ((TextProvider) action)
						.getText(ERROR_MSG_KEY)
						: DEFAULT_MSG;
				((ValidationAware) action).addActionError(msg);
				messaggio="Pagine protette che necessitano l'autenticazione";
			}
			return LOGIN_RESULT;
		}
		return invocation.invoke();
	}

	private List<String> stringToList(String val) {
		// changes a comma-delimited String list into a List of Strings
		String [] tmp=val.split(",");
		List<String> result=new ArrayList<String>();
		for(int i=0;i<tmp.length;i++)
			result.add(tmp[i]);
		return result;
	}

	private boolean requiresAuthentication(String namespace) {
		// returns true when the parameter matches
		// an element of requiresAuthentication
		return requiresAuthentication.contains(namespace);
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}


}