package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface VeicoloService
{
	public Veicolo findByNome_assicurazione(String nome_veicolo);
	public void persist(Veicolo veicolo,String nome_veicolo);
}
