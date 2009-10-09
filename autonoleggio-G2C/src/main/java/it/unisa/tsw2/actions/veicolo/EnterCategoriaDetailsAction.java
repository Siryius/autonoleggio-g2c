package it.unisa.tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import com.opensymphony.webwork.dispatcher.FlashResult;
import com.opensymphony.xwork2.Preparable;

import it.unisa.tsw2.domain.*;
import it.unisa.tsw2.services.CategoriaService;
import it.unisa.tsw2.services.CategoriaServiceImpl;
import java.util.*;

@ParentPackage("enterVeicolo")
@Results( value={
    @Result(type= ServletActionRedirectResult.class,value="selectCategoria",params={"method","input"})
})    
public class EnterCategoriaDetailsAction extends BaseVeicoloAction implements Preparable
{
	private List<Categoria> categorie;
	private Categoria categoria;
	private CategoriaService serviceCategoria;
	Long selectedCategoria;
	
	public void prepare()
	{
		serviceCategoria=new CategoriaServiceImpl();
		categoria=new Categoria();
		categorie=(List<Categoria>)serviceCategoria.findAllCategoria();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public CategoriaService getServiceCategoria() {
		return serviceCategoria;
	}

	public void setServiceCategoria(CategoriaService service) {
		this.serviceCategoria = service;
	}
	
	public String execute()
	{
		Veicolo veicolo=super.getVeicolo();
        veicolo.setCategoria(serviceCategoria.findById(selectedCategoria));
        return SUCCESS;
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

	public void setSelectedCategoria(Long selectedCategoria) {
		this.selectedCategoria = selectedCategoria;
	}

}
