package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Ejercicio para buscar en la tabla 'persona' todas las que contengan su email
 * la cadena de texto "spambob"
 * 
 * @author Curso
 *
 */
public class BuscarPersonasByEmail {

	// CONSTANTES PARA CONEXION A BBDD
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String USUARIO = "root";
	private static final String PASS = "";
	private static final String PORT = "3306";
	private static final String DATABASE = "javabasic";
	private static final String consulta = "SELECT id,nombre,email FROM persona WHERE email LIKE '%spambob%' ;";

	public static void main(String[] args) throws Exception {

		Class.forName(DRIVER);
		Connection conexion = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USUARIO, PASS);
		
		PreparedStatement pst = conexion.prepareStatement(consulta);
		
		ResultSet rs = pst.executeQuery();
		int cont = 0;
		while ( rs.next() ){
			cont++;
			System.out.println("id: "+rs.getInt("id"));
			System.out.println("nombre: "+rs.getString("nombre"));
			System.out.println("email: "+rs.getString("email"));
			System.out.println(cont);
			System.out.println("---------------------------------");
		}
		
		rs.close();
		pst.close();
		conexion.close();
		
	}

}
