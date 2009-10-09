package it.unisa.tsw2.services;

import java.util.List;

import it.unisa.tsw2.domain.Veicolo;

public interface VeicoloService
{
	public Veicolo findByNome_veicolo(String nome_veicolo);
	public List findAllVeicolo();
	public List findByExample(Veicolo veicolo, String campoOrd, String ord);
	
	public boolean persist(Veicolo veicolo, String nome_veicolo);
	public boolean deleteVeicolo(Veicolo veicolo, String nome_veicolo);
	public boolean updateVeicolo(Veicolo veicolo);
	public Veicolo findById(Long id_veicolo);
}
