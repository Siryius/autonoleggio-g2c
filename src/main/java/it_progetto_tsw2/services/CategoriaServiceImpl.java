package it_progetto_tsw2.services;

import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Categoria;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
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
			criteria.add( Example.create(categoria).excludeZeroes() );
			List result = criteria.list();
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
			cat=(Categoria)session.get(Categoria.class, categoria.getId_categoria());
			if(cat!=null)
			{
				cat.setNome_categoria(categoria.getNome_categoria());
				cat.setDescrizione_categoria(categoria.getDescrizione_categoria());
				cat.setTariffa_categoria(categoria.getTariffa_categoria());
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

}
