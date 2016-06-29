package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Vehiculo;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoDiesel;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoElectrico;

public class EjercicioHerenciaVehiculo {

	/**
	 * Asignamos valores a los vehiculos y después sacamos por pantalla sus atributos dependiendo si es Electrico o Diesel.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
			
		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla");
		ve1.setCapacidadBateria(200);
		vehiculos.add(ve1);
		
		VehiculoDiesel vd1 = new VehiculoDiesel("Seat Leon");
		vd1.setDeposito(300);
		vehiculos.add(vd1);
		
		Vehiculo v1 = new Vehiculo("Ford Mondeo");
		vehiculos.add(v1);
		
		VehiculoDiesel vd2 = new VehiculoDiesel("Chincuechento");
		vd2.setDeposito(220);
		vehiculos.add(vd2);

		VehiculoElectrico ve2 = new VehiculoElectrico("Toyota Prius");
		ve2.setCapacidadBateria(190);
		vehiculos.add(ve2);
		
		//Con una for i++ de toda la vida
		/*
		for (int i=0; i < vehiculos.size(); i++) {		
			System.out.println(i+1 + " Nombre: " + vehiculos.get(i).getNombre());
			
			if (vehiculos.get(i) instanceof VehiculoElectrico) {
				VehiculoElectrico ve = (VehiculoElectrico)vehiculos.get(i);
				System.out.println("  Capacidad bateria: " + ve.getCapacidadBateria() + "\n");
			
			}else if (vehiculos.get(i) instanceof VehiculoDiesel){
				VehiculoDiesel vd = (VehiculoDiesel)vehiculos.get(i);
				System.out.println("  Capacidad deposito: " + vd.getDeposito() + "\n");
			}else{
				System.out.println("  Vehiculo generico \n");
			}
		}
		*/
		
		//Con un for each
		for (Vehiculo v : vehiculos){
			System.out.println("Nombre: " + v.getNombre());
			
			if (v instanceof VehiculoElectrico){
				System.out.println("  Capacidad bateria: " + ((VehiculoElectrico)v).getCapacidadBateria() + " amperios\n");				
				
			}else if (v instanceof VehiculoDiesel){
				System.out.println("  Capacidad deposito: " + ((VehiculoDiesel)v).getDeposito() + " litros\n");
				
			}else{
				 System.out.println(" Vehiculo generico\n");
			}
		}
	}

}
