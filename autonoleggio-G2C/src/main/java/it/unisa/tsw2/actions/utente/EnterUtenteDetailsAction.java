package it.unisa.tsw2.actions.utente;

import org.apache.struts2.config.Results;
import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.webwork.dispatcher.FlashResult;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.*;
import com.opensymphony.xwork2.validator.validators.VisitorFieldValidator;
import com.opensymphony.xwork2.validator.DelegatingValidatorContext;
import it.unisa.tsw2.services.UtenteService;
import it.unisa.tsw2.services.UtenteServiceImpl;
import it.unisa.tsw2.domain.Utente;
import it.unisa.tsw2.domain.Azienda;
import it.unisa.tsw2.domain.Cliente;

@ParentPackage("enterUtente")
@Results( value={
    @Result(type= ServletActionRedirectResult.class,value="completeUtente",name="success"),
    @Result(type= FlashResult.class,name="selectType",value="/utente/flashedSelectUtenteType.action"),
    @Result(type= ServletDispatcherResult.class,name="cliente",value="/WEB-INF/jsp/utente/enterUtenteDetails-cliente.jsp"),
    @Result(type= ServletDispatcherResult.class,name="azienda",value="/WEB-INF/jsp/utente/enterUtenteDetails-azienda.jsp"),
    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/utente/selectUtenteType-input.jsp")
})

@Validation
public class EnterUtenteDetailsAction extends BaseUtenteAction implements Preparable {

    private String setup;
    private String typeClass;
    private Object utente;

    private UtenteService service;

    @SuppressWarnings("unchecked")
	public void prepare() throws Exception {
    	service=new UtenteServiceImpl();
        if( typeClass!=null ) {
            Class clazz = Class.forName(typeClass);
            utente = clazz.newInstance();
        }
    }

    public void setUtenteService(UtenteService service) {
        this.service = service;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }

    public Azienda getAzienda() {
        return (Azienda)utente;
    }

    public void setAzienda( Azienda utente ) {
        this.utente = utente;
    }

    public Cliente getCliente() {
        return (Cliente)utente;
    }

    public void setCliente( Cliente utente ) {
        this.utente = utente;
    }

    public String execute() throws Exception {

    	//System.out.println("Fuori"+((Utente)utente).getCodicefiscale());
        if( typeClass==null )
        {
        	System.out.println("typeClass null");
            addFieldError("typeClass",getText("validate.selectType",new String[]{}));
            return "selectType";

        } 
        else 
        {

            String objType = typeClass.substring(typeClass.lastIndexOf(".")+1).toLowerCase();
            if( setup!=null )
            {
            	System.out.println("setup !null");
                return objType;
            } 
            else 
            {
            	System.out.println("setup null");
                /*VisitorFieldValidator validator = new VisitorFieldValidator();
                validator.setAppendPrefix(true);
                validator.setValidatorContext(new DelegatingValidatorContext(this));
                validator.setFieldName(objType);
                validator.validate(this);
				
                if( hasFieldErrors() )
                {
                	System.out.println("error");
                    return objType;
                }*/
            }
        	System.out.println(((Utente)utente).getCodicefiscale());
            service.persist((Utente)utente,((Utente)utente).getCodicefiscale());
       
            return SUCCESS;
        }
    }
}
