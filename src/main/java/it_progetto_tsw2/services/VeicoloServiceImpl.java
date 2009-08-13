package it_progetto_tsw2.services;

import it_progetto_tsw2_hibernate.Veicolo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;

public class VeicoloServiceImpl implements VeicoloService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public VeicoloServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Veicolo findByNome_veicolo(String nome_veicolo)
	{
		Veicolo veicolo=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Veicolo.class);
			criteria.add(Restrictions.eq("nome_optional",nome_veicolo));
			veicolo=(Veicolo)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl findByNome_veicolo");
			e.printStackTrace();
		}
		return veicolo;
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
	
	public List findByExample(Veicolo veicolo)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Veicolo.class);
			criteria.add( Example.create(veicolo).excludeZeroes() );
			list =(List<Veicolo>) criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllVeicolo()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Veicolo.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl findAllVeicolo");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Veicolo veicolo,String nome_veicolo)
	{
		boolean ris=true;
		try
		{
			Veicolo temp_veicolo=null;
			temp_veicolo=findByNome_veicolo(nome_veicolo);
			if(temp_veicolo==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(nome_veicolo,veicolo);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteVeicolo(Veicolo veicolo,String nome_veicolo)
	{
		boolean ris=true;
		try
		{

			Veicolo tmp_veicolo=this.findByNome_veicolo(nome_veicolo);
			if(tmp_veicolo!=null)
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.delete(tmp_veicolo);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl deleteVeicolo");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateVeicolo(Veicolo veicolo)
	{
		boolean ris=true;
		try
		{
			Veicolo tmp_veicolo=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_veicolo=(Veicolo)session.get(Veicolo.class, veicolo.getId_veicolo());
			if(tmp_veicolo!=null)
			{
				tmp_veicolo.setNome_veicolo(veicolo.getNome_veicolo());
				tmp_veicolo.setDescrizione_veicolo(veicolo.getDescrizione_veicolo());
				tmp_veicolo.setAlimentazione_veicolo(veicolo.getAlimentazione_veicolo());
				
				tmp_veicolo.setBagagliaio_veicolo(veicolo.getBagagliaio_veicolo());
				tmp_veicolo.setCambio_veicolo(veicolo.getCambio_veicolo());
				tmp_veicolo.setCategoria(veicolo.getCategoria());
				tmp_veicolo.setCilindrata_veicolo(veicolo.getCilindrata_veicolo());
				tmp_veicolo.setDisponibile_veicolo(veicolo.getDisponibile_veicolo());
				tmp_veicolo.setImmatricolazione_veicolo(veicolo.getImmatricolazione_veicolo());
				tmp_veicolo.setnPosti_veicolo(veicolo.getnPosti_veicolo());
				tmp_veicolo.setPortata_veicolo(veicolo.getPortata_veicolo());
				tmp_veicolo.setTarga_veicolo(veicolo.getTarga_veicolo());
				tmp_veicolo.setTipo_veicolo(veicolo.getTipo_veicolo());
				session.saveOrUpdate(tmp_veicolo);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore VeicoloServiceImpl updateVeicolo");
			e.printStackTrace();
		}
		
		return ris;
	}
}
