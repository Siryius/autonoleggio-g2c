package it.unisa.tsw2.domain;

import java.util.*;

public class Categoria 
{
	private Long idCategoria;
	private String nome;
	private String descrizione;
	private int tariffa;
	
	private Set<Veicolo> veicoli;
	
	public Categoria()
	{
		veicoli=new HashSet();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getTariffa() {
		return tariffa;
	}

	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

	public Set<Veicolo> getVeicoli() {
		return veicoli;
	}

	public void setVeicoli(Set<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}


	public Long getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
	
}
