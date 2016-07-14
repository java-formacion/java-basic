package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		
		String pathFichero = "data/personas.txt";
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = "";
			
			int cont = 0;
			ArrayList<Persona> aPersonas = new ArrayList<Persona>();
			while((linea = br.readLine()) != null){
				
				System.out.println(linea);
				
				String campos[] = linea.split(",");
				if (7 == campos.length){
					
					aPersonas.add(new Persona(campos[0], campos[1], campos[2], campos[4], campos[5]));
					
				}else{
					
					cont++;
				}
				
			}
			
			br.close();
			fr.close();
			
			System.out.println("--------------------------");
			System.out.println("Personas no validas "+cont);

			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero "+pathFichero);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}
	}

}
