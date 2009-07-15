package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface SedeService 
{
	public Sede findByNome_sede(String nome_sede);
	public void persist(Sede sede,String nome_sede);

}
