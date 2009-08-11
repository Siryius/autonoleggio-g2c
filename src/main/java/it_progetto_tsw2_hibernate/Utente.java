package it_progetto_tsw2_hibernate;

public class Utente 
{
	private Long id_utente;
	private String CF_utente;
	private String nome_utente;
	private String cognome_utente;
	private String login_utente;
	private String password_utente;
	private Indirizzo indirizzo_utente;
	
	
	public Long getId_utente() {
		return id_utente;
	}
	public void setId_utente(Long id_utente) {
		this.id_utente = id_utente;
	}
	public String getCF_utente() {
		return CF_utente;
	}
	public void setCF_utente(String cf_utente) {
		CF_utente = cf_utente;
	}
	public String getNome_utente() {
		return nome_utente;
	}
	public void setNome_utente(String nome_utente) {
		this.nome_utente = nome_utente;
	}
	public String getCognome_utente() {
		return cognome_utente;
	}
	public void setCognome_utente(String cognome_utente) {
		this.cognome_utente = cognome_utente;
	}
	public Indirizzo getIndirizzo_utente() {
		return indirizzo_utente;
	}
	public void setIndirizzo_utente(Indirizzo indirizzo_utente) {
		this.indirizzo_utente = indirizzo_utente;
	}
	public String getLogin_utente() {
		return login_utente;
	}
	public void setLogin_utente(String loginUtente) {
		login_utente = loginUtente;
	}
	public String getPassword_utente() {
		return password_utente;
	}
	public void setPassword_utente(String passwordUtente) {
		password_utente = passwordUtente;
	}



}
