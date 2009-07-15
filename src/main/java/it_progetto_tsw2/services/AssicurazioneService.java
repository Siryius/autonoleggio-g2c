package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface AssicurazioneService 
{
	public Assicurazione findByNome_assicurazione(String nome_assicurazione);
	public void persist(Assicurazione assicurazione,String nome_assicurazione);
}
