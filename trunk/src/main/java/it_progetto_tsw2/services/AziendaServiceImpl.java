package it_progetto_tsw2.services;

import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Azienda;
import it_progetto_tsw2_hibernate.Optional;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class AziendaServiceImpl implements AziendaService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public AziendaServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Azienda findByCF_azienda(String CF_azienda)
	{
		Azienda azienda=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Azienda.class);
			criteria.add(Restrictions.eq("CF_utente",CF_azienda));
			azienda=(Azienda)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl findByCF_azienda");
			e.printStackTrace();
		}
		return azienda;
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
	
	public List findByExample(Azienda azienda)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Azienda.class);
			criteria.add( Example.create(azienda).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllAzienda()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Azienda.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl findAllAzienda");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Azienda azienda,String CF_azienda)
	{
		boolean ris=true;
		try
		{
			Azienda tmp_azienda=null;
			tmp_azienda=findByCF_azienda(CF_azienda);
			if(tmp_azienda==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(CF_azienda,azienda);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteAzienda(Azienda azienda,String CF_azienda)
	{
		boolean ris=true;
		try
		{

			Azienda tmp_staff=this.findByCF_azienda(CF_azienda);
			if(tmp_staff!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_staff);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl deleteAzienda");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateAzienda(Azienda azienda)
	{
		boolean ris=true;
		try
		{
			Azienda tmp_azienda=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_azienda=(Azienda)session.get(Azienda.class, azienda.getId_utente());
			if(tmp_azienda!=null)
			{
				tmp_azienda.setCF_utente(azienda.getCF_utente());
				tmp_azienda.setLogin_utente(azienda.getLogin_utente());
				tmp_azienda.setPassword_utente(azienda.getPassword_utente());
				tmp_azienda.setIndirizzo_utente(azienda.getIndirizzo_utente());
				tmp_azienda.setPartitaiva_azienda(azienda.getPartitaiva_azienda());
				tmp_azienda.setRagionesociale_azienda(azienda.getRagionesociale_azienda());
				tmp_azienda.setIndirizzo_operativo(azienda.getIndirizzo_operativo());
				
				session.saveOrUpdate(tmp_azienda);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl updateAzienda");
			e.printStackTrace();
		}
		
		return ris;
	}
	
	public Azienda findById(Long id_azienda)
	{
		Azienda azienda=null;
		
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			azienda=(Azienda)session.get(Azienda.class, id_azienda);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore AziendaServiceImpl findById");
			e.printStackTrace();
		}
		
		return azienda;
	}
	
	



}



