package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ipartek.formacion.nombreproyecto.enumeraciones.Vaso;
import com.sun.image.codec.jpeg.TruncatedFileException;

public class LeerFicheroTexto {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String SERVER = "127.0.0.1";
	public static final String DATABASE = "personas";
	public static final String USUARIO = "root";
	public static final String PASS = "";
	public static final String PORT = "3306";

	
	private static String delete_persona = "TRUNCATE INTO `personas`.`persona` (`nombre`, `email`) VALUES ( ? , ? );";
	private static String insert_persona = "INSERT INTO `personas`.`persona` (`nombre`, `email`) VALUES ( ? , ? );";

	public static void main(String[] args) {

		long tiempo = System.currentTimeMillis();
		String pathFichero = "data/personas.txt";
		Connection con = null;
		PreparedStatement pst = null;

		try {

			// cargar driver basedatos mysql
			Class.forName(DRIVER);
			
			
		
			
			
			//borrar datos insertados
		

			// establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USUARIO, PASS );
			

			FileReader fr = new FileReader(pathFichero);

			BufferedReader br = new BufferedReader(fr);
			String linea = "";

			int cont = 0;
			int contErrores = 0;
			int contInsert = 0;
			StringBuffer sb = new StringBuffer();
			
	//preguntar si quiere borrar los datos insertados anteriormente
			
			Scanner scanner = new Scanner(System.in);
		
			

			System.out.println("Quiere borrar datos insertados anteriormente? S/N");
			String op = scanner.next();
			
			System.out.println("ha seleccionado " + op);
		
				
			

			while ((linea = br.readLine()) != null) {

				System.out.println(linea);

				String campos[] = linea.split(",");
				if (campos.length == 7) {

					// crear objeto persona
					// p = new Persona(campos[0], campos[1], campos[2],
					// campos[5], campos[4]);

					// Todo insertar en tabla de la bbdd
					// INSERT INTO `personas`.`persona` (`nombre`) VALUES
					// ('manolo@manolo.com');
					// preparar sentencia sql y sustituimos "?" por valores
					
					
                    pst = con.prepareStatement(delete_persona);
					pst = con.prepareStatement(insert_persona);
					pst.setString(1, campos[0]);
					pst.setString(2, campos[4]);

					// Ejecutar sentencia
				
					if (pst.executeUpdate() == 1) {

						contInsert++;

					} else
						contErrores++;
					sb.append(cont + ":" + linea);

				} else {
					contErrores++;
					sb.append(cont + ": " + linea);
				}

				cont++;

			}

			System.out.println("-----------------------------");
			System.out.println("Personas leidas: " + cont);
			System.out.println("Personas Erroneas: " + contErrores);
			System.out.println("Personas insertadas: " + contInsert);
			System.out.println("Detalle lineas Erroneas: ");
			System.out.println(sb.toString());
			System.out.println("----------------------------------------");
			System.out.println("Tiempo: " + (System.currentTimeMillis() - tiempo) + " ms");
			System.out.println("----------------------------------------");

			br.close();
			fr.close();

		} catch (ClassNotFoundException e) {
			System.out.println(" Fallo base datos");
			e.printStackTrace();

		} catch (FileNotFoundException e) {

			System.out.println("No se puede leer el fichero" + pathFichero);
			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Excepcion no controlada" + pathFichero);
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Excepcion Cerrando Conexion");
				e.printStackTrace();
			}
		}

	}

}
