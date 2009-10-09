package it.unisa.tsw2.actions.veicolo;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;


import it.unisa.tsw2.domain.Categoria;
import it.unisa.tsw2.domain.Sede;
import it.unisa.tsw2.domain.Veicolo;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import it.unisa.tsw2.services.*;

@ParentPackage("enterVeicolo")

@Results( value={
	    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/selectSede-input.jsp",name="success"),
	    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/veicolo/selectCategoria-input.jsp")
	})
public class SelectCategoriaAction extends BaseVeicoloAction implements Preparable
{
	 private List<Sede> sedi;
	 private Long selectedCategoria = null;
	 private CategoriaService serviceCategoria;
	 private SedeService serviceSede;
	 
	 public void prepare() throws Exception
	 {
		 serviceCategoria=new CategoriaServiceImpl();
		 serviceSede=new SedeServiceImpl();
		 sedi = serviceSede.findAllSede();
		 System.out.println("Sedi "+sedi.size());
		 
		 if(veicolo.getPortrait()!=null)
			 System.out.println("Cè l'immagine");
		 else
			 System.out.println("Non Cè l'immagine");
	 }

	public Long getSelectedCategoria() {
		return selectedCategoria;
	}

	@RequiredFieldValidator(message = "Default message", key = "validation.selectLocation")
	public void setSelectedCategoria(Long selectedCategoria) {
		this.selectedCategoria = selectedCategoria;
	}

	public CategoriaService getServiceCategoria() {
		return serviceCategoria;
	}

	public void setServiceCategoria(CategoriaService service) {
		this.serviceCategoria = service;
	}


    public String execute() throws Exception
    {
    	Veicolo veicolo=super.getVeicolo();
    	Categoria categoria=serviceCategoria.findById(selectedCategoria);
        veicolo.setCategoria(categoria);
        categoria.getVeicoli().add(veicolo);
        return SUCCESS;
    }

	public List<Sede> getSedi() {
		return sedi;
	}

	public void setSedi(List<Sede> sedi) {
		this.sedi = sedi;
	}

	public SedeService getServiceSede() {
		return serviceSede;
	}

	public void setServiceSede(SedeService serviceSede) {
		this.serviceSede = serviceSede;
	}

	

}
