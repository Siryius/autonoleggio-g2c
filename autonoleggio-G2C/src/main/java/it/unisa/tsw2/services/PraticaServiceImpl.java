package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Pratica;
import it.unisa.tsw2.util.HibernateUtil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


public class PraticaServiceImpl implements PraticaService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public PraticaServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Pratica findByNome_pratica(String nome_pratica)
	{
		Pratica pratica=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Pratica.class);
			criteria.add(Restrictions.eq("nome_pratica",nome_pratica));
			pratica=(Pratica)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl findByNome_pratica");
			e.printStackTrace();
		}
		return pratica;
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
	
	public List findByExample(Pratica pratica)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Pratica.class);
			criteria.add( Example.create(pratica).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllPratica()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Pratica.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl findAllPratica");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Pratica pratica,String nome_pratica)
	{
		boolean ris=true;
		try
		{
			Pratica tmp_pratica=null;
			tmp_pratica=findByNome_pratica(nome_pratica);
			if(tmp_pratica==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_pratica,pratica);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deletePratica(Pratica pratica,String nome_pratica)
	{
		boolean ris=true;
		try
		{

			Pratica tmp_pratica=this.findByNome_pratica(nome_pratica);
			if(tmp_pratica!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_pratica);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl deletePratica");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updatePratica(Pratica pratica)
	{
		boolean ris=true;
		try
		{
			Pratica tmp_pratica=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_pratica=(Pratica)session.get(Pratica.class, pratica.getIdPratica());
			if(tmp_pratica!=null)
			{
				tmp_pratica.setNome(pratica.getNome());
				tmp_pratica.setDescrizione(pratica.getDescrizione());
				tmp_pratica.setScadenza(pratica.getScadenza());
				session.saveOrUpdate(tmp_pratica);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore PraticaServiceImpl updatePratica");
			e.printStackTrace();
		}
		
		return ris;
	}
	



}
