package it_progetto_tsw2_hibernate;

import java.util.*;

public class Cliente extends Utente
{
	private String cartaCredito_cliente;
	private String tipologia_cliente;
	private Date validita_cliente;

	private Set<Prenotazione> prenotazioni=new HashSet();

	public String getCartaCredito_cliente() {
		return cartaCredito_cliente;
	}

	public void setCartaCredito_cliente(String cartaCreditoCliente) {
		cartaCredito_cliente = cartaCreditoCliente;
	}

	public String getTipologia_cliente() {
		return tipologia_cliente;
	}

	public void setTipologia_cliente(String tipologiaCliente) {
		tipologia_cliente = tipologiaCliente;
	}

	public Date getValidita_cliente() {
		return validita_cliente;
	}

	public void setValidita_cliente(Date validitaCliente) {
		validita_cliente = validitaCliente;
	}

	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	};
	
}
