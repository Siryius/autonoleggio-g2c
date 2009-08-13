package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.Cliente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;

public class ClienteServiceImpl implements ClienteService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public ClienteServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Cliente findByCF_cliente(String CF_cliente)
	{
		Cliente cliente=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Cliente.class);
			criteria.add(Restrictions.eq("CF_utente",CF_cliente));
			cliente=(Cliente)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore ClienteServiceImpl findByNome_cliente");
			e.printStackTrace();
		}
		return cliente;
	}
	
	/*public List findByCriteria(ArrayList criterias)
	{
		Optional optional=null;
		Criteria criteria;
		List list=null;
		try
		{
			if(criterias!=null)
			{
				session = util.getSessionFactory().getCurrentSession();	
				session.beginTransaction();
				criteria= session.createCriteria(Optional.class);
				for (int i=0;i<criterias.size();++i)
				{
					QueryCriteria criteria_query=(QueryCriteria)criterias.get(i);
					if(criteria_query.getAttributo().equals("supplemento_optional"))
					{
						
						float suppl_optional=Float.parseFloat(criteria_query.getValue());
						criteria.add(Restrictions.eq(criteria_query.getAttributo(),suppl_optional));
					}
					else
						criteria.add(Restrictions.eq(criteria_query.getAttributo(),criteria_query.getValue()));
				}	
				
				list=criteria.list();
				System.out.println("Ok query \n");
				session.getTransaction().commit();
				//System.out.println(optional.getDescrizione_optional());
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Errore OptionalServiceImpl findByCriteria");
			e.printStackTrace();
		}
		return list;	
	}*/
	
	public List findByExample(Cliente cliente)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Cliente.class);
			criteria.add( Example.create(cliente).excludeZeroes() );
			List result = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore ClienteServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllCliente()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Cliente.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore ClienteServiceImpl findAllCliente");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Cliente cliente,String CF_cliente)
	{
		boolean ris=true;
		try
		{
			Cliente temp_cliente=null;
			temp_cliente=findByCF_cliente(CF_cliente);
			if(temp_cliente==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(CF_cliente,cliente);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore ClienteServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteCliente(Cliente cliente,String CF_cliente)
	{
		boolean ris=true;
		try
		{

			Cliente tmp_cliente=this.findByCF_cliente(CF_cliente);
			if(tmp_cliente!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_cliente);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore ClienteServiceImpl deleteCliente");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateCliente(Cliente cliente)
	{
		boolean ris=true;
		try
		{
			Cliente tmp_cliente=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_cliente=(Cliente)session.get(Cliente.class, cliente.getId_utente());
			if(tmp_cliente!=null)
			{
				tmp_cliente.setCF_utente(cliente.getCF_utente());
				tmp_cliente.setNome_utente(cliente.getNome_utente());
				tmp_cliente.setCognome_utente(cliente.getCognome_utente());
				tmp_cliente.setLogin_utente(cliente.getLogin_utente());
				tmp_cliente.setPassword_utente(cliente.getPassword_utente());
				tmp_cliente.setIndirizzo_utente(cliente.getIndirizzo_utente());
				tmp_cliente.setCartaCredito_cliente(cliente.getCartaCredito_cliente());
				tmp_cliente.setTipologia_cliente(cliente.getTipologia_cliente());
				tmp_cliente.setValidita_cliente(cliente.getValidita_cliente());
				
				session.saveOrUpdate(tmp_cliente);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore OptionalServiceImpl updateOptional");
			e.printStackTrace();
		}
		
		return ris;
	}
	



}

