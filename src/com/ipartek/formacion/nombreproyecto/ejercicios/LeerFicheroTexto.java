package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		String pathFichero = "data/personas.txt";
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);

			String linea = "";
			
			int cont = 0;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				
				String campos[] = linea.split(",");
				
				//TODO crear objeto Persona
				
				cont++;
			}
			System.out.println("---------------------------------");
			System.out.println("Personas leidas " + cont);
			System.out.println("Personas Erroneas " + cont);
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}

	}

}
