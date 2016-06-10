/**
 * 
 */
package cl.curso.java.ejemplos.conexion;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class EstadoConexion {
	
	public abstract void abrir(Conexion conexion) throws ConexionAbiertaException;
	
	public abstract void cerrar(Conexion conexion) throws ConexionCerradaException;
	
}
