package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void test() {

		//Todo funcione segun lo esperado
		assertEquals("lunes", Utilidades.getDiaSemana(0));
		assertEquals("martes", Utilidades.getDiaSemana(1));
		assertEquals("miércoles", Utilidades.getDiaSemana(2));
		assertEquals("jueves", Utilidades.getDiaSemana(3));
		assertEquals("viernes", Utilidades.getDiaSemana(4));
		assertEquals("sábado", Utilidades.getDiaSemana(5));
		assertEquals("domingo", Utilidades.getDiaSemana(6));
		
		//cuando funcione mal que obtengamos lo esperado
		assertNull (Utilidades.getDiaSemana(-1));
		assertNull (Utilidades.getDiaSemana(7));
		
	}
	
	@Test
	public void testConcatenarConMayusIniciales(){
		
		assertEquals("la cadena no contiene nada", Utilidades.capitalizar(null));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar("Jose Ramo de Juan"));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar("Jose Ramo   de Juan"));
		assertEquals("Jo", Utilidades.capitalizar("jo"));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar(" Jose Ramo de Juan "));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar("Jose     Ramo de   Juan"));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar("Jose  Ramo de Juan    "));
		assertEquals("Jose Ramo De Juan", Utilidades.capitalizar("JOSE RAMO de JUAn    "));
		assertEquals("Jose Ra+o De Juan", Utilidades.capitalizar("JOSE RA+O de JUAn    "));
		
		
	}

}
