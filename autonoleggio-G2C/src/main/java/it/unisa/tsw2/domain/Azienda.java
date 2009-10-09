package it.unisa.tsw2.domain;

public class Azienda extends Utente
{
	private String ragionesociale;
	private String partitaiva;
	private Indirizzo indirizzoOperativo;
	public String getRagionesociale() {
		return ragionesociale;
	}
	public void setRagionesociale(String ragionesociale) {
		this.ragionesociale = ragionesociale;
	}
	public String getPartitaiva() {
		return partitaiva;
	}
	public void setPartitaiva(String partitaiva) {
		this.partitaiva = partitaiva;
	}
	public Indirizzo getIndirizzoOperativo() {
		return indirizzoOperativo;
	}
	public void setIndirizzoOperativo(Indirizzo indirizzoOperativo) {
		this.indirizzoOperativo = indirizzoOperativo;
	}
	
	
	

}
