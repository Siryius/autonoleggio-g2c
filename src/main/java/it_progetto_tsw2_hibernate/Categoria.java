package it_progetto_tsw2_hibernate;

import java.util.*;

public class Categoria 
{
	private Long id_categoria;
	private String nome_categoria;
	private String descrizione_categoria;
	private int tariffa_categoria;
	
	private Set<Veicolo> veicoli=new HashSet();
	
	public Long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNome_categoria() {
		return nome_categoria;
	}
	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}
	public String getDescrizione_categoria() {
		return descrizione_categoria;
	}
	public void setDescrizione_categoria(String descrizione_categoria) {
		this.descrizione_categoria = descrizione_categoria;
	}
	public int getTariffa_categoria() {
		return tariffa_categoria;
	}
	public void setTariffa_categoria(int tariffa_categoria) {
		this.tariffa_categoria = tariffa_categoria;
	}
	public Set<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(Set<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}
	
}
