package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		String pathFichero = "data/personas.txt";
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);

			String linea = "";

			int contadorLeidas = 0;
			int contadorErroneas = 0;
			int registroErroneo = 0;
			

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

				String campos[] = linea.split(",");

				if (campos.length != 7) {
					contadorErroneas++;
					registroErroneo = contadorLeidas;
				} else {
					
				}

				contadorLeidas++;

			}
			System.out.println("---------------------------------");
			System.out.println("Personas leidas " + contadorLeidas);
			System.out.println("Personas Erroneas " + contadorErroneas);
			System.out.println("Persona mal registada " + registroErroneo);

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
