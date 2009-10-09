package it.unisa.tsw2.domain;



public class Noleggio 
{
	private Long idNoleggio;
	private float costo;
	private Prenotazione prenotazione;
	

	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public Long getIdNoleggio() {
		return idNoleggio;
	}
	public void setIdNoleggio(Long idNoleggio) {
		this.idNoleggio = idNoleggio;
	}

}
