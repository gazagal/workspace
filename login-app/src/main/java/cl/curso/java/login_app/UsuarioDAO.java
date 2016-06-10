/**
 * 
 */
package cl.curso.java.login_app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Zagal
 *
 */
public final class UsuarioDAO {
	
	public static boolean validar(Usuario usuario) throws SQLException{
		Conexion con = Conexion.getInstancia();
		PreparedStatement ps = con.getConnetion().prepareStatement("select * from curso.usuarios where nombre_usuario =? AND password =?;");
		ps.setString(1, usuario.getUsuario());
		ps.setString(2, usuario.getPassword());
		ResultSet rs = ps.executeQuery();
		return rs.next();
	}
	
}
