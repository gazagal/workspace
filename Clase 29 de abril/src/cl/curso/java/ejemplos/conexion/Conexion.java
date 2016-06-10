/**
 * 
 */
package cl.curso.java.ejemplos.conexion;

/**
 * @author Gabriel Zagal
 *
 */
public class Conexion {
	private EstadoConexion estadoConexion;
	
	public Conexion(){
	}

	/**
	 * @param estadoConexion
	 */
	public Conexion(EstadoConexion estadoConexion) {
		super();
		this.estadoConexion = estadoConexion;
	}

	/**
	 * @return the estadoConexion
	 */
	public EstadoConexion getEstadoConexion() {
		return estadoConexion;
	}

	/**
	 * @param estadoConexion the estadoConexion to set
	 */
	public void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}
	
	public void abrir() throws ConexionAbiertaException{
		this.getEstadoConexion().abrir(this);
		
	}
	
	public void cerrar() throws ConexionCerradaException{
		this.getEstadoConexion().cerrar(this);
	}
}
