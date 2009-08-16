package it_progetto_tsw2_hibernate;

import java.util.*;

public class Sede 
{
	private Long id_sede;
	private String nome_sede;
	private Indirizzo indirizzo_sede;
	private Orario orari_sede;
	
	private Set<Veicolo> veicoli=new HashSet();
	private Set<Sede> sedi=new HashSet();
	private Set<Promozione> promozioni=new HashSet();
	private Set<Prenotazione> prenotazioni=new HashSet();
	
	
	public Long getId_sede() {
		return id_sede;
	}
	public void setId_sede(Long id_sede) {
		this.id_sede = id_sede;
	}
	public String getNome_sede() {
		return nome_sede;
	}
	public void setNome_sede(String nome_sede) {
		this.nome_sede = nome_sede;
	}
	public Indirizzo getIndirizzo_sede() {
		return indirizzo_sede;
	}
	public void setIndirizzo_sede(Indirizzo indirizzo_sede) {
		this.indirizzo_sede = indirizzo_sede;
	}
	public Orario getOrari_sede() {
		return orari_sede;
	}
	public void setOrari_sede(Orario orari_sede) {
		this.orari_sede = orari_sede;
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
