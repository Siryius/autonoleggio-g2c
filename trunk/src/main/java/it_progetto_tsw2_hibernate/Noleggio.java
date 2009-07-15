package it_progetto_tsw2_hibernate;



public class Noleggio 
{
	private Long id_noleggio;
	private float costo_noleggio;
	private Prenotazione prenotazione;
	
	public Long getId_noleggio() {
		return id_noleggio;
	}
	public void setId_noleggio(Long id_noleggio) {
		this.id_noleggio = id_noleggio;
	}
	public float getCosto_noleggio() {
		return costo_noleggio;
	}
	public void setCosto_noleggio(float costo_noleggio) {
		this.costo_noleggio = costo_noleggio;
	}
	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

}
