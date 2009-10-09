package it.unisa.tsw2.services;

import java.util.List;

import it.unisa.tsw2.domain.Assicurazione;
import it.unisa.tsw2.domain.Prenotazione;

public interface AssicurazioneService 
{
	public Assicurazione findByNome_assicurazione(String nome_assicurazione);
	public List findAllAssicurazione();
	public List findByExample(Assicurazione assicurazione);
	
	public boolean persist(Assicurazione assicurazione, String nome_assicurazione);
	public boolean deleteAssicurazione(Assicurazione assicurazione, String nome_assicurazione);
	public boolean updateAssicurazione(Assicurazione assicurazione);
	
	public Assicurazione findById(Long id_prenotazione);
}
