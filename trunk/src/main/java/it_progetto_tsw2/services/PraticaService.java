package it_progetto_tsw2.services;

import java.util.List;

import it_progetto_tsw2_hibernate.Pratica;

public interface PraticaService 
{
	public Pratica findByNome_pratica(String nome_pratica);
	public List findAllPratica();
	public List findByExample(Pratica pratica);
	
	public boolean persist(Pratica pratica, String nome_pratica);
	public boolean deletePratica(Pratica pratica, String nome_pratica);
	public boolean updatePratica(Pratica pratica);

}
