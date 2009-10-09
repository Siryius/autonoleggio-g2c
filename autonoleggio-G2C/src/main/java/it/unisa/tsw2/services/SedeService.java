package it.unisa.tsw2.services;

import java.util.ArrayList;
import java.util.List;

import it.unisa.tsw2.domain.*;

public interface SedeService 
{
	public Sede findByNome_sede(String nome_sede);
	public List findAllSede();
	public List findByExample(Sede sede);
	
	public boolean persist(Sede sede, String nome_sede);
	public boolean deleteSede(Sede sede, String nome_sede);
	public boolean updateSede(Sede sede);
	
	public Sede findById(Long id_sede);
	
}
