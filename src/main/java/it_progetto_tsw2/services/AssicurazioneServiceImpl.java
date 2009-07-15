package it_progetto_tsw2.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it_progetto_tsw2.services.*;
import it_progetto_tsw2_hibernate.*;

public class AssicurazioneServiceImpl implements AssicurazioneService  
{
	private EntityManagerFactory emf;
	
	public AssicurazioneServiceImpl() {
        emf = Persistence.createEntityManagerFactory("tsw2");
    }
	
	public Assicurazione findByNome_assicurazione(String nome_assicurazione)
	{
		EntityManager entityMgr = emf.createEntityManager();
        return entityMgr.find(Assicurazione.class,nome_assicurazione);
	}
	
	public void persist(Assicurazione assicurazione,String nome_assicurazione)
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

}
