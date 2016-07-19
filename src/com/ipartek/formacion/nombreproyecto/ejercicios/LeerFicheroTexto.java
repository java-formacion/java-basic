package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import conexion.Conexion;

public class LeerFicheroTexto {
	
	public static void main(String[] args) {
		String pathFichero = "data/personas.txt";
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			int r = 0;
			int lOK = 0;
			int lFail = 0;
			ArrayList<Integer> rFail = new ArrayList<Integer>();
			while((linea = br.readLine()) != null){
				String[] s = linea.split(",");
				r++;
				if(s.length != 7){
					lFail++;
					rFail.add(r);
				}else{
					lOK++;
					PreparedStatement ptmt = Conexion.getConexion().prepareStatement("INSERT INTO `personas`.`persona`(nombre,email) VALUES(?,?)");
					ptmt.setString(1, s[0].toString());
					ptmt.setString(2, s[4].toString());
					ptmt.executeUpdate();
					ptmt.close();
					System.out.println(lOK + " - " + s[0] + " - " + s[4]);	
				}
			}
			System.out.println("-------------------------------------------------------");
			System.out.println("Registros correctos: " + lOK);
			System.out.println("Registros erroneos: " + lFail);
			for (int j = 0; j < rFail.size(); j++) {
				System.out.println("\tNº Registro erroneo: " + rFail.get(j));
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer el fichero " + pathFichero);
		} catch (Exception e){
			System.out.println("Excepcion no controlada");
		}
	}
}
