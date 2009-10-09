package it.unisa.tsw2.domain;

public class Indirizzo 
{
	private String via;
	private String cap;
	private String ncivico;
	private String stato;
	private String citta;
	private String provincia;
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}

	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getNcivico() {
		return ncivico;
	}
	public void setNcivico(String ncivico) {
		this.ncivico = ncivico;
	}
	

}
