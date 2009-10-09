package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Cliente;
import it.unisa.tsw2.util.HibernateUtil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


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
			System.out.println("Errore ClienteServiceImpl findByCF_cliente");
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
			criteria.add( Example.create(cliente).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
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
			Cliente tmp_cliente=null;
			tmp_cliente=findByCF_cliente(CF_cliente);
			if(tmp_cliente==null)
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
			tmp_cliente=(Cliente)session.get(Cliente.class, cliente.getIdUtente());
			if(tmp_cliente!=null)
			{
				tmp_cliente.setCodicefiscale(cliente.getCodicefiscale());
				tmp_cliente.setNome(cliente.getNome());
				tmp_cliente.setCognome(cliente.getCognome());
				tmp_cliente.setUsername(cliente.getUsername());
				tmp_cliente.setPassword(cliente.getPassword());
				tmp_cliente.setIndirizzo(cliente.getIndirizzo());
				tmp_cliente.setCartacredito(cliente.getCartacredito());
				tmp_cliente.setTipologia(cliente.getTipologia());
				tmp_cliente.setValidita(cliente.getValidita());
				
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

