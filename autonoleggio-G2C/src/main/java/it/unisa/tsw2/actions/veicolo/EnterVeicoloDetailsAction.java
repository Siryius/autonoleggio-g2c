package it.unisa.tsw2.actions.veicolo;

import java.io.File;
import java.sql.Blob;
import java.util.*;

import javax.sql.rowset.serial.SerialBlob;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it.unisa.tsw2.domain.Categoria;
import it.unisa.tsw2.domain.Veicolo;
import it.unisa.tsw2.services.CategoriaService;
import it.unisa.tsw2.services.CategoriaServiceImpl;
import it.unisa.tsw2.util.Utils;

import com.opensymphony.xwork2.validator.annotations.*;

@ParentPackage("enterVeicolo")
@Results( value={
@Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/selectCategoria-input.jsp",name="success"),
@Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/veicolo/enterVeicoloDetails-input.jsp")
})
@Validation

public class EnterVeicoloDetailsAction extends BaseVeicoloAction implements Preparable
{
	
	private List<Categoria> categorie;
	private CategoriaService serviceCategoria;
	
	protected File upload;
	protected String uploadFileName;
	
	
	public void prepare()
	{
		serviceCategoria=new CategoriaServiceImpl();
		System.out.println("Prepare Veicolo");
		if(veicolo==null)
			veicolo=new Veicolo();
		categorie = serviceCategoria.findAllCategoria();
		
		System.out.println(uploadFileName);

	}
	
	
	//@Validations( visitorFields = { @VisitorFieldValidator(message = "Default message", fieldName= "veicolo", appendPrefix = false) } )
	public String execute()throws Exception
	{
		//System.out.println(veicolo_1.getNome_veicolo());
		try
		{
			if(uploadFileName!=null && !"".equals(uploadFileName)) 
			{
				byte[] img=Utils.getBytesFromFile(upload);
				Blob blob=new SerialBlob(img); 
				veicolo.setPortrait(blob);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error upload file");
			e.printStackTrace();
		}
		
		return SUCCESS;
	}



	public List<Categoria> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<Categoria> categorie) {
		this.categorie = categorie;
	}

	public CategoriaService getServiceCategoria() {
		return serviceCategoria;
	}

	public void setServiceCategoria(CategoriaService serviceCategoria) {
		this.serviceCategoria = serviceCategoria;
	}
	
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}	

}
