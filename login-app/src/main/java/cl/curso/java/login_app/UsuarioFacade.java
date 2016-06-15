/**
 * 
 */
package cl.curso.java.login_app;

import java.sql.SQLException;

/**
 * @author Gabriel Zagal
 *
 */
public final class UsuarioFacade {
	
	/**
	 * 
	 * @throws AutenticacionException
	 * @throws CuentaBloqueadaException
	 * @throws SQLException 
	 */
	public static void login(Usuario usuario) throws AutenticacionException, CuentaBloqueadaException, SQLException {
		if (!(UsuarioDAO.validar(usuario))) {
			UsuarioDAO.aumentarIntentos(usuario);
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}

	}
	
}