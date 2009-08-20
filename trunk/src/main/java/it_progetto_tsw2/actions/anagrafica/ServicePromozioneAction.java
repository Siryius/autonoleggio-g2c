package it_progetto_tsw2.actions.anagrafica;

import it_progetto_tsw2.services.PromozioneService;
import it_progetto_tsw2_hibernate.Promozione;

import java.util.Iterator;
import java.util.List;

public class ServicePromozioneAction extends BasePromozioneAction 
{
	
	public String insertPromozione()throws Exception 
	{
	    Promozione tmp_promozione=super.getPromozione();
		PromozioneService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_promozione.getNome_promozione());
			tmp_service.persist(tmp_promozione,tmp_promozione.getNome_promozione());		
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in insertPromozione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updatePromozione() throws Exception 
	{
	    Promozione tmp_promozione=super.getPromozione();
		PromozioneService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updatePromozione(tmp_promozione);
			
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in updatePromozione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deletePromozione() throws Exception 
	{
		Promozione tmp_promozione=super.getPromozione();
		PromozioneService tmp_service=super.getService();
		try
		{
			tmp_service.deletePromozione(tmp_promozione,tmp_promozione.getNome_promozione());
			
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in deletePromozione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchPromozioneByNome_promozione() throws Exception 
	{
		Promozione tmp_promozione=super.getPromozione();
		PromozioneService tmp_service=super.getService();
		try
		{
			tmp_promozione=tmp_service.findByNome_promozione(tmp_promozione.getNome_promozione());
			super.setPromozione(tmp_promozione);
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in searchPromozioneByNome_promozione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchOptionalByExample() throws Exception 
	{
		Promozione tmp_promozione=super.getPromozione();
		PromozioneService tmp_service=super.getService();
		
		Iterator tmp_promozioneIterator=null;
		try
		{
			List promozione_search=tmp_service.findByExample(tmp_promozione);
			tmp_promozioneIterator=promozione_search.iterator();
			super.setAllPromozioneIterator(tmp_promozioneIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in searchPromozioneByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllPromozione()
	{
		try
		{
			PromozioneService tmp_service=super.getService();
			Iterator tmp_promozioneIterator=null;
			
			List result = tmp_service.findAllPromozione();
			tmp_promozioneIterator=result.iterator();
			super.setAllPromozioneIterator(tmp_promozioneIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServicePromozioneAction Errore in searchAllPromozione");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}
