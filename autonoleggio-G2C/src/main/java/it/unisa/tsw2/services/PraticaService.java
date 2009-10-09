package it.unisa.tsw2.services;

import java.util.List;

import it.unisa.tsw2.domain.Pratica;

public interface PraticaService 
{
	public Pratica findByNome_pratica(String nome_pratica);
	public List findAllPratica();
	public List findByExample(Pratica pratica);
	
	public boolean persist(Pratica pratica, String nome_pratica);
	public boolean deletePratica(Pratica pratica, String nome_pratica);
	public boolean updatePratica(Pratica pratica);

}
