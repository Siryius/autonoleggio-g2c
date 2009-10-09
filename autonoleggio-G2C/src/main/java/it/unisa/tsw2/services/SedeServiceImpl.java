package it.unisa.tsw2.services;



import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import org.hibernate.*;
import org.hibernate.criterion.*;


import it.unisa.tsw2.services.*;
import it.unisa.tsw2.domain.Categoria;
import it.unisa.tsw2.domain.Sede;
import it.unisa.tsw2.util.*;

import java.util.*;


public class SedeServiceImpl implements SedeService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public SedeServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Sede findByNome_sede(String nome_sede)
	{
		Sede sede=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Sede.class);
			criteria.add(Restrictions.eq("nome_sede",nome_sede));
			sede=(Sede)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl findByNome_sede");
			e.printStackTrace();
		}
		return sede;
	}
	

	
	public List findByExample(Sede sede)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Sede.class);
			criteria.add( Example.create(sede).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllSede()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Sede.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl findAllSede");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Sede sede,String nome_sede)
	{
		boolean ris=true;
		try
		{
			Sede temp_sede=null;
			temp_sede=findByNome_sede(nome_sede);
			if(temp_sede==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_sede,sede);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteSede(Sede sede,String nome_sede)
	{
		boolean ris=true;
		try
		{

			Sede tmp_sede=this.findByNome_sede(nome_sede);
			if(tmp_sede!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_sede);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl deleteSede");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateSede(Sede sede)
	{
		boolean ris=true;
		try
		{
			Sede tmp_sede=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_sede=(Sede)session.get(Sede.class, sede.getIdSede());
			if(tmp_sede!=null)
			{
				tmp_sede.setNome(sede.getNome());
				tmp_sede.setOrari(sede.getOrari());
				tmp_sede.setIndirizzo(sede.getIndirizzo());
				session.saveOrUpdate(tmp_sede);
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
	
	public Sede findById(Long id_sede)
	{
		Sede sede=null;
		
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			sede=(Sede)session.get(Sede.class, id_sede);
			Hibernate.initialize(sede.getVeicoli());
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore SedeServiceImpl findById");
			e.printStackTrace();
		}
		
		return sede;
	}
	
}
