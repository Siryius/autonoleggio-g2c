package it.unisa.tsw2.domain;

import it.unisa.tsw2.util.HibernateUtil;

import java.util.*;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;



public class TestManager 
{
	public static void main(String[] args) {
		 TestManager mgr = new TestManager();

	        //if (args[0].equals("store")) {
	            mgr.createAndStoreUser();
	        //}

	        
	    }

	    private void createAndStoreUser() {
	    	HibernateUtil util=new HibernateUtil();

	        Session session = util.getSessionFactory().getCurrentSession();

	        session.beginTransaction();
	        
	        Indirizzo utenteInd=new Indirizzo();
	        utenteInd.setCap("84014");
	        utenteInd.setCitta("Nocere");
	        utenteInd.setNcivico("12");
	        utenteInd.setProvincia("Salerno");
	        utenteInd.setStato("Italy");
	        utenteInd.setVia("Via Napoli");
	        Utente utente= new Utente();
	        utente.setCodicefiscale("AAAAA");
	
	        utente.setIndirizzo(utenteInd);
	        
	        session.save(utente);
	        session.getTransaction().commit();
	    }
	    
}
