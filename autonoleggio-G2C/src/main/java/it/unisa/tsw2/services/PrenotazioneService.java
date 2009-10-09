package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Prenotazione;

import java.util.List;

public interface PrenotazioneService
{
	public List findAllPrenotazione();
	public List findByExample(Prenotazione prenotazione);
	
	public boolean persist(Prenotazione prenotazione, Long id_prenotazione);
	public boolean deletePrenotazione(Prenotazione prenotazione, Long id_prenotazione);
	public boolean updatePrenotazione(Prenotazione prenotazione);
	
	public Prenotazione findById(Long id_prenotazione);

}
