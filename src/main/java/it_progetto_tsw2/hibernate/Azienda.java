package it_progetto_tsw2_hibernate;

public class Azienda extends Utente
{
	private String ragionesociale_azienda;
	private String partitaiva_azienda;
	private Indirizzo indirizzo_operativo;
	public String getRagionesociale_azienda() {
		return ragionesociale_azienda;
	}
	public void setRagionesociale_azienda(String ragionesocialeAzienda) {
		ragionesociale_azienda = ragionesocialeAzienda;
	}
	public String getPartitaiva_azienda() {
		return partitaiva_azienda;
	}
	public void setPartitaiva_azienda(String partitaivaAzienda) {
		partitaiva_azienda = partitaivaAzienda;
	}
	public Indirizzo getIndirizzo_operativo() {
		return indirizzo_operativo;
	}
	public void setIndirizzo_operativo(Indirizzo indirizzoOperativo) {
		indirizzo_operativo = indirizzoOperativo;
	}
	
	

}
