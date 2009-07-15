package it_progetto_tsw2_hibernate;

import java.util.*;

public class Pratiche
{
	private Long id_pratiche;
	private String nome_pratiche;
	private String descrizione_pratiche;
	private Date scadenza_pratiche;
	
	private Veicolo veicolo;

	public Long getId_pratiche() {
		return id_pratiche;
	}

	public void setId_pratiche(Long id_pratiche) {
		this.id_pratiche = id_pratiche;
	}

	public String getNome_pratiche() {
		return nome_pratiche;
	}

	public void setNome_pratiche(String nome_pratiche) {
		this.nome_pratiche = nome_pratiche;
	}

	public String getDescrizione_pratiche() {
		return descrizione_pratiche;
	}

	public void setDescrizione_pratiche(String descrizione_pratiche) {
		this.descrizione_pratiche = descrizione_pratiche;
	}

	public Date getScadenza_pratiche() {
		return scadenza_pratiche;
	}

	public void setScadenza_pratiche(Date scadenza_pratiche) {
		this.scadenza_pratiche = scadenza_pratiche;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	

}
