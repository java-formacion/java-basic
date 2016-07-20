package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.ipartek.formacion.nombreproyecto.Utilidades;
import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	//CONSTANTES PARA CONEXION A BBDD
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String USUARIO = "root";
	private static final String PASS = "";
	private static final String PORT = "3306";
	private static final String DATABASE = "javabasic";

	private static String insert_persona = "INSERT INTO `persona` (`nombre`,`email`) VALUES (?,?);";
	private static String truncate_persona = "TRUNCATE `persona`;";
	private static String resetear_autoincrement = "ALTER TABLE persona AUTO_INCREMENT = 1;";
	
	private static final int OPCION_INSERTAR = 1;
	private static final int OPCION_ELIMINAR = 2;

	private static final String PATH_FICHERO = "data/script.sql";

	public static void main(String[] args) {

		String pathFichero = "data/personas.txt";
		// preguntar si quiere insertar o eliminar
		System.out.println("Seleccione insertar '1' o eliminar '2'");
		// declarar scaner para introducir datos por consola
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		long millis = System.currentTimeMillis(); // tiempo que tarda en
													// ejecutarse
		long hours = 0;
		long minutes = 0;
		long seconds = 0;

		Connection con = null;
		PreparedStatement pst = null;

		try {

			// Cargar Driver BaseDatos MySQL
			Class.forName(DRIVER);

			// Establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USUARIO, PASS);

			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);

			String linea = "";

			int contErrores = 0;
			int cont = 0;
			int contInsert = 0;
			StringBuffer sb = new StringBuffer();
			Persona p = null;
			String campos[];
			ArrayList<Persona> aPersonas = new ArrayList<Persona>();
			if (op == OPCION_INSERTAR){
				while ((linea = br.readLine()) != null) {
			
				System.out.println(cont + " " + linea);

				campos = linea.split(",");
				if (7 == campos.length) {

					// crear objeto

					aPersonas.add(new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]));

					// Preparar comando SQL
					pst = con.prepareStatement(insert_persona);
					pst.setString(1, campos[0]);
					pst.setString(2, campos[4]);

					// Ejecutar sentencia
					if (pst.executeUpdate() == 1) {

						contInsert++;

					} else {
						contErrores++;
						sb.append(cont + " : " + linea);

					}
					pst = null;

				} else {

					contErrores++;
					sb.append(cont + " : " + linea);
				}
				cont++;

			}

			System.out.println("--------------------------");
			System.out.println("Personas leidas " + cont);
			System.out.println("Personas erroneas " + contErrores);
			System.out.println("Personas insertadas " + contInsert);
			System.out.println("Detalle lineas erroneas");
			System.out.println(sb.toString());
			System.out.println("--------------------------");
			millis = System.currentTimeMillis() - millis;
			System.out.println(Utilidades.conversorMilisegundos(millis));
			System.out.println("--------------------------");

			br.close();
			fr.close();
			}else if( op == OPCION_ELIMINAR){
				// preparar comandos sql a null
				PreparedStatement pstDelete = null;
				PreparedStatement pstAutoZero = null;
				// preparar sentencia sql y sustituimos interrogantes
				// por
				// valores
				pstDelete = con.prepareStatement(truncate_persona);
				pstAutoZero = con.prepareStatement(resetear_autoincrement);
				// ejecutar sentencia
				if (pstDelete.execute()) {
					pstAutoZero.executeUpdate();
					System.out.println("Eliminados todos los registros");
				} else {
					System.out.println("No se ha eliminado ningun registro, tabla vacia");
				}
			}else{
				System.out.println("Opcion no valida");
			}

		} catch (SQLException e) {

			System.out.println("Fallo de Base Datos");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {

			System.out.println("No existe DRIVER: " + DRIVER);

		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Excepcion cerrando Concexion");
				e.printStackTrace();
			}

		}
	}

}
