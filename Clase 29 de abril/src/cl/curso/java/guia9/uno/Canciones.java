/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Canciones {
	private String titulo;
	
	
	public Canciones(){
		
	}

	/**
	 * @param titulo
	 * @param numero
	 */
	public Canciones(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void imprimir(){
		System.out.println(this.getTitulo());
	}
	
}
