package it_progetto_tsw2_hibernate;

public class Assicurazione 
{
	private Long id_assicurazione;
	private String nome_assicurazione;
	private String descrizione_assicurazione;
	private int costo_assicurazione;
	private Prenotazione prenotazione;
	
	public Long getId_assicurazione() {
		return id_assicurazione;
	}
	public void setId_assicurazione(Long id_assicurazione) {
		this.id_assicurazione = id_assicurazione;
	}
	public String getNome_assicurazione() {
		return nome_assicurazione;
	}
	public void setNome_assicurazione(String nome_assicurazione) {
		this.nome_assicurazione = nome_assicurazione;
	}
	public String getDescrizione_assicurazione() {
		return descrizione_assicurazione;
	}
	public void setDescrizione_assicurazione(String descrizione_assicurazione) {
		this.descrizione_assicurazione = descrizione_assicurazione;
	}
	public int getCosto_assicurazione() {
		return costo_assicurazione;
	}
	public void setCosto_assicurazione(int costo_assicurazione) {
		this.costo_assicurazione = costo_assicurazione;
	}
	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

}
