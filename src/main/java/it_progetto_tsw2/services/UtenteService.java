package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface UtenteService 
{
	public Utente findByCF_utente(String CF_utente);
	public void persist(Utente utente,String CF_utente);
}
