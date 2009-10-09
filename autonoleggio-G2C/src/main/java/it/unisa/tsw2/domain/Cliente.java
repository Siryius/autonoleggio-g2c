package it.unisa.tsw2.domain;

import java.util.*;
import com.opensymphony.xwork2.validator.annotations.*;

public class Cliente extends Utente
{
	private String nome;
	private String cognome;
	private String cartacredito;
	private String tipologia;
	private Date validita;

	private Set<Prenotazione> prenotazioni=new HashSet();

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

	public String getCartacredito() {
		return cartacredito;
	}

	public void setCartacredito(String cartacredito) {
		this.cartacredito = cartacredito;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public Date getValidita() {
		return validita;
	}

	public void setValidita(Date validita) {
		this.validita = validita;
	}

	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	
}
