/**
 * 
 */
package cl.curso.java.guia9.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class PerfilDos {
	private String nombreDePerfil;
	private String descripcion;
	private Permiso permiso;
	
	/**
	 * constructor por defecto
	 */
	public PerfilDos(){
		
	}

	/**
	 * @param nombreDePerfil
	 * @param descripcion
	 * @param permiso
	 */
	public PerfilDos(String nombreDePerfil, String descripcion, Permiso permiso) {
		this.nombreDePerfil = nombreDePerfil;
		this.descripcion = descripcion;
		this.permiso = permiso;
	}

	/**
	 * @return the nombreDePerfil
	 */
	public String getNombreDePerfil() {
		return nombreDePerfil;
	}

	/**
	 * @param nombreDePerfil the nombreDePerfil to set
	 */
	public void setNombreDePerfil(String nombreDePerfil) {
		this.nombreDePerfil = nombreDePerfil;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the permiso
	 */
	public Permiso getPermiso() {
		return permiso;
	}

	/**
	 * @param permiso the permiso to set
	 */
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

	public void imprimir(){
		System.out.println(this.getNombreDePerfil());
		System.out.println(this.getDescripcion());
		this.getPermiso().imprimir();
	}
	
}
