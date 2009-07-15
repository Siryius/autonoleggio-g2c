package it_progetto_tsw2_hibernate;

import java.util.*;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;


import util.HibernateUtil;

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
	        utenteInd.setCAP("84014");
	        utenteInd.setCitta("Nocere");
	        utenteInd.setN_civico("12");
	        utenteInd.setProvincia("Salerno");
	        utenteInd.setStato("Italy");
	        utenteInd.setVia("Via Napoli");
	        Utente utente= new Utente();
	        utente.setCF_utente("AAAAA");
	        utente.setCognome_utente("Carotenuto");
	        utente.setNome_utente("Claudio");
	        utente.setIndirizzo_utente(utenteInd);
	        
	        CartaCliente cartaCliente=new CartaCliente();
	        cartaCliente.setCartaCredito_cartaCliente("054030");
	        cartaCliente.setLogin("pippo");
	        cartaCliente.setPassword("pluto");
	        
	  
	        
	        utente.setCartaCliente(cartaCliente);
	        cartaCliente.setUtente(utente);
	        
	        session.save(utente);
	        session.save(cartaCliente);
	       
	        

	        session.getTransaction().commit();
	    }
	    
	   




}
