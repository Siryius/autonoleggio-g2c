package it.unisa.tsw2.actions.prenotazione;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.Preparable;

import it.unisa.tsw2.domain.*;
import it.unisa.tsw2.services.*;


@ParentPackage("enterPrenotazione")

@Results( value={
	    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/prenotazione/selectAssicurazione-input.jsp",name="success"),
	    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/prenotazione/selectVeicolo-input.jsp")
	})


public class SelectVeicoloAction extends BasePrenotazioneAction implements Preparable
{
	private Long id_veicolo;
	private VeicoloService serviceVeicolo;
	private AssicurazioneService serviceAssicurazione;
	private List<Assicurazione> assicurazioni_1;
	
	public void prepare()
	{
		serviceVeicolo=new VeicoloServiceImpl();
		serviceAssicurazione=new AssicurazioneServiceImpl();
		assicurazioni_1=serviceAssicurazione.findAllAssicurazione();
		
	}

	public Long getId_veicolo() {
		return id_veicolo;
	}

	public void setId_veicolo(Long idVeicolo) {
		id_veicolo = idVeicolo;
	}

	public VeicoloService getServiceVeicolo() {
		return serviceVeicolo;
	}

	public void setServiceVeicolo(VeicoloService serviceVeicolo) {
		this.serviceVeicolo = serviceVeicolo;
	}
	
    public String execute() throws Exception {
        prenotazione.setVeicolo(serviceVeicolo.findById(id_veicolo));
     
        return SUCCESS;
    }

	public AssicurazioneService getServiceAssicurazione() {
		return serviceAssicurazione;
	}

	public void setServiceAssicurazione(AssicurazioneService serviceAssicurazione) {
		this.serviceAssicurazione = serviceAssicurazione;
	}

	public List<Assicurazione> getAssicurazioni_1() {
		return assicurazioni_1;
	}

	public void setAssicurazioni_1(List<Assicurazione> assicurazioni) {
		this.assicurazioni_1 = assicurazioni;
	}
	
	

}
