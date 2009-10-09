package it.unisa.tsw2.services;

import it.unisa.tsw2.domain.Categoria;
import it.unisa.tsw2.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


public class CategoriaServiceImpl implements CategoriaService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public CategoriaServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Categoria findByNome_categoria(String nome_categoria)
	{
		Categoria categoria=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Categoria.class);
			criteria.add(Restrictions.eq("nome_categoria",nome_categoria));
			categoria=(Categoria)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl findByNome_categoria");
			e.printStackTrace();
		}
		return categoria;
	}
	
	public List findByExample(Categoria categoria)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Categoria.class);
			criteria.add( Example.create(categoria).excludeZeroes().ignoreCase().enableLike(MatchMode.ANYWHERE) );
			list = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllCategoria()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Categoria.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl findAllCategoria");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Categoria categoria,String nome_categoria)
	{
		boolean ris=true;
		try
		{
			Categoria temp_opt=null;
			temp_opt=findByNome_categoria(nome_categoria);
			if(temp_opt==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_categoria,categoria);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteCategoria(Categoria categoria,String nome_categoria)
	{
		boolean ris=true;
		try
		{

			Categoria cat=this.findByNome_categoria(nome_categoria);
			if(cat!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(cat);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl deleteCategoria");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateCategoria(Categoria categoria)
	{
		boolean ris=true;
		try
		{
			Categoria cat=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			cat=(Categoria)session.get(Categoria.class, categoria.getIdCategoria());
			if(cat!=null)
			{
				cat.setNome(categoria.getNome());
				cat.setDescrizione(categoria.getDescrizione());
				cat.setTariffa(categoria.getTariffa());
				session.saveOrUpdate(cat);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl updateCategoria");
			e.printStackTrace();
		}
		
		return ris;
	}
	
	public Categoria findById(Long id_categoria)
	{
		Categoria categoria=null;
		
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			categoria=(Categoria)session.get(Categoria.class, id_categoria);
			Hibernate.initialize(categoria.getVeicoli());
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore CategoriaServiceImpl findById");
			e.printStackTrace();
		}
		
		return categoria;
	}

}
