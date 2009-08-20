package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.Azienda;

import java.util.List;

public interface AziendaService 
{
	public Azienda findByCF_azienda(String nome_azienda);
	public List findAllAzienda();
	public List findByExample(Azienda Azienda);
	
	public boolean persist(Azienda azienda, String nome_azienda);
	public boolean deleteAzienda(Azienda azienda, String nome_azienda);
	public boolean updateAzienda(Azienda azienda);
	
	public Azienda findById(Long id_azienda);

}
