package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegTest {

	@Test
	public void test() {
		
		CajaReg c1 = new CajaReg(1f, 0.6f);
		
		int[] resl = c1.cambio();
		
		assertEquals("fwe", resl[0], 2);
		assertEquals(resl[1],0);
		assertEquals(resl[2],0);
		assertEquals(resl[3],0);
		assertEquals(resl[4],0);
		assertEquals(resl[5],0);
		assertEquals(resl[6],1);
		assertEquals(resl[7],1);
		assertEquals(resl[8],2);
		assertEquals(resl[9],0);
		assertEquals(resl[9],0);
		assertEquals(resl[9],1);
		assertEquals(resl[9],1);
		
	}

}
