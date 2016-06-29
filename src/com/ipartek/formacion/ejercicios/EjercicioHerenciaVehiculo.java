package com.ipartek.formacion.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Vehiculo;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoDiesel;
import com.ipartek.formacion.nombreproyecto.pojo.VehiculoElectrico;

public class EjercicioHerenciaVehiculo {
	public static void main(String[] args) {
		//Declaramos el array
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		//Creamos los 4 objetos, hijos de la clase Vehiculo
		VehiculoElectrico ve = new VehiculoElectrico("Tesla");
		//ve.setNombre("Tesla");
		ve.setNumPlazas(5);
		ve.setPotencia(90);
		ve.setDimensiones(20.47f);
		ve.setCapacidadBateria(50.80f);
		VehiculoElectrico ve2 = new VehiculoElectrico();
		ve2.setNombre("Toyota Prius");
		ve2.setNumPlazas(3);
		ve2.setPotencia(120);
		ve2.setDimensiones(24.17f);
		ve2.setCapacidadBateria(25.98f);
		VehiculoDiesel vd = new VehiculoDiesel("Seat León");
		//vd.setNombre("Seat León");
		vd.setNumPlazas(5);
		vd.setPotencia(120);
		vd.setDimensiones(24.39f);
		vd.setDeposito(70);
		VehiculoDiesel vd2 = new VehiculoDiesel();
		vd2.setNombre("Chincuenchento");
		vd2.setNumPlazas(3);
		vd2.setPotencia(50);
		vd2.setDimensiones(12.07f);
		vd2.setDeposito(40);
		
		//Rellenamos el array
		listaVehiculos.add(ve);
		listaVehiculos.add(ve2);
		listaVehiculos.add(vd);
		listaVehiculos.add(vd2);
		
		//Metodo for tradicional
		/*for (int i=0; i<listaVehiculos.size(); i++){
			if (listaVehiculos.get(i) instanceof VehiculoDiesel){
				System.out.println(((Vehiculo) listaVehiculos.get(i)).getNombre()+" "+((VehiculoDiesel)listaVehiculos.get(i)).getDeposito());
			}else{
				System.out.println(((Vehiculo) listaVehiculos.get(i)).getNombre()+" "+((VehiculoElectrico)listaVehiculos.get(i)).getCapacidadBateria());
			}
		}*/
		
		//Metodo for each
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo instanceof VehiculoDiesel){
				System.out.println(vehiculo.getNombre()+" "+((VehiculoDiesel)vehiculo).getDeposito());
			}else{
				System.out.println(vehiculo.getNombre()+" "+((VehiculoElectrico)vehiculo).getCapacidadBateria());
			}
		}
	}
}
