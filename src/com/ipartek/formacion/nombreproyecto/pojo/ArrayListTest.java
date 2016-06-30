package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	//Declaro variables
	   
	ArrayList<String> paises ;			//declaro un ArrayList llamada paises
	static final String ITALIA = "Italia";   //declaro 3 constantes
	static final String ALEMANIA = "Alemania";
	static final String FRANCIA = "Francia";
	
	@Test
	public void test() {

	
		assertNull(paises);  //comprobamos que la variable es nula
		
		//inicializamos ArrayList
		paises = new ArrayList<String>();
		assertNotNull(paises);  //comprobamos que la variable NO es nula
		
		assertTrue( paises.isEmpty() );
		assertEquals (0, paises.size() );
		
		//añadir paises al arrayList
		paises.add(ALEMANIA);
		paises.add(ITALIA);
		paises.add(FRANCIA);
		paises.add(FRANCIA);
		
		//COMPROBAMOS QUE EL tamaños del Array es 4 despues de añadir los 4 elementos
		assertEquals (4, paises.size() );
		
		//comprobamos que lo que hay en cada posicion ese lo que hemos metido
		assertEquals( ALEMANIA, paises.get(0));
		assertEquals( ITALIA, paises.get(1));
		assertEquals( FRANCIA, paises.get(2));
		assertEquals( FRANCIA, paises.get(3));
		
		//buscamos en un arrayList donde esta un valor
		//la funcion indexOf(valor) me devuelve la primera posición dentro del arrayList 
		//donde encuentra el valor. Si el valor no se encuentra devuelve un -1.
		//hacemos un par de comprobaciones para ver como funciona
		assertEquals ( 2, paises.indexOf(FRANCIA) );
		assertEquals ( -1, paises.indexOf("Txikitistan") );
		
		//quitamos del arrayList el elemento de la posición 3 y reordena el arrayList
		// el elemento que estaba en l posicion 4 pasa a la 3 y asi sucesivamente
		
		// paises.remove(3);
		
		paises.remove( paises.size() - 1 );  //eliminaria el ultimo elemento de la lista
		paises.remove( paises.size() - 1 );
		
		assertEquals( 2 , paises.size() );   //comprobamos que ahora hay 2 elementos
		
		paises.add(1, FRANCIA);
		
		
		
		
	}

}
