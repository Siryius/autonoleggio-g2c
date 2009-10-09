package it.unisa.tsw2.domain;

import java.util.*;

public class Prenotazione 
{
	private Long idPrenotazione;
	private Date partenza;
	private Date arrivo;


	private Noleggio noleggio;
	private Cliente cliente;
	private Veicolo veicolo;
	private Set<Sede> sedi;
	private Set<Assicurazione> assicurazioni;
	public Long getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(Long idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public Date getPartenza() {
		return partenza;
	}
	public void setPartenza(Date partenza) {
		this.partenza = partenza;
	}
	public Date getArrivo() {
		return arrivo;
	}
	public void setArrivo(Date arrivo) {
		this.arrivo = arrivo;
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
	
	
}
