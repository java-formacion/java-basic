package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;
public class PruebaVehiculos {

	static VehiculoDiesel vd1 = new VehiculoDiesel("Seat Leon", 4, 43214f, 96246f);
	static VehiculoDiesel vd2 = new VehiculoDiesel("Chinncuechento", 5, 3543f, 12452f);
	static VehiculoElect ve1 = new VehiculoElect("Tesla", 6, 243632f, 87657f);
	static VehiculoElect ve2 = new VehiculoElect("Toyota Prius", 4, 621414f, 543653f);
	static ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
	
	public static void main(String[] args) {

	lista.add(ve1);
	lista.add(vd1);
	lista.add(vd2);
	lista.add(ve2);
	
		for (Vehiculo v : lista) {
			System.out.println(" Nombre del vehiculo: " + v.getNombre());
			
			if (v instanceof VehiculoDiesel) {
				System.out.println("VehiculoDiesel");
				System.out.println(((VehiculoDiesel)v).getDeposito());
			}else if (v instanceof VehiculoElect){
				System.out.println("VehiculoElect");
			}
			
		}
	}
}
