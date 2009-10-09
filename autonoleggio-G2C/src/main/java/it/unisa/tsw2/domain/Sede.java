package it.unisa.tsw2.domain;

import java.util.*;

public class Sede 
{
	private Long idSede;
	private String nome;
	private Indirizzo indirizzo;
	private Orario orari;
	
	private Set<Veicolo> veicoli=new HashSet();
	private Set<Sede> sedi=new HashSet();
	private Set<Promozione> promozioni=new HashSet();
	private Set<Prenotazione> prenotazioni=new HashSet();
	public Long getIdSede() {
		return idSede;
	}
	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Orario getOrari() {
		return orari;
	}
	public void setOrari(Orario orari) {
		this.orari = orari;
	}
	public Set<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(Set<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}
	public Set<Sede> getSedi() {
		return sedi;
	}
	public void setSedi(Set<Sede> sedi) {
		this.sedi = sedi;
	}
	public Set<Promozione> getPromozioni() {
		return promozioni;
	}
	public void setPromozioni(Set<Promozione> promozioni) {
		this.promozioni = promozioni;
	}
	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	

}
