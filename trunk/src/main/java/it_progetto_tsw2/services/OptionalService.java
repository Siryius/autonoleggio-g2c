package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;
import java.util.*;

public interface OptionalService 
{
	public Optional findByNome_optional(String nome_optional);
	public void persist(Optional optional, String nome_optional);
	public void deleteOptional(Optional optional, String nome_optional);
	public void updateOptional(Optional optional, String nome_optional);
	public List findAllOptional();
}
