package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		String pathFichero = "data/personas.txt";
		long tiempo = System.currentTimeMillis();
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			int cont = 0;
			int cont2 = 0;
			String campos[];
			StringBuffer sb = new StringBuffer();
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				
				campos = linea.split(",");
				
				if (campos.length == 7){
					//crear objeto Persona
					p = new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]);
					//TODO insertar en la tabla de la bbdd
				}else{
					cont2++;
					sb.append(cont+": "+linea);
				}
				
				cont++;
			}
			
			System.out.println("------------------");
			System.out.println("Personas leidas: "+cont);
			System.out.println("Personas erroneas: "+cont2);
			System.out.println("Detalle lineas erroneas: ");
			System.out.println(sb.toString());
			System.out.println("--------------------------------");
			System.out.println("Tiempo: "+(System.currentTimeMillis() - tiempo)+" milisegundos");
			System.out.println("--------------------------------");
			
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
