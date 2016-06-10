/**
 * 
 */
package cl.curso.java.ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("El driver requerido no esta cargado.");
		}
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.124:3306/curso", "alumnos", "java123");
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("select * from alumnos");
			
			while(rs.next()){
				System.out.println(rs.getInt(1));
//				System.out.println(rs.getInt("idalumno"));
				
//				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
//			int resultado = s.executeUpdate("INSERT INTO curso.alumnos (idalumno, nombre, apellido) VALUES ('1000', 'Hola Mundo','java');");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}