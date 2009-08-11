package it_progetto_tsw2.services;

import java.util.ArrayList;
import java.util.List;

import it_progetto_tsw2_hibernate.*;

public interface CategoriaService 
{
	public Categoria findByNome_categoria(String nome_categoria);
	public List findByCriteria(ArrayList criterias);
	public List findAllCategoria();
	public List findByExample(Categoria categoria);
	
	public boolean persist(Categoria categoria, String nome_categoria);
	public boolean deleteCategoria(Categoria categoria, String nome_categoria);
	public boolean updateCategoria(Categoria categoria);
}
