package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Prenotazione;
import it.unisa.tsw2.util.HibernateUtil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class PrenotazioneServiceImpl implements PrenotazioneService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public PrenotazioneServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	

	
	public List findByExample(Prenotazione prenotazione)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Prenotazione.class);
			criteria.add( Example.create(prenotazione).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PrenotazioneServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllPrenotazione()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Prenotazione.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PrenotazioneServiceImpl findAllPrenotazione");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Prenotazione prenotazione, Long id_prenotazione)
	{
		boolean ris=true;
		try
		{
			Prenotazione tmp_prenotazione=null;
			tmp_prenotazione=findById(id_prenotazione);
			if(tmp_prenotazione==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.saveOrUpdate(prenotazione);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PrenotazioneServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deletePrenotazione(Prenotazione prenotazione,Long id_prenotazione)
	{
		boolean ris=true;
		try
		{

			Prenotazione tmp_prenotazione=this.findById(id_prenotazione);
			if(tmp_prenotazione!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_prenotazione);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PrenotazioneServiceImpl deletePrenotazione");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updatePrenotazione(Prenotazione prenotazione)
	{
		boolean ris=true;
		try
		{
			Prenotazione tmp_prenotazione=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_prenotazione=(Prenotazione)session.get(Prenotazione.class, prenotazione.getIdPrenotazione());
			if(tmp_prenotazione!=null)
			{
				tmp_prenotazione.setArrivo(prenotazione.getArrivo());
				tmp_prenotazione.setPartenza(prenotazione.getPartenza());
			
				session.saveOrUpdate(tmp_prenotazione);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl updateSede");
			e.printStackTrace();
		}
		
		return ris;
	}
	
	public Prenotazione findById(Long id_prenotazione)
	{
		Prenotazione prenotazione=null;
		
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			prenotazione=(Prenotazione)session.get(Prenotazione.class, id_prenotazione);
			Hibernate.initialize(prenotazione.getSedi());
			Hibernate.initialize(prenotazione.getVeicolo());
			Hibernate.initialize(prenotazione.getAssicurazioni());
			Hibernate.initialize(prenotazione.getCliente());
			Hibernate.initialize(prenotazione.getNoleggio());
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PrenotazioneServiceImpl findById");
			e.printStackTrace();
		}
		
		return prenotazione;
	}
	
}

