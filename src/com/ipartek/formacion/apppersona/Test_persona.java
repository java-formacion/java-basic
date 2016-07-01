package com.ipartek.formacion.apppersona;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_persona {

	public final String P1_NOMBRE="DFSFS";
	public final String P1_APE1="FESRSD";
	public final String P1_DNI="DSAFA";
	
	Persona p = new Persona (P1_NOMBRE, P1_APE1, P1_DNI, "","", 0);
			

	
	
	
	
	@Test
	public void test() {
		Persona p = new Persona (P1_NOMBRE, P1_APE1, P1_DNI, "","",0) ;
		p.setNota( Persona.NOTA_MIN - 1);
		assertEquals (Persona.NOTA_MIN, p.getNota());
		assertFalse (p.isAceptado());
		
		assertEquals ( P1_NOMBRE, p.getNombre()) ;
		assertTrue (P1_APE1.equals(p.getApellido1()) );
		
		p.setNota(Persona.NOTA_ACP+2);
		assertTrue(p.isAceptado());
	}
}

