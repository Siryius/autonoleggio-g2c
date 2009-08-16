package it_progetto_tsw2_hibernate;

import java.util.*;

public class Prenotazione 
{
	private Long id_prenotazione;
	private Date partenza_prenotazione;
	private Date arrivo_prenotazione;
	private float oraPartenza_prenotazione;
	private float oraArrivo_prenotazione;

	private Noleggio noleggio;
	private Cliente cliente;
	private Veicolo veicolo;
	private Set<Sede> sedi=new HashSet();
	private Set<Assicurazione> assicurazioni=new HashSet();
	
	public Long getId_prenotazione() {
		return id_prenotazione;
	}
	public void setId_prenotazione(Long id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}
	public Date getPartenza_prenotazione() {
		return partenza_prenotazione;
	}
	public void setPartenza_prenotazione(Date partenza_prenotazione) {
		this.partenza_prenotazione = partenza_prenotazione;
	}
	public Date getArrivo_prenotazione() {
		return arrivo_prenotazione;
	}
	public void setArrivo_prenotazione(Date arrivo_prenotazione) {
		this.arrivo_prenotazione = arrivo_prenotazione;
	}
	public float getOraPartenza_prenotazione() {
		return oraPartenza_prenotazione;
	}
	public void setOraPartenza_prenotazione(float oraPartenza_prenotazione) {
		this.oraPartenza_prenotazione = oraPartenza_prenotazione;
	}
	public float getOraArrivo_prenotazione() {
		return oraArrivo_prenotazione;
	}
	public void setOraArrivo_prenotazione(float oraArrivo_prenotazione) {
		this.oraArrivo_prenotazione = oraArrivo_prenotazione;
	}
	
	public Veicolo getVeicolo() {
		return veicolo;
	}
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	public Set<Sede> getSedi() {
		return sedi;
	}
	public void setSedi(Set<Sede> sedi) {
		this.sedi = sedi;
	}
	public Set<Assicurazione> getAssicurazioni() {
		return assicurazioni;
	}
	public void setAssicurazioni(Set<Assicurazione> assicurazioni) {
		this.assicurazioni = assicurazioni;
	}
	public Noleggio getNoleggio() {
		return noleggio;
	}
	public void setNoleggio(Noleggio noleggio) {
		this.noleggio = noleggio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
