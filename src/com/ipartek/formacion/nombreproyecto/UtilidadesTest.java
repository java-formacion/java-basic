package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetDiaSemana() {
		
		//Todo funciona bien
		assertEquals ("Lunes" , Utilidades.getDiaSemana(0));
		assertEquals ("Martes" , Utilidades.getDiaSemana(1));
		assertEquals ("Miercoles" , Utilidades.getDiaSemana(2));
		assertEquals ("Jueves" , Utilidades.getDiaSemana(3));
		assertEquals ("Viernes" , Utilidades.getDiaSemana(4));
		assertEquals ("Sabado" , Utilidades.getDiaSemana(5));
		assertEquals ("Domingo" , Utilidades.getDiaSemana(6));
		//Cuando funciona mal
		assertNull (Utilidades.getDiaSemana(-1));
		assertNull (Utilidades.getDiaSemana(7));
		
	}
	
	
	@Test
	public void testVarios() {
			assertEquals( "Ander", "   Ander    ".trim() );	
	}
	
	@Test
	public void testCapitalizar() {
						
		
		
		
		assertEquals( null ,Utilidades.capitalizar(null) );
		assertEquals( "Ander",Utilidades.capitalizar("ander") );
		assertEquals( "Ander",Utilidades.capitalizar("aNdEr") );	
		assertEquals( "Ander",Utilidades.capitalizar(" ander     ") );
		assertEquals( "Ander Jose Mari",Utilidades.capitalizar(" ander   Jose Mari   ") );
		//assertEquals( "Ander-Jose",Utilidades.capitalizar(" ander-Jose") );
		
	}  

}
