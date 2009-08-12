package it_progetto_tsw2_hibernate;

import java.util.*;

public class Pratica
{
	private Long id_pratica;
	private String nome_pratica;
	private String descrizione_pratica;
	private Date scadenza_pratica;
	
	private Veicolo veicolo;

	public Long getId_pratica() {
		return id_pratica;
	}

	public void setId_pratica(Long id_pratica) {
		this.id_pratica = id_pratica;
	}

	public String getNome_pratica() {
		return nome_pratica;
	}

	public void setNome_pratica(String nome_pratica) {
		this.nome_pratica = nome_pratica;
	}

	public String getDescrizione_pratica() {
		return descrizione_pratica;
	}

	public void setDescrizione_pratica(String descrizione_pratica) {
		this.descrizione_pratica = descrizione_pratica;
	}

	public Date getScadenza_pratica() {
		return scadenza_pratica;
	}

	public void setScadenza_pratica(Date scadenza_pratica) {
		this.scadenza_pratica = scadenza_pratica;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	

}
