package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Vehiculo;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoDiesel;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoElectrico;

public class EjercicioVehiculosHerencia {

	public static void main(String[] args) {
		
		//declarar variables
		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla");
		VehiculoElectrico ve2 = new VehiculoElectrico("Toyota Prius");
		VehiculoDiesel vd1 = new VehiculoDiesel("Seat Leon");
		VehiculoDiesel vd2 = new VehiculoDiesel("Chicuetxento");		
						
		//añadir en lista vehiculos
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		lista.add(ve1);
		lista.add(vd1);
		lista.add(vd2);
		lista.add(ve2);
		
		//recorrer lista
		for (Vehiculo v : lista) {
		
			if ( v instanceof VehiculoDiesel){
				
				System.out.println( v.getNombre() + " " + ((VehiculoDiesel)v).getDeposito() + " litros" );
				
				
			}else if ( v instanceof VehiculoElectrico){
				
				System.out.println( v.getNombre() + " " + ((VehiculoElectrico)v).getCapacidadBateria() + " amperios" );
			}else{
				
				System.out.println("Vehiculo generico " + v.getNombre() );
			}
			
		}

			
		
		
	}

}
