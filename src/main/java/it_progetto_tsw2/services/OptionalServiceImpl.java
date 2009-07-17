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

import util.*;


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
			
			QueryCriteria query_criteria=new QueryCriteria("nome_optional",nome_optional);
			ArrayList array_criteria=new ArrayList();
			array_criteria.add(query_criteria);
		
			List list=this.findByCriteria(array_criteria);
			//if(list.size()==1)
			//{
				optional=(Optional)list.get(1);
			//}
		}
		catch(Exception e)
		{
			System.out.println("Errore OptionalServiceImpl findByNome_optional");
			e.printStackTrace();
		}
		return optional;
	}
	
	public List findByCriteria(ArrayList criterias)
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
				for (int i=1;i<=criterias.size();++i)
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
				session.getTransaction().commit();
				//System.out.println(optional.getNome_optional());
				//System.out.println(optional.getDescrizione_optional());
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Errore OptionalServiceImpl findByCriteria");
			e.printStackTrace();
		}
		return list;	
	}
	
	public boolean persist(Optional optional,String nome_opt)
	{
		boolean ris=true;
		try
		{
			Optional temp_opt=null;
			temp_opt=findByNome_optional(nome_opt);
			if(temp_opt==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_opt,optional);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteOptional(Optional optional,String nome_optional)
	{
		boolean ris=true;
		try
		{

			Optional opt=this.findByNome_optional(nome_optional);
			if(opt!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(opt);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{e.printStackTrace();}
	
		return ris;
	}
	
	public boolean updateOptional(Optional optional,String nome_optional)
	{
		boolean ris=true;
		try
		{
			Optional opt=this.findByNome_optional(nome_optional);
		
			if(opt!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.merge(optional);
				session.getTransaction().commit();
			}
			else
				ris=false;
			
		}catch(Exception e)
		{e.printStackTrace();}
		
		return ris;
	}
	
	public List findAllOptional()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Optional.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cri;
	}


}
