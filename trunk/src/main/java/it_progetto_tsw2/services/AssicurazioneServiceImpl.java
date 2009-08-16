package it_progetto_tsw2.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;


import it_progetto_tsw2.services.AssicurazioneService;
import it_progetto_tsw2.util.HibernateUtil;
import it_progetto_tsw2_hibernate.Assicurazione;

public class AssicurazioneServiceImpl implements AssicurazioneService  
{
		private Session session;
		private Criteria criteria;
		private HibernateUtil util;
		
		public AssicurazioneServiceImpl()
		{
			util=new HibernateUtil();
		}
		

		
		public Assicurazione findByNome_assicurazione(String nome_assicurazione)
		{
			Assicurazione assicurazione=null;
			try
			{
						
				session = util.getSessionFactory().getCurrentSession();	
				session.beginTransaction();
				
				criteria= session.createCriteria(Assicurazione.class);
				criteria.add(Restrictions.eq("nome_optional",nome_assicurazione));
				assicurazione=(Assicurazione)criteria.uniqueResult();
				System.out.println("Ok query \n");
				
				session.getTransaction().commit();
			}
			catch(Exception e)
			{
				System.out.println("Errore AssicurazioneServiceImpl findByNome_assicurazione");
				e.printStackTrace();
			}
			return assicurazione;
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
		
		public List findByExample(Assicurazione assicurazione)
		{
			List list=null;
			try
			{
				session = util.getSessionFactory().getCurrentSession();	
				session.beginTransaction();
				Criteria criteria = session.createCriteria(Assicurazione.class);
				criteria.add( Example.create(assicurazione).excludeZeroes() );
				List result = criteria.list();
				session.getTransaction().commit();
			}
			catch(Exception e)
			{
				System.out.println("Errore AssicurazioneServiceImpl findByExample");
				e.printStackTrace();
			}
			return list;
		}

		public List findAllAssicurazione()
		{
			List cri=null;
		
			try
			{
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction(); 
				Criteria criteria = session.createCriteria(Assicurazione.class);
				cri = criteria.list();
				session.getTransaction().commit();
			}
			catch(Exception e)
			{
				System.out.println("Errore OptionalServiceImpl findAllOptional");
				e.printStackTrace();
			}
			return cri;
		}
		
		public boolean persist(Assicurazione assicurazione,String nome_ass)
		{
			boolean ris=true;
			try
			{
				Assicurazione temp_ass=null;
				temp_ass=findByNome_assicurazione(nome_ass);
				if(temp_ass==null)
				{	
					session = util.getSessionFactory().getCurrentSession();
					session.beginTransaction();
					session.persist(nome_ass,assicurazione);
					session.getTransaction().commit();
				}
				else
					ris=false;
			}
			catch(Exception e)
			{
				System.out.println("Errore AssicurazioneServiceImpl persist");
				e.printStackTrace();
			}
			return ris;
		}
		
		public boolean deleteAssicurazione(Assicurazione assicurazione,String nome_assicurazione)
		{
			boolean ris=true;
			try
			{

				Assicurazione tmp_ass=this.findByNome_assicurazione(nome_assicurazione);
				if(tmp_ass!=null)
				{
					session = util.getSessionFactory().getCurrentSession();
					session.beginTransaction();
					session.delete(tmp_ass);
					session.getTransaction().commit();
				}
				else
					ris=false;
			}
			catch(Exception e)
			{
				System.out.println("Errore AssicurazioneServiceImpl deleteAssicurazione");
				e.printStackTrace();
			}
		
			return ris;
		}
		
		public boolean updateAssicurazione(Assicurazione assicurazione)
		{
			boolean ris=true;
			try
			{
				Assicurazione tmp_ass=null;
				session = util.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				tmp_ass=(Assicurazione)session.get(Assicurazione.class, assicurazione.getId_assicurazione());
				if(tmp_ass!=null)
				{
					tmp_ass.setNome_assicurazione(assicurazione.getNome_assicurazione());
					tmp_ass.setDescrizione_assicurazione(assicurazione.getDescrizione_assicurazione());
					tmp_ass.setCosto_assicurazione(assicurazione.getCosto_assicurazione());
					session.saveOrUpdate(tmp_ass);
				}
				else
					ris=false;
				
				session.getTransaction().commit();
			}
			catch(Exception e)
			{
				System.out.println("Errore AssicurazioneServiceImpl updateAssicurazione");
				e.printStackTrace();
			}
			
			return ris;
		}
		





	
/*	public void persist(Assicurazione assicurazione,String nome_assicurazione)
	{

        EntityManager entityMgr = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = entityMgr.getTransaction();
            tx.begin();

            if( "".equals(nome_assicurazione) ) {
                entityMgr.persist(assicurazione);
            } else {
                entityMgr.merge(assicurazione);
            }

            tx.commit();
        }
        catch (Exception e) {
            if ( tx != null && tx.isActive() )
                tx.rollback();
            throw (RuntimeException)e.getCause();
        }
	}
*/
}
