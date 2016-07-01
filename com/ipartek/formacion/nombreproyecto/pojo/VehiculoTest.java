package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class VehiculoTest {

	@Test
	public void test() {

		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		VehiculoDiesel vd = new VehiculoDiesel(null, 0, 0, 0);
		VehiculoElect ve= new VehiculoElect(null, 0, 0, 0);
				
	//add vehidulos en lista
		lista.add(vd);
		lista.add(ve);
		
		assertEquals(2, lista.size());
		
	//comprobar en primera pos vd
		Vehiculo v=lista.get(0);
		assertTrue(v instanceof VehiculoDiesel);
		
	//como el elemento ha sido declarado como uno de la clase padre (vehiculo) en vez de la clase hijo (diesel)
	//no se pueden usar los métodos propios del hijo "get.Deposito()"
	//para ello se castea como VehiculoDiesel al cogerlo de la lista
		
		VehiculoDiesel vd1 = (VehiculoDiesel)lista.get(0);
		vd1.getDeposito();
		
	}

}
