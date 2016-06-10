/**
 * 
 */
package cl.curso.java.ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Gabriel Zagal
 *
 */
public class ProgramaPStatement {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
		
		PreparedStatement pstatementInsert = conexion.prepareStatement("INSERT INTO alumnos (idalumno, nombre, apellido, apellidoMaterno) VALUES (?,?,?,?);");
		pstatementInsert.setInt(1, 15);
		pstatementInsert.setString(2, "Gabriel");
		pstatementInsert.setString(3, "Zagal");
		pstatementInsert.setString(4, "Brevis");
		
		int resultpsInsert = pstatementInsert.executeUpdate();
		System.out.println(resultpsInsert);
		
	}

}
