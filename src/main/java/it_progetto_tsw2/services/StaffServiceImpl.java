package it_progetto_tsw2.services;

import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Staff;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;


public class StaffServiceImpl implements StaffService
{
	private Session session;
	private Criteria criteria;
	private HibernateUtil util;
	
	public StaffServiceImpl()
	{
		util=new HibernateUtil();
	}
	

	
	public Staff findByCF_staff(String CF_staff)
	{
		Staff staff=null;
		try
		{
					
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			
			criteria= session.createCriteria(Staff.class);
			criteria.add(Restrictions.eq("CF_utente",CF_staff));
			staff=(Staff)criteria.uniqueResult();
			System.out.println("Ok query \n");
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore StaffServiceImpl findByCF_staff");
			e.printStackTrace();
		}
		return staff;
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
	
	public List findByExample(Staff staff)
	{
		List list=null;
		try
		{
			session = util.getSessionFactory().getCurrentSession();	
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Staff.class);
			criteria.add( Example.create(staff).excludeZeroes() );
			List result = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore StaffServiceImpl findByExample");
			e.printStackTrace();
		}
		return list;
	}

	public List findAllStaff()
	{
		List cri=null;
	
		try
		{
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction(); 
			Criteria criteria = session.createCriteria(Staff.class);
			cri = criteria.list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore StaffServiceImpl findAllStaff");
			e.printStackTrace();
		}
		return cri;
	}
	
	public boolean persist(Staff staff,String CF_staff)
	{
		boolean ris=true;
		try
		{
			Staff tmp_cliente=null;
			tmp_cliente=findByCF_staff(CF_staff);
			if(tmp_cliente==null)
			{	
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.persist(CF_staff,staff);
				session.getTransaction().commit();
			}
			else
				ris=false;
		}
		catch(Exception e)
		{
			System.out.println("Errore StaffServiceImpl persist");
			e.printStackTrace();
		}
		return ris;
	}
	
	public boolean deleteStaff(Staff staff,String CF_staff)
	{
		boolean ris=true;
		try
		{

			Staff tmp_staff=this.findByCF_staff(CF_staff);
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
			System.out.println("Errore StaffServiceImpl deleteStaff");
			e.printStackTrace();
		}
	
		return ris;
	}
	
	public boolean updateStaff(Staff staff)
	{
		boolean ris=true;
		try
		{
			Staff tmp_staff=null;
			session = util.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			tmp_staff=(Staff)session.get(Staff.class, staff.getId_utente());
			if(tmp_staff!=null)
			{
				tmp_staff.setCF_utente(staff.getCF_utente());
				tmp_staff.setNome_utente(staff.getNome_utente());
				tmp_staff.setCognome_utente(staff.getCognome_utente());
				tmp_staff.setLogin_utente(staff.getLogin_utente());
				tmp_staff.setPassword_utente(staff.getPassword_utente());
				tmp_staff.setIndirizzo_utente(staff.getIndirizzo_utente());
				tmp_staff.setCompetenza_staff(staff.getCompetenza_staff());
				
				session.saveOrUpdate(tmp_staff);
			}
			else
				ris=false;
			
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("Errore StaffServiceImpl updateStaff");
			e.printStackTrace();
		}
		
		return ris;
	}
	



}


