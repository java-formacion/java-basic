package com.ipartek.formacion.nombreproyecto;

import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Vehiculo;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoDiesel;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoElectrico;

public class EjercicioHerenciaVehiculo {

	public static void main(String[] args) {
		
		//declarar variables
		ArrayList<Vehiculo> alCoches = new ArrayList<Vehiculo>();
		
		VehiculoDiesel vd1 = new VehiculoDiesel("Seat Leon");
		VehiculoDiesel vd2 = new VehiculoDiesel("Citroen C4");
		
		
		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla");
		VehiculoElectrico ve2 = new VehiculoElectrico("Toyota");
		


		//añadir en lista vehiculos
		alCoches.add(ve1);
		alCoches.add(vd1);
		alCoches.add(vd2);
		alCoches.add(ve2);
		
		//recorrer lista
		for (int i = 0; i < alCoches.size(); i++){
			
			//si VehiculoDiesel
			if (alCoches.get(i) instanceof VehiculoDiesel){
				
				System.out.print("Nombre del vehículo Diesel: "+alCoches.get(i).getNombre());
				System.out.println(". Su depósito mínimo es de "+((VehiculoDiesel)alCoches.get(i)).getDeposito()+" litros.");
			
				//si VehiculoElectrico
			}else if(alCoches.get(i) instanceof VehiculoElectrico){
				
				System.out.print("Nombre del vehículo Eléctrico: "+alCoches.get(i).getNombre());
				System.out.println(". Su capacidad de batería es de "+((VehiculoElectrico)alCoches.get(i)).getCapacidadBateria()+" amperios.");
				
			}
		}
			
			//recorrer lista con for each
			for(Vehiculo v : alCoches){
				
				if (v instanceof VehiculoDiesel){
					
					System.out.println(v.getNombre()+" "+((VehiculoDiesel)v).getDeposito());
					
				}else if (v instanceof VehiculoElectrico){
					
					System.out.println(v.getNombre()+" "+((VehiculoElectrico)v).getCapacidadBateria());
					
				}else{
					
					System.out.println("Vehiculo genérico "+v.getNombre());
					
				}
				
				
			}
		
		
	}

}
