package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import sun.reflect.misc.ConstructorUtil;

/**
 * Ejercicio para buscar en la tabla 'persona' todas las que contengan en su email 
 * la cadena de texto "spambob"
 */

public class BuscarPersonasByEmail {

	private static final String DRIVER   = "com.mysql.jdbc.Driver";
	private static final String SERVER   = "127.0.0.1";
	private static final String DATABASE = "javabasic";
	private static final String USUARIO  = "root";
	private static final String PASS     = "";
	private static final String PORT     = "3306";
	private static final String PATH_FICHERO = "data/personas.txt";
	static String consulta = "SELECT id, nombre, email FROM persona WHERE email LIKE '%spambob%'";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName(DRIVER);
		Connection conexion = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USUARIO, PASS );
		
		PreparedStatement pst = conexion.prepareStatement(consulta);
		
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()){
			System.out.println("Id: " + rs.getInt("id"));
			System.out.println("Nombre: " + rs.getString("nombre"));
			System.out.println("Email: " + rs.getString("email"));
			System.out.println("--------------------------------------");
		}
		
		rs.close();
		pst.close();
		conexion.close();
		
	}
	
	
}
