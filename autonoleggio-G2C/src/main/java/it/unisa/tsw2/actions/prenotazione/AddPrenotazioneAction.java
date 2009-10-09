package it.unisa.tsw2.actions.prenotazione;

import org.apache.struts2.config.ParentPackage;
import java.util.*;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@ParentPackage("enterPrenotazione")

@Results( value={
    @Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/prenotazione/enterPrenotazioneDetails-input.jsp",name="success")
})

public class AddPrenotazioneAction extends BasePrenotazioneAction
{
	private Date data_part;
	private Date data_arr;
	
	public String execute()throws Exception
	{
		return SUCCESS;
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
