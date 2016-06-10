/**
 * 
 */
package cl.curso.java.ejemplos.conexion;

/**
 * @author Gabriel Zagal
 *
 */
public class ConexionCerrada extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionAbierta());
		
	}

	@Override
	public void cerrar(Conexion conexion) throws ConexionCerradaException {
		throw new ConexionCerradaException("La conexion ya esta cerrada");
		
	}

}
