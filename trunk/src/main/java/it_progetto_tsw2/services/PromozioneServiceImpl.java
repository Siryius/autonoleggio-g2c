package it_progetto_tsw2.services;

import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Promozione;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;


public class PromozioneServiceImpl implements PromozioneService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public PromozioneServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Promozione findByNome_promozione(String nome_optional)
	{
		Promozione promozione=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Promozione.class);
			criteria.add(Restrictions.eq("nome_optional",nome_optional));
			promozione=(Promozione)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl findByNome_promozione");
			e.printStackTrace();
		}
		return promozione;
	}
	
	public List findByExample(Promozione promozione)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Promozione.class);
			criteria.add( Example.create(promozione).excludeZeroes() );
			List result = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllPromozione()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Promozione.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl findAllPromozione");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Promozione promozione,String nome_pro)
	{
		boolean ris=true;
		try
		{
			Promozione temp_pro=null;
			temp_pro=findByNome_promozione(nome_pro);
			if(temp_pro==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_pro,promozione);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deletePromozione(Promozione promozione,String nome_pro)
	{
		boolean ris=true;
		try
		{

			Promozione tmp_pro=this.findByNome_promozione(nome_pro);
			if(tmp_pro!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_pro);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl deletePromozione");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updatePromozione(Promozione promozione)
	{
		boolean ris=true;
		try
		{
			Promozione tmp_pro=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_pro=(Promozione)session.get(Promozione.class, promozione.getId_promozione());
			if(tmp_pro!=null)
			{
				tmp_pro.setNome_promozione(promozione.getNome_promozione());
				tmp_pro.setDescrizione_promozione(promozione.getDescrizione_promozione());
				tmp_pro.setDataInizio_promozione(promozione.getDataInizio_promozione());
				tmp_pro.setDataFine_promozione(promozione.getDataFine_promozione());
				tmp_pro.setSconto_promozione(promozione.getSconto_promozione());
				session.saveOrUpdate(tmp_pro);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PromozioneServiceImpl updatePromozione");
			e.printStackTrace();
		}
		
		return ris;
	}
	



}