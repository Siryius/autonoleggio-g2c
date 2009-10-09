package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.*;

import java.util.*;

public interface OptionalService 
{
	public Optional findByNome_optional(String nome_optional);
	public List findAllOptional();
	public List findByExample(Optional optional);
	
	public boolean persist(Optional optional, String nome_optional);
	public boolean deleteOptional(Optional optional, String nome_optional);
	public boolean updateOptional(Optional optional);
	
	public Optional findById(Long id_sede);
	
}
