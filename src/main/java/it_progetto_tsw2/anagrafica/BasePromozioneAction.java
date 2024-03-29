package it_progetto_tsw2.anagrafica;

import it_progetto_tsw2.action.BaseAction;
import it_progetto_tsw2.services.PromozioneService;
import it_progetto_tsw2.services.PromozioneServiceImpl;
import it_progetto_tsw2_hibernate.Promozione;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.config.ParentPackage;
@ParentPackage("base-package")
public class BasePromozioneAction extends BaseAction implements ModelDriven<Promozione> , Preparable
{
	private Promozione promozione;
	private PromozioneService service;
	private Iterator allPromozioneIterator;
	
	
	public Promozione getModel()
	{
		return promozione;
	}
	
	public Promozione getPromozione() {
		return promozione;
	}
	public void setPromozione(Promozione promozione) {
		this.promozione = promozione;
	}
	
	public void setOptionalService(PromozioneService service) {
		this.service = service;
	}
	
	public PromozioneService getService()
	{
		return service;
	}
	
	public Iterator getAllPromozioneIterator() {
		return allPromozioneIterator;
	}

	
	public void setAllPromozioneIterator(Iterator allPromozioneIterator) {
		this.allPromozioneIterator = allPromozioneIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			promozione = new Promozione();
			service = new PromozioneServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BasePromozioneAction prepare");
			e.printStackTrace();
		}
    }
		
}