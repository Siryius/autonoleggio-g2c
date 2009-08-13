package it_progetto_tsw2;

import it_progetto_tsw2.services.AssicurazioneService;
import it_progetto_tsw2_hibernate.Assicurazione;

import java.util.Iterator;
import java.util.List;

public class ServiceAssicurazioneAction extends BaseAssicurazioneAction 
{
	
	public String insertOptional()throws Exception 
	{
	    Assicurazione tmp_assicurazione=super.getAssicurazione();
	    AssicurazioneService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_assicurazione.getNome_assicurazione());
			tmp_service.persist(tmp_assicurazione,tmp_assicurazione.getNome_assicurazione());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in insertAssicurazione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateAssicurazione() throws Exception 
	{
		Assicurazione tmp_ass=super.getAssicurazione();
		AssicurazioneService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateAssicurazione(tmp_ass);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in updateAssicurazione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteAssicurazione() throws Exception 
	{
		Assicurazione tmp_ass=super.getAssicurazione();
		AssicurazioneService tmp_service=super.getService();
		try
		{
			tmp_service.deleteAssicurazione(tmp_ass,tmp_ass.getNome_assicurazione());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in deleteAssicurazione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAssicurazioneByNome_optional() throws Exception 
	{
		Assicurazione tmp_ass=super.getAssicurazione();
		AssicurazioneService tmp_service=super.getService();
		try
		{
			tmp_ass=tmp_service.findByNome_assicurazione(tmp_ass.getNome_assicurazione());
			super.setAssicurazione(tmp_ass);
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in searchAssicurazioneByNome_assicurazione");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAssicurazioneByExample() throws Exception 
	{
		Assicurazione tmp_ass=super.getAssicurazione();
		AssicurazioneService tmp_service=super.getService();
		
		Iterator tmp_assicurazioneIterator=null;
		try
		{
			List assicurazione_search=tmp_service.findByExample(tmp_ass);
			tmp_assicurazioneIterator=assicurazione_search.iterator();
			super.setAllAssicurazioneIterator(tmp_assicurazioneIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in searchAssicurazioneByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllAssicurazione()
	{
		try
		{
			AssicurazioneService tmp_service=super.getService();
			Iterator tmp_assicurazioneIterator=null;
			
			List result = tmp_service.findAllAssicurazione();
			tmp_assicurazioneIterator=result.iterator();
			super.setAllAssicurazioneIterator(tmp_assicurazioneIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceAssicurazioneAction Errore in searchAllAssicurazione");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}

