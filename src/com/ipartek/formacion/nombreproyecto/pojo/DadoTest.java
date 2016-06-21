package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DadoTest {

	@Test
	public void test() {
		
		int numero =0;
		int maximo = Dado.aAlumnos.length -1;
		int checkZero = 0;
		int check14 = 0;
		for (int i = 0; i < 1000 ; i++) {
			
			numero = Dado.generarNumAleatorio();			
			assertTrue( numero >=0 && numero <= maximo );
				
			if ( numero == 0 ){
				checkZero++;
			}
			
			if ( numero == maximo ){
				check14++;
			}
		}
		
		
		assertTrue("No sale cero", checkZero > 0 );
		assertTrue("No sale " + maximo  , check14 > 0 );
		
	}

}
