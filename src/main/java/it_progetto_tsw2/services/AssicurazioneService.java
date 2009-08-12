package it_progetto_tsw2.services;

import java.util.List;

import it_progetto_tsw2_hibernate.Assicurazione;;

public interface AssicurazioneService 
{
	public Assicurazione findByNome_assicurazione(String nome_assicurazione);
	public List findAllAssicurazione();
	public List findByExample(Assicurazione assicurazione);
	
	public boolean persist(Assicurazione assicurazione, String nome_assicurazione);
	public boolean deleteAssicurazione(Assicurazione assicurazione, String nome_assicurazione);
	public boolean updateAssicurazione(Assicurazione assicurazione);
}
