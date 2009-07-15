package it_progetto_tsw2_hibernate;

import java.util.*;

public class Promozione 
{
	private Long id_promozione;
	private String nome_promozione;
	private String descrizione_promozione;
	private Date dataInizio_promozione;
	private Date dataFine_promozione;
	private int sconto_promozione;
	private Set<Sede> sedi = new HashSet();
	
	public Long getId_promozione() {
		return id_promozione;
	}
	public void setId_promozione(Long id_promozione) {
		this.id_promozione = id_promozione;
	}
	public String getNome_promozione() {
		return nome_promozione;
	}
	public void setNome_promozione(String nome_promozione) {
		this.nome_promozione = nome_promozione;
	}
	public String getDescrizione_promozione() {
		return descrizione_promozione;
	}
	public void setDescrizione_promozione(String descrizione_promozione) {
		this.descrizione_promozione = descrizione_promozione;
	}
	public Date getDataInizio_promozione() {
		return dataInizio_promozione;
	}
	public void setDataInizio_promozione(Date dataInizio_promozione) {
		this.dataInizio_promozione = dataInizio_promozione;
	}
	public Date getDataFine_promozione() {
		return dataFine_promozione;
	}
	public void setDataFine_promozione(Date dataFine_promozione) {
		this.dataFine_promozione = dataFine_promozione;
	}
	public int getSconto_promozione() {
		return sconto_promozione;
	}
	public void setSconto_promozione(int sconto_promozione) {
		this.sconto_promozione = sconto_promozione;
	}
	public Set<Sede> getSedi() {
		return sedi;
	}
	public void setSedi(Set<Sede> sedi) {
		this.sedi = sedi;
	}

}
