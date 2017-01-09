package pl.kompro.testy.uslugi;

import java.util.ServiceLoader;

import javax.persistence.EntityManager;

public abstract class Utrwalacz{
	private static final Utrwalacz utrwalacz= utrwalacz();
	
	protected abstract EntityManager getManager();
	
	public static EntityManager manager(){
		return utrwalacz.getManager();
	}

	private static Utrwalacz utrwalacz(){
		ServiceLoader<Utrwalacz> usluga= ServiceLoader.load( Utrwalacz.class);
		for( Utrwalacz provider: usluga)
			return provider;	// wywoluje "konkretny" konstruktor
		throw new Error( "Nie zarejestrowano klasy 'konkretnej' dla: "+ Utrwalacz.class.getName());
	}

}
