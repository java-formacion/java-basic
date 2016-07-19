package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;


import com.ipartek.formacion.nombreproyecto.pojo.CandidatoExcepcion;

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
	public void testVarios() throws CandidatoExcepcion {
		
		/*assertEquals( "Ander", "   Ander    ".trim() );
		Candidato c = new Candidato("", "", "", "", "", 0 );
		assertTrue ( c instanceof Candidato ); 
		Candidato c1 = new Candidato("", "", "", "", "", 0 );
		assertNotEquals("No son iguales, aunque lo parezcan", c, c1 );
		assertFalse( c.equals(c1) );*/
		//Candidato sel = new Candidato("Sel", "Demasie", "Saturada", "543857349f", "saturacionMaxima@gmail.com", -2); 
		
		
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
