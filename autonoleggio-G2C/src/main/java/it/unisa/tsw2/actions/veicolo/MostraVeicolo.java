package it.unisa.tsw2.actions.veicolo;

import java.util.Iterator;
import java.util.List;

public class MostraVeicolo extends BaseVeicoloAction
{
	private String id;
	
	
	public String execute() throws Exception 
	{

		return SUCCESS;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}
