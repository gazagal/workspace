/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author {Gabriel Zagal}
 *
 */
public class Disco {
	private String nombreDelDisco;
	private String nombreDelAutor;
	private String generoMusical;
	private Canciones[] canciones;
	
	
	public Disco(){
		
	}


	/**
	 * @param nombreDelDisco
	 * @param nombreDelAutor
	 * @param generoMusical
	 * @param canciones
	 */
	public Disco(String nombreDelDisco, String nombreDelAutor, String generoMusical, Canciones[] canciones) {
		this.nombreDelDisco = nombreDelDisco;
		this.nombreDelAutor = nombreDelAutor;
		this.generoMusical = generoMusical;
		this.canciones = canciones;
	}


	/**
	 * @return the nombreDelDisco
	 */
	public String getNombreDelDisco() {
		return nombreDelDisco;
	}


	/**
	 * @param nombreDelDisco the nombreDelDisco to set
	 */
	public void setNombreDelDisco(String nombreDelDisco) {
		this.nombreDelDisco = nombreDelDisco;
	}


	/**
	 * @return the nombreDelAutor
	 */
	public String getNombreDelAutor() {
		return nombreDelAutor;
	}


	/**
	 * @param nombreDelAutor the nombreDelAutor to set
	 */
	public void setNombreDelAutor(String nombreDelAutor) {
		this.nombreDelAutor = nombreDelAutor;
	}


	/**
	 * @return the generoMusical
	 */
	public String getGeneroMusical() {
		return generoMusical;
	}


	/**
	 * @param generoMusical the generoMusical to set
	 */
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}


	/**
	 * @return the canciones
	 */
	public Canciones[] getCanciones() {
		return canciones;
	}


	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(Canciones[] canciones) {
		this.canciones = canciones;
	}
	
	public void imprimir(){
		System.out.println(this.getNombreDelDisco());
		System.out.println(this.getNombreDelAutor());
		System.out.println(this.getGeneroMusical());
		
		for (int i = 0; i<canciones.length; i++){
			System.out.println((i+1)+". ");
			canciones[i].imprimir();
		}
	}
	
	
	
}
