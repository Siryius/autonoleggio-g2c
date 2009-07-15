package it_progetto_tsw2_hibernate;

import java.util.*;

public class CartaCliente 
{
	private Long id_cartaCliente;
	private String cartaCredito_cartaCliente;
	private String login;
	private String password;
	private String tipologia_cartaCliente;
	private Date validita_cartaCliente;
	private Utente utente;
	
	public Long getId_cartaCliente() {
		return id_cartaCliente;
	}
	public void setId_cartaCliente(Long id_cartaCliente) {
		this.id_cartaCliente = id_cartaCliente;
	}
	public String getCartaCredito_cartaCliente() {
		return cartaCredito_cartaCliente;
	}
	public void setCartaCredito_cartaCliente(String cartaCredito) {
		this.cartaCredito_cartaCliente = cartaCredito;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipologia_cartaCliente() {
		return tipologia_cartaCliente;
	}
	public void setTipologia_cartaCliente(String tipologia_cartaCliente) {
		this.tipologia_cartaCliente = tipologia_cartaCliente;
	}
	public Date getValidita_cartaCliente() {
		return validita_cartaCliente;
	}
	public void setValidita_cartaCliente(Date validita_cartaCliente) {
		this.validita_cartaCliente = validita_cartaCliente;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}
