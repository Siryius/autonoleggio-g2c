package it_progetto_tsw2_hibernate;

import java.util.*;

public class Veicolo 
{
	private Long id_veicolo;
	private String nome_veicolo;
	private String descrizione_veicolo;
	private String tipo_veicolo;
	private int nPosti_veicolo;
	private int cilindrata_veicolo;
	private boolean disponibile_veicolo;
	private Date immatricolazione_veicolo;
	private String cambio_veicolo;
	private String alimentazione_veicolo;
	private int portata_veicolo;
	private int bagagliaio_veicolo;
	private String targa_veicolo;
	
	private Categoria categoria;
	private Sede sede;
	
	private Set<Prenotazione> prenotazioni=new HashSet();
	private Set<Pratica> pratiche=new HashSet();
	private Set<Optional> optionals=new HashSet();
	
	public Long getId_veicolo() {
		return id_veicolo;
	}
	public void setId_veicolo(Long id_veicolo) {
		this.id_veicolo = id_veicolo;
	}
	public String getNome_veicolo() {
		return nome_veicolo;
	}
	public void setNome_veicolo(String nome_veicolo) {
		this.nome_veicolo = nome_veicolo;
	}
	public String getDescrizione_veicolo() {
		return descrizione_veicolo;
	}
	public void setDescrizione_veicolo(String descrizione_veicolo) {
		this.descrizione_veicolo = descrizione_veicolo;
	}
	public String getTipo_veicolo() {
		return tipo_veicolo;
	}
	public void setTipo_veicolo(String tipo_veicolo) {
		this.tipo_veicolo = tipo_veicolo;
	}
	public int getnPosti_veicolo() {
		return nPosti_veicolo;
	}
	public void setnPosti_veicolo(int posti_veicolo) {
		nPosti_veicolo = posti_veicolo;
	}
	public int getCilindrata_veicolo() {
		return cilindrata_veicolo;
	}
	public void setCilindrata_veicolo(int cilindrata_veicolo) {
		this.cilindrata_veicolo = cilindrata_veicolo;
	}
	public boolean isDisponibile_veicolo() {
		return disponibile_veicolo;
	}
	public void setDisponibile_veicolo(boolean disponibile_veicolo) {
		this.disponibile_veicolo = disponibile_veicolo;
	}
	public Date getImmatricolazione_veicolo() {
		return immatricolazione_veicolo;
	}
	public void setImmatricolazione_veicolo(Date immatricolazione_veicolo) {
		this.immatricolazione_veicolo = immatricolazione_veicolo;
	}
	public String getCambio_veicolo() {
		return cambio_veicolo;
	}
	public void setCambio_veicolo(String cambio_veicolo) {
		this.cambio_veicolo = cambio_veicolo;
	}
	public String getAlimentazione_veicolo() {
		return alimentazione_veicolo;
	}
	public void setAlimentazione_veicolo(String alimentazione_veicolo) {
		this.alimentazione_veicolo = alimentazione_veicolo;
	}
	public int getPortata_veicolo() {
		return portata_veicolo;
	}
	public void setPortata_veicolo(int portata_veicolo) {
		this.portata_veicolo = portata_veicolo;
	}
	public int getBagagliaio_veicolo() {
		return bagagliaio_veicolo;
	}
	public void setBagagliaio_veicolo(int bagagliaio_veicolo) {
		this.bagagliaio_veicolo = bagagliaio_veicolo;
	}
	public String getTarga_veicolo() {
		return targa_veicolo;
	}
	public void setTarga_veicolo(String targa_veicolo) {
		this.targa_veicolo = targa_veicolo;
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

}
