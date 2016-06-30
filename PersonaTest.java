package com.ipartek.formacion.apppersona;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {
	
	static final String P1_NOMBRE = "Pepe";
	static final String P1_APE1 = "Gorriti";
	static final String P1_DNI = "1111111111H";
	
	/* 
	 * Parte del test que comprueba los valores de
	 */
	@Test
	public void testPersona() {
		Persona p = new Persona( P1_NOMBRE, P1_APE1, P1_DNI);
		assertTrue ( P1_NOMBRE.equals(p.getNombre()) );
		assertTrue ( P1_APE1.equals(p.getApellido1()) );
		assertTrue ( "".equals(p.getApellido2() ));
		assertTrue ( P1_DNI .equals(p.getDni()) );
		assertTrue ( Persona.NOTA_MINIMA == p.getNota() );
		assertTrue ( "".equals(p.getEmail()) );
		assertFalse( p.isAceptado() );

	}


	@Test
	public void testSetNotaAndIsAceptado() {
		
		Persona p = new Persona ( P1_NOMBRE, P1_APE1, P1_DNI );
	
		// comprobamos que valores menores a la nota mínima. en este caso a NOTA_MINIMA-1 (0-1)
		p.setNota( Persona.NOTA_MINIMA - 1 );
		assertEquals("Revisa nota", Persona.NOTA_MINIMA, p.getNota() );  
			//asserEquals(mensaje, valor1, valor2)
			//espera recibir el valor de Persona.NOTA_MINIMA y 
			//lo compara con el valor de la Nota que leemos de Persona (p)
			//en caso de que falle nos saca el mensaje "revisa nota"
		assertFalse( p.isAceptado() );  
			//assertFalse(valor) espera un False. Por tanto, si p.isAceptado devuelve un False es correcto.
			//assertTrue (!valor) nos haría lo mismo.
		
		// comprobamos que funciona la nota mínima. en este caso a NOTA_MINIMA (0)
		p.setNota( Persona.NOTA_MINIMA );
		assertEquals("Revisa nota", Persona.NOTA_MINIMA, p.getNota() );  
		assertFalse( p.isAceptado() );
		
		// comprobamos que funciona el margen entre la nota mínima (0) y la nota de aceptado (5)
		// en este caso probamos (3)
		p.setNota( Persona.NOTA_MINIMA +3);
		assertEquals("Revisa nota", Persona.NOTA_MINIMA +3, p.getNota() );  
		assertFalse( p.isAceptado() );
		
		// comprobamos que funciona la nota ACEPTADO (5).
		p.setNota( Persona.NOTA_ACEPTADO);
		assertEquals("Revisa nota", Persona.NOTA_ACEPTADO, p.getNota() );  
		assertTrue( p.isAceptado() );
		
		// comprobamos que funciona el margen entre el ACEPTADO (5) y la nota MAXIMA (10)
		// en este caso probamos  (7)
		p.setNota( Persona.NOTA_ACEPTADO +2);
		assertEquals("Revisa nota", Persona.NOTA_ACEPTADO+2, p.getNota() );  
		assertTrue( p.isAceptado() );
		
		// comprobamos que funciona la nota MAXIMA (10)
		p.setNota( Persona.NOTA_MAXIMA);
		assertEquals("Revisa nota", Persona.NOTA_MAXIMA, p.getNota() );  
		assertTrue( p.isAceptado() );
		
		// comprobamos que funciona EL MARGEN para valores superiores a la NOTA_MAXIMA (10)
		// PROBAMOS CON (11)
		p.setNota( Persona.NOTA_MAXIMA +1);
		assertEquals("Revisa nota", Persona.NOTA_MAXIMA, p.getNota() );  
		assertTrue( p.isAceptado() );
	}

}
