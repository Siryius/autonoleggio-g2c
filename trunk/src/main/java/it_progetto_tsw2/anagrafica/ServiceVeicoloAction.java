package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.services.VeicoloService;
import it_progetto_tsw2_hibernate.Veicolo;

import java.util.Iterator;
import java.util.List;

public class ServiceVeicoloAction extends BaseVeicoloAction 
{
	
	public String insertVeicolo()throws Exception 
	{
	    Veicolo tmp_veicolo=super.getVeicolo();
		VeicoloService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_veicolo.getNome_veicolo());
			tmp_service.persist(tmp_veicolo,tmp_veicolo.getNome_veicolo());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in insertVeicolo");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateVeicolo() throws Exception 
	{
	    Veicolo tmp_veicolo=super.getVeicolo();
		VeicoloService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateVeicolo(tmp_veicolo);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in updateVeicolo");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteVeicolo() throws Exception 
	{
		Veicolo tmp_veicolo=super.getVeicolo();
		VeicoloService tmp_service=super.getService();
		try
		{
			tmp_service.deleteVeicolo(tmp_veicolo,tmp_veicolo.getNome_veicolo());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in deleteVeicolo");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchVeicoloByNome_veicolo() throws Exception 
	{
		Veicolo tmp_veicolo=super.getVeicolo();
		VeicoloService tmp_service=super.getService();
		try
		{
			tmp_veicolo=tmp_service.findByNome_veicolo(tmp_veicolo.getNome_veicolo());
			super.setVeicolo(tmp_veicolo);
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in searchVeicoloByNome_veicolo");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchVeicoloByExample() throws Exception 
	{
		Veicolo tmp_veicolo=super.getVeicolo();
		VeicoloService tmp_service=super.getService();
		
		Iterator tmp_veicoloIterator=null;
		try
		{
			List optional_search=tmp_service.findByExample(tmp_veicolo);
			tmp_veicoloIterator=optional_search.iterator();
			super.setAllVeicoloIterator(tmp_veicoloIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in searchVeicoloByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllOptional()
	{
		try
		{
			VeicoloService tmp_service=super.getService();
			Iterator tmp_veicoloIterator=null;
			
			List result = tmp_service.findAllVeicolo();
			tmp_veicoloIterator=result.iterator();
			super.setAllVeicoloIterator(tmp_veicoloIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceVeicoloAction Errore in searchAllVeicolo");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}

