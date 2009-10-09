package it.unisa.tsw2.services;

import java.util.ArrayList;
import java.util.List;

import it.unisa.tsw2.domain.Promozione;

public interface PromozioneService
{
	public Promozione findByNome_promozione(String nome_promozione);
	public List findAllPromozione();
	public List findByExample(Promozione promozione);
	
	public boolean persist(Promozione promozione, String nome_promozione);
	public boolean deletePromozione(Promozione promozione, String nome_promozione);
	public boolean updatePromozione(Promozione promozione);

}
