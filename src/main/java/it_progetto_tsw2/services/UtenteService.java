package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.Utente;

import java.util.List;

public interface UtenteService 
{
	public Utente findByCF_utente(String CF_utente);
	public List findAllUtente();
	public List findByExample(Utente utente);
	
	public boolean persist(Utente utente, String CF_utente);
	public boolean deleteUtente(Utente utente, String CF_utente);
	public boolean updateUtente(Utente utente);
	
	public Utente login (String login,String password);

}
