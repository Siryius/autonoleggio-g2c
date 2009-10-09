package it.unisa.tsw2.actions.prenotazione;

import it.unisa.tsw2.domain.Prenotazione;
import it.unisa.tsw2.domain.Sede;
import it.unisa.tsw2.services.PrenotazioneService;
import it.unisa.tsw2.services.PrenotazioneServiceImpl;

import it.unisa.tsw2.services.SedeService;
import it.unisa.tsw2.services.SedeServiceImpl;

import java.util.List;
import java.util.*;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

@ParentPackage("enterPrenotazione")

@Results( value={
    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/prenotazione/selectSedi-input.jsp",name="success"),
    @Result(type= ServletDispatcherResult.class,name="input",value="/WEB-INF/jsp/prenotazione/enterPrenotazioneDetails-input.jsp")
})

@Validation
public class EnterPrenotazioneDetailsAction extends BasePrenotazioneAction implements Preparable
{
	int ora_partenza;
	int ora_arrivo;
	int minuti_partenza;
	int minuti_arrivo;
	
	private Date data_part;
	private Date data_arr;
	
	private List<Sede> sedi_pren;
	private SedeService serviceSede;
	
	public void prepare()
	{
		serviceSede=new SedeServiceImpl();
		System.out.println("Prepare Sede");
		prenotazione=new Prenotazione();
		sedi_pren = serviceSede.findAllSede();
		
		System.out.println(sedi_pren.size());
		System.out.println(sedi_pren.get(0).getNome());
	}
	
	
	//@Validations( visitorFields = { @VisitorFieldValidator(message = "Default message", fieldName= "model", appendPrefix = false) } )
	public String execute()throws Exception
	{
		try
		{
		
		Calendar data_partenza=new GregorianCalendar();
		data_partenza.setTime(data_part);
		data_partenza.set(Calendar.HOUR_OF_DAY, ora_partenza);
		data_partenza.set(Calendar.MINUTE,minuti_partenza);
		prenotazione.setPartenza(data_partenza.getTime());
		
		Calendar data_arrivo=new GregorianCalendar();
		data_arrivo.setTime(data_arr);
		data_arrivo.set(Calendar.HOUR_OF_DAY, ora_arrivo);
		data_arrivo.set(Calendar.MINUTE,minuti_arrivo);
		prenotazione.setArrivo(data_arrivo.getTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
	}


	public int getOra_partenza() {
		return ora_partenza;
	}


	public void setOra_partenza(int oraPartenza) {
		ora_partenza = oraPartenza;
	}


	public int getOra_arrivo() {
		return ora_arrivo;
	}


	public void setOra_arrivo(int oraArrivo) {
		ora_arrivo = oraArrivo;
	}


	public int getMinuti_partenza() {
		return minuti_partenza;
	}


	public void setMinuti_partenza(int minutiPartenza) {
		minuti_partenza = minutiPartenza;
	}


	public int getMinuti_arrivo() {
		return minuti_arrivo;
	}


	public void setMinuti_arrivo(int minutiArrivo) {
		minuti_arrivo = minutiArrivo;
	}


	public List<Sede> getSedi_pren() {
		return sedi_pren;
	}


	public void setSedi_pren(List<Sede> sedi) {
		this.sedi_pren = sedi;
	}


	public SedeService getServiceSede() {
		return serviceSede;
	}


	public void setServiceSede(SedeService serviceSede) {
		this.serviceSede = serviceSede;
	}


	public Date getData_part() {
		return data_part;
	}


	public void setData_part(Date dataPart) {
		data_part = dataPart;
	}


	public Date getData_arr() {
		return data_arr;
	}


	public void setData_arr(Date dataArr) {
		data_arr = dataArr;
	}




}

