package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	// CONSTANTES PARA CONEXION DE BBDD
		private static final String DRIVER = "com.mysql.jdbc.Driver";
		private static final String SERVER = "127.0.0.1";
		private static final String DATABASE = "javabasic";
		private static final String USER = "root";
		private static final String PASS = "";
		private static final String PORT = "3306";

		private static String insert_persona = "INSERT INTO `persona` (`nombre`, `email`) VALUES (?, ?);";
		private static String truncate_persona = "TRUNCATE `persona`;";
		private static String resetear_autoincrement = "ALTER TABLE persona AUTO_INCREMENT = 348;";

		public static void main(String[] args) {

			// preguntar si quiere insertar o eliminar
			System.out.println("Seleccione insertar '1' o eliminar '2'");
			// declarar scaner para introducir datos por consola
			Scanner scanner = new Scanner(System.in);
			int op = scanner.nextInt();

			long tiempo = System.currentTimeMillis();
			String pathFichero = "data/personas.txt";

			// objeto Connection para crear la conexion
			Connection conexion = null;

			try {

				// Cargar driver BD MySql
				Class.forName(DRIVER);

				// Conexion con BBDD
				conexion = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USER, PASS);

				FileReader fr = new FileReader(pathFichero);
				BufferedReader br = new BufferedReader(fr);
				String linea = "";
				String campos[];
				StringBuffer sb = new StringBuffer();

				int cont = 0;
				int contErrores = 0;

				int contInsert = 0;
				int contInsertError = 0;

				if (op == 1) {

					while ((linea = br.readLine()) != null) {

						campos = linea.split(",");
						if (campos.length == 7) {

							// preparar comando sql a null
							PreparedStatement pst = null;

							// preparar sentencia sql y sustituimos interrogantes
							// por
							// valores
							pst = conexion.prepareStatement(insert_persona);
							pst.setString(1, campos[0]);
							pst.setString(2, campos[4]);

							// ejecutar sentencia
							if (pst.executeUpdate() == 1) {
								contInsert++;
							} else {
								contInsertError++;
								sb.append(cont + ": " + linea);
							}

						} else {
							contErrores++;
							sb.append(cont + ": " + linea);
						}
						cont++;
					}
					System.out.println("-----------------------------");
					System.out.println("Personas leidas: " + cont);
					System.out.println("Personas insertadas: " + contInsert);
					System.out.println("Personas insertadas incorectamente: " + contInsertError);
					System.out.println("Personas Erroneas: " + contErrores);
					System.out.println("Detalle lineas Erroneas: ");
					System.out.println(sb.toString());
					System.out.println("----------------------------------------");

					System.out
							.println(
									"Tiempo: " + (String.format("%d min, %d sec",
											TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()
													- tiempo),
							TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - tiempo) - TimeUnit.MINUTES
									.toSeconds(TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - tiempo)))));
					System.out.println("----------------------------------------");
					br.close();
					fr.close();
				} else if (op == 2) {
					// preparar comandos sql a null
					PreparedStatement pstDelete = null;
					PreparedStatement pstAutoZero = null;
					// preparar sentencia sql y sustituimos interrogantes
					// por
					// valores
					pstDelete = conexion.prepareStatement(truncate_persona);
					pstAutoZero = conexion.prepareStatement(resetear_autoincrement);
					// ejecutar sentencia
					pstDelete.executeUpdate();
					pstAutoZero.executeUpdate();
						
				} else {
					System.out.println("Opcion no valida");
				}

			} catch (SQLException e) {
				System.out.println("Fallo de base de datos");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.out.println("No se puede leer fichero " + pathFichero);
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Excepcion no controlada");
				e.printStackTrace();

				// cerrar conexion
			} finally {
				try {
					conexion.close();
				} catch (SQLException e) {
					System.out.println("Excepcion cerrando conexion");
					e.printStackTrace();
				}
			}

		}

}
