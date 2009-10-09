package it.unisa.tsw2.domain;

import java.util.*;

public class Assicurazione 
{
	private Long idAssicurazione;
	private String nome;
	private String descrizione;
	private int costo;
	private Set<Prenotazione> prenotazioni;
	
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
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public Long getIdAssicurazione() {
		return idAssicurazione;
	}
	public void setIdAssicurazione(Long idAssicurazione) {
		this.idAssicurazione = idAssicurazione;
	}
	
	

}
