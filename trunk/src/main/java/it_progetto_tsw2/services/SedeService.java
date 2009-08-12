package it_progetto_tsw2.services;

import java.util.ArrayList;
import java.util.List;

import it_progetto_tsw2_hibernate.*;

public interface SedeService 
{
	public Sede findByNome_sede(String nome_sede);
	public List findAllSede();
	public List findByExample(Sede sede);
	
	public boolean persist(Sede sede, String nome_sede);
	public boolean deleteSede(Sede sede, String nome_sede);
	public boolean updateSede(Sede sede);
	
}
