package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListTest {
	
	ArrayList<String> paises;
	static final String ITALIA   = "Italia";
	static final String ALEMANIA = "Alemania";
	static final String FRANCIA  = "Francia";

	@Test
	public void test() {
		
				
		assertNull (paises);
		
		//inicializamos arraylist
		paises = new ArrayList<String>();
		assertNotNull (paises);
		
		assertTrue ( paises.isEmpty() );
		assertEquals (0 , paises.size());
		
		
		paises.add(ALEMANIA);
		paises.add(ITALIA);
		paises.add(FRANCIA);
		paises.add(FRANCIA);
		
		
		//realizar iterator y contar elementos
		int cont=0;
		String paisActual = "";
		Iterator<String> it = paises.iterator();
		while(it.hasNext()){
			cont++;
			paisActual = (String) it.next();
		}
		
		
		assertEquals (4 , paises.size());
		
		assertEquals (ALEMANIA,  paises.get(0));
		assertEquals (ITALIA,  paises.get(1));
		assertEquals (FRANCIA,  paises.get(2));
		assertEquals (FRANCIA,  paises.get(3));
		
		assertEquals ( 2, paises.indexOf(FRANCIA) );
		assertEquals ( -1, paises.indexOf("Txikitistan") );
		
		paises.remove( paises.size()-1 );
		paises.remove( paises.size()-1 );
		
		assertEquals (2 , paises.size());
		
		paises.add(1, FRANCIA);
		
		assertEquals (ALEMANIA,  paises.get(0));
		assertEquals (FRANCIA,  paises.get(1));
		assertEquals (ITALIA,  paises.get(2));
		
		
		
	}
	
	@Test(timeout = 10)
	public void testVelocidad() throws InterruptedException{
		
		  int cont = 0;
		 
		for( int i= 0; i < 1000000; i++){
			cont++;
		}
		
		
		/*
		  Thread.sleep(1000);
		  */
		
		assertTrue(true);
	}
	

}
