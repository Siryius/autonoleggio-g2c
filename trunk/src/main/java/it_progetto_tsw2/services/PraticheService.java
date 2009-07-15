package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface PraticheService 
{
	public Pratiche findByNome_pratiche(String nome_pratiche);
	public void persist(Pratiche pratiche,String nome_pratiche);

}
