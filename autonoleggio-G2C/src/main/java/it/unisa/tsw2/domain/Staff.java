package it.unisa.tsw2.domain;

public class Staff extends Utente
{
	private String nome;
	private String cognome;
	private String competenza;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCompetenza() {
		return competenza;
	}
	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}
	

}
