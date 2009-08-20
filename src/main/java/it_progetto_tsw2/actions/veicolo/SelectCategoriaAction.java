package it_progetto_tsw2.actions.veicolo;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import it_progetto_tsw2_hibernate.Categoria;
import it_progetto_tsw2_hibernate.Veicolo;
import it_progetto_tsw2.actions.veicolo.BaseVeicoloAction;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import it_progetto_tsw2.services.*;

@ParentPackage("enterVeicolo")
@Result(type= ServletActionRedirectResult.class,value="selectCategoria")
@Validation
public class SelectCategoriaAction extends BaseVeicoloAction implements Preparable
{
	 private List<Categoria> categorie;
	 private Long selectedCategoria = null;
	 private CategoriaService serviceCategoria;
	 
	 public void prepare() throws Exception
	 {
		 serviceCategoria=new CategoriaServiceImpl();
	     categorie = serviceCategoria.findAllCategoria();
	 }

	public List<Categoria> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<Categoria> categorie) {
		this.categorie = categorie;
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

    public String input() {
        return INPUT;
    }

    public String execute() throws Exception {
    	Veicolo veicolo=super.getVeicolo();
        veicolo.setCategoria(serviceCategoria.findById(selectedCategoria));
        return SUCCESS;
    }

	

}
