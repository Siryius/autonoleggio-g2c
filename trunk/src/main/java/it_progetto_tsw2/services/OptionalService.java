package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

import java.util.*;

public interface OptionalService 
{
	public Optional findByNome_optional(String nome_optional);
	public List findAllOptional();
	public List findByExample(Optional optional);
	
	public boolean persist(Optional optional, String nome_optional);
	public boolean deleteOptional(Optional optional, String nome_optional);
	public boolean updateOptional(Optional optional);
	
}
