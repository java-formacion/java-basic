package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class VehiculoTest {

	@Test
	public void test() {

		//ArrayList de objetos Vehiculo
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		VehiculoDiesel vd = new VehiculoDiesel();
		VehiculoElectrico ve = new VehiculoElectrico();
		
		//add vehiculos en lista
		lista.add(vd);
		lista.add(ve);
		
		//comprobar longitud lista
		assertEquals(2, lista.size());
		
		//comprobar en primera posición VehiculoDiesel
		Vehiculo v = lista.get(0);
		assertTrue(v instanceof VehiculoDiesel);
		assertFalse(v instanceof VehiculoElectrico);
		
		VehiculoDiesel vd1 = (VehiculoDiesel)lista.get(0);
		vd1.getDeposito();
		
	}

}
