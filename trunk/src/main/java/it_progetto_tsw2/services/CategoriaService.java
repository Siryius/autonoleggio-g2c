package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface CategoriaService 
{
	public CartaCliente findByNome_categoria(String nome_categoria);
	public void persist(Categoria categoria,String nome_categoria);
}
