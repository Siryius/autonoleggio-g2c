package it_progetto_tsw2;

import it_progetto_tsw2.services.ClienteService;
import it_progetto_tsw2.services.ClienteServiceImpl;
import it_progetto_tsw2_hibernate.Cliente;

import java.util.Iterator;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class BaseClienteAction extends BaseAction implements ModelDriven<Cliente> , Preparable
{
	private Cliente cliente;
	private ClienteService service;
	private Iterator allClienteIterator;
	
	
	public Cliente getModel()
	{
		return cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setOptionalService(ClienteService service) {
		this.service = service;
	}
	
	public ClienteService getService()
	{
		return service;
	}
	
	public Iterator getAllClienteIterator() {
		return allClienteIterator;
	}

	
	public void setAllClienteIterator(Iterator allClienteIterator) {
		this.allClienteIterator = allClienteIterator;
	}
	
	public void prepare() throws Exception 
	{	
		try
		{
			System.out.println("prepare \n");
			cliente = new Cliente();
			service = new ClienteServiceImpl();
		}
		catch(Exception e)
		{
			System.out.println("BaseClienteAction prepare");
			e.printStackTrace();
		}
    }
	
	
	
}
