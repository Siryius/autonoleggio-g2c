package it.unisa.tsw2.domain;

import java.io.Serializable;
import java.util.*;

import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Veicolo implements Serializable
{
	private Long idVeicolo;
	private String nome;
	private String descrizione;
	private String tipo;
	private int nposti;
	private int cilindrata;
	private boolean disponibile=true;
	private Date immatricolazione;
	private String cambio;
	private String alimentazione;
	private int portata;
	private int bagagliaio;
	private String targa;
	private java.sql.Blob  portrait;
	
	private Categoria categoria;
	private Sede sede;
	
	private Set<Prenotazione> prenotazioni;
	private Set<Pratica> pratiche;
	private Set<Optional> optionals;
	
	public Veicolo()
	{
		prenotazioni=new HashSet();
		pratiche=new HashSet();
		optionals=new HashSet();
	}
	
	public Long getIdVeicolo() {
		return idVeicolo;
	}
	public void setIdVeicolo(Long idVeicolo) {
		this.idVeicolo = idVeicolo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNposti() {
		return nposti;
	}
	public void setNposti(int nposti) {
		this.nposti = nposti;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public boolean getDisponibile() {
		return disponibile;
	}
	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	public Date getImmatricolazione() {
		return immatricolazione;
	}
	public void setImmatricolazione(Date immatricolazione) {
		this.immatricolazione = immatricolazione;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public int getPortata() {
		return portata;
	}
	public void setPortata(int portata) {
		this.portata = portata;
	}
	public int getBagagliaio() {
		return bagagliaio;
	}
	public void setBagagliaio(int bagagliaio) {
		this.bagagliaio = bagagliaio;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public Set<Pratica> getPratiche() {
		return pratiche;
	}
	public void setPratiche(Set<Pratica> pratiche) {
		this.pratiche = pratiche;
	}
	public Set<Optional> getOptionals() {
		return optionals;
	}
	public void setOptionals(Set<Optional> optionals) {
		this.optionals = optionals;
	}

	public java.sql.Blob getPortrait() {
		return portrait;
	}

	public void setPortrait(java.sql.Blob portrait) {
		this.portrait = portrait;
	}
	
	
}
