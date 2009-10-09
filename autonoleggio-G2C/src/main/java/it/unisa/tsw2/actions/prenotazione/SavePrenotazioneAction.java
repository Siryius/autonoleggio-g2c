package it.unisa.tsw2.actions.prenotazione;

import it.unisa.tsw2.actions.veicolo.BaseVeicoloAction;
import it.unisa.tsw2.domain.*;
import it.unisa.tsw2.services.PrenotazioneService;
import it.unisa.tsw2.services.PrenotazioneServiceImpl;
import it.unisa.tsw2.services.AssicurazioneService;
import it.unisa.tsw2.services.AssicurazioneServiceImpl;
import it.unisa.tsw2.util.HibernateUtil;

import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.hibernate.Session;
import com.opensymphony.xwork2.Preparable;

@ParentPackage("enterPrenotazione")

@Result(type= ServletActionRedirectResult.class,value="completePrenotazione",name="success")
public class SavePrenotazioneAction extends BasePrenotazioneAction implements Preparable
{

	private PrenotazioneService servicePrenotazione;
	private AssicurazioneService serviceAssicurazione;
    private List<String> selectedAssicurazione;

    public void prepare()
    {
    	serviceAssicurazione=new AssicurazioneServiceImpl();
    	servicePrenotazione=new PrenotazioneServiceImpl();
    }

    public String execute() throws Exception 
    {
    	Assicurazione ass;
    	Assicurazione ass1=null;
    	
    	for( String nome_ass: selectedAssicurazione )
        {
        	System.out.println(nome_ass);
        	ass=serviceAssicurazione.findByNome_assicurazione(nome_ass);
        	ass1=serviceAssicurazione.findById(ass.getIdAssicurazione());
        	System.out.println("Nome "+ass.getNome());
        	prenotazione.getAssicurazioni().add(ass1);
        }
        
   		servicePrenotazione.persist(prenotazione, prenotazione.getIdPrenotazione());
      	
        return SUCCESS;
    }

	public PrenotazioneService getServicePrenotazione() {
		return servicePrenotazione;
	}

	public void setServicePrenotazione(PrenotazioneService servicePrenotazione) {
		this.servicePrenotazione = servicePrenotazione;
	}

	public AssicurazioneService getServiceAssicurazione() {
		return serviceAssicurazione;
	}

	public void setServiceAssicurazione(AssicurazioneService serviceAssicurazione) {
		this.serviceAssicurazione = serviceAssicurazione;
	}

	public List<String> getSelectedAssicurazione() {
		return selectedAssicurazione;
	}

	public void setSelectedAssicurazione(List<String> selectedAssicurazione) {
		this.selectedAssicurazione = selectedAssicurazione;
	}
}   