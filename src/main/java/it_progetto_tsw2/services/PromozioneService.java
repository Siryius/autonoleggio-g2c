package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface PromozioneService
{
	public Promozione findByNome_promozione(String nome_promozione);
	public void persist(Promozione promozione,String nome_promozione);

}
