package it.unisa.tsw2.domain;

import java.util.*;

public class Promozione 
{
	private Long idPromozione;
	private String nome;
	private String descrizione;
	private Date dataInizio;
	private Date dataFine;
	private int sconto;
	private Set<Sede> sedi = new HashSet();
	public Long getIdPromozione() {
		return idPromozione;
	}
	public void setIdPromozione(Long idPromozione) {
		this.idPromozione = idPromozione;
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
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	public int getSconto() {
		return sconto;
	}
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	public Set<Sede> getSedi() {
		return sedi;
	}
	public void setSedi(Set<Sede> sedi) {
		this.sedi = sedi;
	}

	
}
