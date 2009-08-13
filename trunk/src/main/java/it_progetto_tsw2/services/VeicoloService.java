package it_progetto_tsw2.services;

import java.util.List;

import it_progetto_tsw2_hibernate.Veicolo;;

public interface VeicoloService
{
	public Veicolo findByNome_veicolo(String nome_veicolo);
	public List findAllVeicolo();
	public List findByExample(Veicolo veicolo);
	
	public boolean persist(Veicolo veicolo, String nome_veicolo);
	public boolean deleteVeicolo(Veicolo veicolo, String nome_veicolo);
	public boolean updateVeicolo(Veicolo veicolo);
}
