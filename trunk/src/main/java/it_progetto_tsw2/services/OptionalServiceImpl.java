package it_progetto_tsw2.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;

import org.hibernate.*;
import org.hibernate.criterion.*;


import it_progetto_tsw2.services.*;
import it_progetto_tsw2_hibernate.*;
import util.HibernateUtil;
import java.util.*;

public class OptionalServiceImpl implements OptionalService
{
	private Session session;
	private Criteria criteria;
	 private HibernateUtil util;
	
	public OptionalServiceImpl()
	{
		util=new HibernateUtil();
	}
	
	public Optional findByNome_optional(String nome_optional)
	{
		Optional optional=null;
		try
		{
			if(nome_optional!=null)
			{
				session = util.getSessionFactory().getCurrentSession();	
				session.beginTransaction();
				Criteria criteria = session.createCriteria(Optional.class);
				optional=(Optional) criteria.add(Restrictions.eq("nome_optional",nome_optional)).uniqueResult();
				session.getTransaction().commit();
				//System.out.println(optional.getNome_optional());
				//System.out.println(optional.getDescrizione_optional());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return optional;	
	}
	
	public void persist(Optional optional,String nome_opt)
	{
		try
		{
			
				System.out.println("Oggetto nuovo "+optional.getNome_optional());
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_opt,optional);
				session.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteOptional(Optional optional,String nome_optional)
	{
		try{

		Optional opt=this.findByNome_optional(nome_optional);
		if(opt!=null)
		{
			System.out.println("Sto in delete "+ nome_optional);
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.delete(opt);	
		}	
	}catch(Exception e)
	{e.printStackTrace();}
	}
	
	public void updateOptional(Optional optional,String nome_optional)
	{
		try
		{
			System.out.println("prima update "+optional.getNome_optional());
			Optional opt=this.findByNome_optional(nome_optional);
		
			if(opt!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.merge(optional);
				session.getTransaction().commit();
				System.out.println("dopo update "+opt.getNome_optional());
			}
		}catch(Exception e)
		{e.printStackTrace();}
	}
	
	public List findAllOptional()
	{
		session = util.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		Criteria criteria = session.createCriteria(Optional.class);
		List cri = criteria.list();
		session.getTransaction().commit();
		return cri;
	}


}
