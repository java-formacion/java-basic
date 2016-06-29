package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.sun.org.glassfish.external.statistics.impl.AverageRangeStatisticImpl;

public class CajaRegistradoraTest {
	
	
	@Test
	public void testCalcularVueltas() {
		assertTrue(20.0f == CajaRegistradora.calcularVueltas(40.0f, 20.0f));
		assertTrue(30.0f == CajaRegistradora.calcularVueltas(40.0f, 10.0f));
		assertTrue(0.5f == CajaRegistradora.calcularVueltas(10.5f, 10.0f));
		assertTrue(30.1f == CajaRegistradora.calcularVueltas(50.0f, 19.9f));
		assertTrue(-1.0f == CajaRegistradora.calcularVueltas(20.0f, 50.0f));
		
		
	}
	


	@Test
	public void testCalcularVueltasPapelMoneda() {
		
		int[] aDinero = new int[CajaRegistradora.BILLETES_MONEDAS.length];
		int[] aVueltas = new int[CajaRegistradora.BILLETES_MONEDAS.length];
		aVueltas = CajaRegistradora.calcularVueltasPapelMoneda(50.0f);
		aDinero[0] = 1;
		//for (int i=0; i<aDinero.length; i++){
		assertTrue(Arrays.equals(aDinero, aVueltas));
		//aDinero = CajaRegistradora.limpiarValores(aDinero);
		//aVueltas = CajaRegistradora.limpiarValores(aVueltas);
		
		//aVueltas = null;
		aVueltas =   CajaRegistradora.calcularVueltasPapelMoneda(60.0f);
		aDinero[2] = 1;
		assertTrue(Arrays.equals(aDinero, aVueltas));
		//aDinero = CajaRegistradora.limpiarValores(aDinero);
		//aVueltas2 = CajaRegistradora.limpiarValores(aVueltas2);
		
	/**		
		aVueltas = CajaRegistradora.calcularVueltasPapelMoneda(0.20f);
		aDinero[0] = 0;
		aDinero[2] = 0;
		aDinero[7] = 2;
		assertTrue(Arrays.equals(aDinero, aVueltas));
	
		
	aVueltas = CajaRegistradora.calcularVueltasPapelMoneda(40.0f);
			aDinero = CajaRegistradora.limpiarValores(aDinero);
			aDinero[2] = 2;
			assertTrue(Arrays.equals(aDinero, aVueltas));
		
	
		aVueltas = CajaRegistradora.calcularVueltasPapelMoneda(40.12f);
		aDinero[2] = 2;
		aDinero[8] = 1;
		aDinero[11] = 1;
		assertTrue(Arrays.equals(aDinero, aVueltas));
		
		
		aVueltas = CajaRegistradora.calcularVueltasPapelMoneda(150.00f);
		aDinero[0] = 3;
		assertTrue(Arrays.equals(aDinero, aVueltas));
		**/
	}

}
