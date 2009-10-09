package it.unisa.tsw2.actions.veicolo;

import it.unisa.tsw2.actions.veicolo.BaseVeicoloAction;
import it.unisa.tsw2.domain.Optional;
import it.unisa.tsw2.domain.Veicolo;


import org.hibernate.Hibernate;
import org.hibernate.Session;

import org.hibernate.*;
import it.unisa.tsw2.util.*;
import it.unisa.tsw2.services.VeicoloService;
import it.unisa.tsw2.services.VeicoloServiceImpl;
import it.unisa.tsw2.services.OptionalService;
import it.unisa.tsw2.services.OptionalServiceImpl;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.hibernate.Session;

import com.opensymphony.xwork2.validator.annotations.ExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;

import java.sql.Blob;
import java.util.*;

import javax.sql.rowset.serial.SerialBlob;

@ParentPackage("enterVeicolo")

@Result(type= ServletActionRedirectResult.class,value="completeVeicolo",name="success")
public class SaveVeicoloAction extends BaseVeicoloAction {

	private VeicoloService serviceVeicolo=new VeicoloServiceImpl();
	private OptionalService serviceOptional=new OptionalServiceImpl();
    private List<String> selectedOptional;



    public String execute() throws Exception 
    {
    	Veicolo veicolo=super.getVeicolo();
    	Optional opt;
    	Optional opt1=null;
    	Session session;
    	HibernateUtil util=null;
    
		
    	if(selectedOptional!=null)
    	{
    		for( String nome_opt: selectedOptional )
    		{
    			System.out.println(nome_opt);
    			opt=serviceOptional.findByNome_optional(nome_opt);
    			opt1=serviceOptional.findById(opt.getIdOptional());
    			System.out.println("Nome "+opt.getNome());
    			veicolo.getOptionals().add(opt);
    		}
        }
        

   		serviceVeicolo.persist(veicolo, veicolo.getNome());
      	
        return SUCCESS;
    }

	public VeicoloService getServiceVeicolo() {
		return serviceVeicolo;
	}


	public void setServiceVeicolo(VeicoloService serviceVeicolo) {
		this.serviceVeicolo = serviceVeicolo;
	}


	public OptionalService getServiceOptional() {
		return serviceOptional;
	}


	public void setServiceOptional(OptionalService serviceOptional) {
		this.serviceOptional = serviceOptional;
	}


	public List<String> getSelectedOptional() {
		return selectedOptional;
	}


	public void setSelectedOptional(List<String> selectedOptional) {
		this.selectedOptional = selectedOptional;
	}


}
