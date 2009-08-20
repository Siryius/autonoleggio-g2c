package it_progetto_tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import com.opensymphony.webwork.dispatcher.FlashResult;
import com.opensymphony.xwork2.Preparable;

import it_progetto_tsw2.services.CategoriaService;
import it_progetto_tsw2.services.CategoriaServiceImpl;
import it_progetto_tsw2_hibernate.*;

@ParentPackage("enterVeicolo")
@Results( value={
    @Result(type= ServletActionRedirectResult.class,value="selectCategoria",params={"method","input"})
})    
public class EnterCategoriaDetailsAction extends BaseVeicoloAction implements Preparable
{
	private Categoria categoria;
	private CategoriaService serviceCategoria;
	
	public void prepare()
	{
		serviceCategoria=new CategoriaServiceImpl();
		categoria=new Categoria();
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
        serviceCategoria.persist(categoria, categoria.getNome_categoria());
        return SUCCESS;
	}

}
