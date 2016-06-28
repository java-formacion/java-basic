package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void test() {
		CajaRegistradora caja = new CajaRegistradora();
		caja.setPago(10f);
		caja.setPrecio(9f);
		
		int[] resul = caja.getaVueltas();
				
		assertEquals("50 mal calculado", 0, resul[0] );
		assertEquals( 0, resul[1] );
		assertEquals( 0, resul[2] );
		assertEquals( 0, resul[3] );
		
		assertEquals( 0, resul[4] );
		assertEquals( 1, resul[5] );
		assertEquals( 0, resul[6] );
		assertEquals( 0, resul[7] );
		assertEquals( 0, resul[8] );
		assertEquals( 0, resul[9] );
		assertEquals( 0, resul[10] );
		assertEquals( 0, resul[11] );
		
		
		caja = new CajaRegistradora();
		caja.setPago(2000f);
		caja.setPrecio(1326.24f);
		
		resul = caja.getaVueltas();
				
		assertEquals( 13, resul[0] );
		assertEquals( 1, resul[1] );
		assertEquals( 0, resul[2] );
		assertEquals( 0, resul[3] );
		
		assertEquals( 1, resul[4] );
		assertEquals( 1, resul[5] );
		assertEquals( 1, resul[6] );
		assertEquals( 1, resul[7] );
		assertEquals( 0, resul[8] );
		assertEquals( 1, resul[9] );
		assertEquals( 0, resul[10] );
		assertEquals( 1, resul[11] );
		
		
		
		caja = new CajaRegistradora();
		caja.setPago(1f);
		caja.setPrecio(0.6f);
		
		resul = caja.getaVueltas();
				
		assertEquals( 0, resul[0] );
		assertEquals( 0, resul[1] );
		assertEquals( 0, resul[2] );
		assertEquals( 0, resul[3] );
		
		assertEquals( 0, resul[4] );
		assertEquals( 0, resul[5] );
		assertEquals( 0, resul[6] );
		assertEquals("20Cnt mal calculado", 2, resul[7] );
		assertEquals( 0, resul[8] );
		assertEquals( 0, resul[9] );
		assertEquals( 0, resul[10] );
		assertEquals( 0, resul[11] );
		
		
	}

}
