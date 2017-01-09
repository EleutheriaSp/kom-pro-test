package pl.kompro.testy.test;

import javax.persistence.EntityManager;

import pl.kompro.testy.uslugi.Utrwalacz;

public class TestUruchomieniaJpa {

	public static void main( String[] args){
		(new TestUruchomieniaJpa()).test();
	}

	private void test() {
		EntityManager em = Utrwalacz.manager();
		
	}
}
