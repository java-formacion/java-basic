package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.nombreproyecto.pojo.Utilidades;
import com.ipartek.formacion.nombreproyecto.pojo.Candidato;
import com.mysql.jdbc.EscapeTokenizer;

public class UtilidadesTest {

	@Test
	public void testGetDiaSemana() {

		// Todo funciona según lo esperado
		assertEquals("lunes", Utilidades.getDiaSemana(0));
		assertEquals("martes", Utilidades.getDiaSemana(1));
		assertEquals("miercoles", Utilidades.getDiaSemana(2));
		assertEquals("jueves", Utilidades.getDiaSemana(3));
		assertEquals("viernes", Utilidades.getDiaSemana(4));
		assertEquals("sabado", Utilidades.getDiaSemana(5));
		assertEquals("domingo", Utilidades.getDiaSemana(6));

		// Cuando funciona mal, que obtengamos lo esperado
		assertNull(Utilidades.getDiaSemana(-1));
		assertNull(Utilidades.getDiaSemana(7));

	}

	@Test
	public void testValidarEmail() {

		String email = "aio@yahoo.com.eu";
		assertTrue(Utilidades.esValidoEmail(email));
		
		email = "aio@yahoo.es";
		assertTrue(Utilidades.esValidoEmail(email));
		
		email = "";
		assertFalse(Utilidades.esValidoEmail(email));
		
		email = "a";
		assertFalse(Utilidades.esValidoEmail(email));
		
		email = "a@.c";
		assertFalse(Utilidades.esValidoEmail(email));

		email = "aer@";
		assertFalse(Utilidades.esValidoEmail(email));
		
		email = "aer@y";
		assertFalse(Utilidades.esValidoEmail(email));
		
		email = "aer@y.es";
		assertTrue(Utilidades.esValidoEmail(email));
		
		email = "aer@yahoo.";
		assertFalse(Utilidades.esValidoEmail(email));
	
	}
	
	@Test
 	public void testCapitalizar() {
 					
 		
 		assertEquals( "Ander Jose Mari",Utilidades.capitalizar(" ander   Jose Mari   ") );
 		
 		assertEquals( null ,Utilidades.capitalizar(null) );
 		assertEquals( "Ander",Utilidades.capitalizar("ander") );
 		assertEquals( "Ander",Utilidades.capitalizar("aNdEr") );	
 		assertEquals( "Ander",Utilidades.capitalizar(" ander     ") );
 		
 		assertEquals( "Ander-Jose",Utilidades.capitalizar(" ander-Jose") );
 		
 	} 

	@Test
	public void testVarios() {
			assertEquals( "Ander", "   Ander    ".trim() );	
	}
	
	
	
}
