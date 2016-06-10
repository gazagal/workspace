/**
 * 
 */
package cl.curso.java.control_cuatro.gzagal;

/**
 * @author Gabriel Zagal
 *hilo para reservar un libro
 */
public class ReservarLibroThread extends Thread {
	private Libro libro;
	
	/**
	 * 
	 */
	public ReservarLibroThread() {
	}

	/**
	 * @param libro
	 */
	public ReservarLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	@Override
	public void run(){
		this.getLibro().reservarLibro();
	}
	
}
