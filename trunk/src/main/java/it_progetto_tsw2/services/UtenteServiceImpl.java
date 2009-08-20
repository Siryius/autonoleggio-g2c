package it_progetto_tsw2.services;

import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Utente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class UtenteServiceImpl implements UtenteService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public UtenteServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Utente findByCF_utente(String CF_utente)
	{
		Utente utente=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Utente.class);
			criteria.add(Restrictions.eq("CF_utente",CF_utente));
			utente=(Utente)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl findByCF_utente");
			e.printStackTrace();
		}
		return utente;
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
	
	public List findByExample(Utente utente)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Utente.class);
			criteria.add( Example.create(utente).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllUtente()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Utente.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl findAllUtente");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Utente utente,String CF_utente)
	{
		boolean ris=true;
		try
		{
			Utente tmp_utente=null;
			tmp_utente=findByCF_utente(CF_utente);
			if(tmp_utente==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(CF_utente,utente);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteUtente(Utente utente,String CF_utente)
	{
		boolean ris=true;
		try
		{

			Utente tmp_utente=this.findByCF_utente(CF_utente);
			if(tmp_utente!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_utente);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl deleteUtente");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateUtente(Utente utente)
	{
		boolean ris=true;
		try
		{
			Utente tmp_utente=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_utente=(Utente)session.get(Utente.class, utente.getId_utente());
			if(tmp_utente!=null)
			{
				tmp_utente.setCF_utente(utente.getCF_utente());
				tmp_utente.setLogin_utente(utente.getLogin_utente());
				tmp_utente.setPassword_utente(utente.getPassword_utente());
				tmp_utente.setIndirizzo_utente(utente.getIndirizzo_utente());
				
				session.saveOrUpdate(tmp_utente);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl updateUtente");
			e.printStackTrace();
		}
		
		return ris;
	}
	
	
	public Utente login(String login, String password) 
	{
		Utente user = null;
		
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			System.out.println(login);
			System.out.println(password);
			// query polimorfica
			// si dovrebbe impostare username e password unica
	
			List<Utente> users = session.createQuery( "from Utente u where u.login_utente='" + login + "'"
						+ " and u.password_utente='" + password + "'").list();
		
			System.out.println("Trovato "+users.size());
			
			if (users!=null && users.size() != 0) 
			user = (Utente) users.get(0);


			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Errore UtenteServiceImpl : login");
			e.printStackTrace();
		}
		return user;
	}



}

