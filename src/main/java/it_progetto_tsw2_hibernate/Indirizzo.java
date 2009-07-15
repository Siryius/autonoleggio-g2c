package it_progetto_tsw2_hibernate;

public class Indirizzo 
{
	private String via;
	private String CAP;
	private String n_civico;
	private String stato;
	private String citta;
	private String provincia;
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCAP() {
		return CAP;
	}
	public void setCAP(String cap) {
		CAP = cap;
	}
	public String getN_civico() {
		return n_civico;
	}
	public void setN_civico(String n_civico) {
		this.n_civico = n_civico;
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
	

}
