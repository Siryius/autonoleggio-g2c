package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.*;

public interface CartaClienteService 
{
	public CartaCliente findByLogin(String login);
	public void persist(CartaCliente cartaCliente,String login);
}
