/**
 * 
 */
package cl.curso.java.ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Zagal
 *
 */
public class ProgramaUsuarios {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
		String password = JOptionPane.showInputDialog("Ingrese la password");
		
		PreparedStatement ps = conexion.prepareStatement("select * from curso.usuarios where nombre_usuario =? AND password =?;");
		ps.setString(1, nombreUsuario);
		ps.setString(2, password);
		
//		Statement st = conexion.createStatement();
//		st.executeUpdate("INSERT INTO usuarios (nombre_usuario, password) VALUES('"+nombreUsuario+"','"+password+"');");
//		
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			JOptionPane.showMessageDialog(null, "Acceso Correcto");
		}else{
			JOptionPane.showMessageDialog(null, "Acceso Denegado");
		}
		
		
	}

}
