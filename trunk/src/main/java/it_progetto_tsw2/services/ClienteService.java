package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.Cliente;

import java.util.List;

public interface ClienteService 
{
	public Cliente findByCF_cliente(String CF_cliente);
	public List findAllCliente();
	public List findByExample(Cliente cliente);
	
	public boolean persist(Cliente cliente, String CF_cliente);
	public boolean deleteCliente(Cliente cliente, String CF_cliente);
	public boolean updateCliente(Cliente cliente);

}
