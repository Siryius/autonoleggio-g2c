package it.unisa.tsw2.actions.prenotazione;

import it.unisa.tsw2.actions.veicolo.BaseVeicoloAction;
import it.unisa.tsw2.domain.Optional;
import it.unisa.tsw2.domain.Veicolo;
import it.unisa.tsw2.services.VeicoloService;
import it.unisa.tsw2.services.VeicoloServiceImpl;
import it.unisa.tsw2.services.SedeService;
import it.unisa.tsw2.services.SedeServiceImpl;

import java.util.Iterator;
import java.util.List;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

@ParentPackage("enterPrenotazione")

@Results( value={
	    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/prenotazione/selectVeicolo-input.jsp",name="success"),
	    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/prenotazione/selectSedi-input.jsp")
	})

public class SelectSediAction extends BasePrenotazioneAction implements Preparable
{
		private List<Veicolo> veicoli;
		private Iterator veicoliIterator=null;
		private Long selectedSede_partenza = null;
		private Long selectedSede_arrivo = null;
		
		private SedeService serviceSede;
		private VeicoloService serviceVeicolo;
		
		 public void prepare() throws Exception
		 {
			 try
			 {
				 serviceSede=new SedeServiceImpl();
				 serviceVeicolo=new VeicoloServiceImpl();
				 veicoli = serviceVeicolo.findAllVeicolo();
				 System.out.println(veicoli.size());
				 if(veicoli!=null && veicoli.size()!=0)
				 {
					 veicoliIterator=veicoli.iterator();
				 }
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		   
		 }

	    public String execute() throws Exception {
	        prenotazione.getSedi().add(serviceSede.findById(selectedSede_partenza));
	        prenotazione.getSedi().add(serviceSede.findById(selectedSede_arrivo));
	        return SUCCESS;
	    }

		public List<Veicolo> getVeicoli() {
			return veicoli;
		}

		public void setVeicoli(List<Veicolo> veicoli) {
			this.veicoli = veicoli;
		}

		public Long getSelectedSede_partenza() {
			return selectedSede_partenza;
		}

		public void setSelectedSede_partenza(Long selectedSedePartenza) {
			selectedSede_partenza = selectedSedePartenza;
		}

		public Long getSelectedSede_arrivo() {
			return selectedSede_arrivo;
		}

		public void setSelectedSede_arrivo(Long selectedSedeArrivo) {
			selectedSede_arrivo = selectedSedeArrivo;
		}

		public SedeService getServiceSede() {
			return serviceSede;
		}

		public void setServiceSede(SedeService serviceSede) {
			this.serviceSede = serviceSede;
		}

		public VeicoloService getServiceVeicolo() {
			return serviceVeicolo;
		}

		public void setServiceVeicolo(VeicoloService serviceVeicolo) {
			this.serviceVeicolo = serviceVeicolo;
		}

		public Iterator getVeicoliIterator() {
			return veicoliIterator;
		}

		public void setVeicoliIterator(Iterator veicoliIterator) {
			this.veicoliIterator = veicoliIterator;
		}

}

