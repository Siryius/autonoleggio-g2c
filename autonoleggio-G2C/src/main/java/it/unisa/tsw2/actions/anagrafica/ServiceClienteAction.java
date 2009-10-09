package it.unisa.tsw2.actions.anagrafica;

import com.opensymphony.xwork2.validator.annotations.*;


import it.unisa.tsw2.domain.Cliente;
import it.unisa.tsw2.services.ClienteService;

import java.util.Iterator;
import java.util.List;


public class ServiceClienteAction extends BaseClienteAction 
{
	public String insertCliente()throws Exception 
	{
	    Cliente tmp_cliente=super.getCliente();
		ClienteService tmp_service=super.getService();
		try
		{
			System.out.println(tmp_cliente.getCodicefiscale());
			tmp_service.persist(tmp_cliente,tmp_cliente.getCodicefiscale());		
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in insertCliente");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateCliente() throws Exception 
	{
	    Cliente tmp_cliente=super.getCliente();
		ClienteService tmp_service=super.getService();
		try
		{
			System.out.println("Update");
			tmp_service.updateCliente(tmp_cliente);
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in updateCliente");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteCliente() throws Exception 
	{
		Cliente tmp_cliente=super.getCliente();
		ClienteService tmp_service=super.getService();
		try
		{
			tmp_service.deleteCliente(tmp_cliente,tmp_cliente.getCodicefiscale());
			
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in deleteCliente");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchClienteByCF_cliente() throws Exception 
	{
		Cliente tmp_cliente=super.getCliente();
		ClienteService tmp_service=super.getService();
		try
		{
			tmp_cliente=tmp_service.findByCF_cliente(tmp_cliente.getCodicefiscale());
			super.setCliente(tmp_cliente);
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in searchClienteByNome_cliente");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchClienteByExample() throws Exception 
	{
		Cliente tmp_cliente=super.getCliente();
		ClienteService tmp_service=super.getService();
		
		Iterator tmp_clienteIterator=null;
		try
		{
			List cliente_search=tmp_service.findByExample(tmp_cliente);
			tmp_clienteIterator=cliente_search.iterator();
			super.setAllClienteIterator(tmp_clienteIterator);
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in searchClienteByExample");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchAllCliente()
	{
		try
		{
			ClienteService tmp_service=super.getService();
			Iterator tmp_clienteIterator=null;
			
			List result = tmp_service.findAllCliente();
			tmp_clienteIterator=result.iterator();
			super.setAllClienteIterator(tmp_clienteIterator);
        
        /*for (Iterator i= result.iterator();i.hasNext();)
        {
			Optional theEventTemp = (Optional)i.next();
        }*/
		}
		catch(Exception e)
		{
			System.out.println("ServiceClienteAction Errore in searchAllCliente");
			e.printStackTrace();
		}
	
		return SUCCESS;
	}
}
