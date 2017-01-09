package pl.kompro.testy.uslugi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtrwalaczTest extends Utrwalacz{
	private final EntityManagerFactory emf= utrwalacz();
	private EntityManager em;
	
	
	public static void main( String[] args){
		// test
		Utrwalacz.manager();
	}
		
	private EntityManagerFactory utrwalacz(){
		System.err.println( "Utrwalacz: "+ this);
		return Persistence.createEntityManagerFactory( "kom-pro-test");
	}

	@Override protected EntityManager getManager(){
		if( em== null || !em.isOpen())
			em= emf.createEntityManager();
		return em;
	}
}
