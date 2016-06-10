/**
 * 
 */
package cl.curso.java.ejemplos.conexion;

/**
 * @author Gabriel Zagal
 *
 */
public class ConexionAbierta extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) throws ConexionAbiertaException {
		throw new ConexionAbiertaException("La conexion ya esta abierta");
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionCerrada());
	}
	
	
}
