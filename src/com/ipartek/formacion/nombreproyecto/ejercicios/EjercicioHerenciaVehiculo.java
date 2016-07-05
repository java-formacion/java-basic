package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Vehiculo;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoDiesel;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoElectrico;

public class EjercicioHerenciaVehiculo {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		VehiculoElectrico ve1 = new VehiculoElectrico("Telsa");
		//ve1.setNombre("Telsa");
		lista.add(ve1);
		
		VehiculoDiesel vd1 = new VehiculoDiesel("Seat Leon");
		//vd1.setNombre("Seat Leon");
		lista.add(vd1);
		
		VehiculoDiesel vd2 = new VehiculoDiesel("Cinquecento");
		//vd2.setNombre("Cinquecento");
		lista.add(vd2);
		
		VehiculoElectrico ve2 = new VehiculoElectrico("Toyota Prius");
		//ve2.setNombre("Toyota Prius");
		lista.add(ve2);
		
		int deposito = 0;
		float bateria = 0f;
		String nombre = "";
		
		for (Vehiculo vehiculo : lista) {		
			nombre = vehiculo.getNombre();
			
			if (vehiculo instanceof VehiculoDiesel){
				deposito = ((VehiculoDiesel) vehiculo).getDeposito();
				System.out.println(nombre + ". Deposito: " + deposito + " litros");
				
			}else if (vehiculo instanceof VehiculoElectrico){
				bateria = ((VehiculoElectrico) vehiculo).getCapacidadBateria();
				System.out.println(nombre + ". Bateria: " + bateria + " amperios");
			}else{
				System.out.println(nombre);
			}
		}

	}

}
