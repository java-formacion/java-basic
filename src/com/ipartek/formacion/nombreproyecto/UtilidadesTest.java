package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetDiaSemana() {
		
		//Evaluamos que todo funciona bien
		//evaluamos que si obtenemos de DiaSemana(0) es un "lunes"
		assertEquals ("lunes" , Utilidades.getDiaSemana(0) );
		assertEquals ("martes" , Utilidades.getDiaSemana(1) );
		assertEquals ("miércoles" , Utilidades.getDiaSemana(2) );
		assertEquals ("jueves" , Utilidades.getDiaSemana(3) );
		assertEquals ("viernes" , Utilidades.getDiaSemana(4) );
		assertEquals ("sabado" , Utilidades.getDiaSemana(5) );
		assertEquals ("domingo" , Utilidades.getDiaSemana(6) );
		
		//Evaluamos cuando funciona mal y no obtenemos lo esperado
		assertNull ( Utilidades.getDiaSemana(-1) );  //si el numero es menor que 0 (por ejemplo con -1)
		assertNull ( Utilidades.getDiaSemana(7) );   //si el numero es mayor que 6 (por ejemplo con 7)
	}	
}
