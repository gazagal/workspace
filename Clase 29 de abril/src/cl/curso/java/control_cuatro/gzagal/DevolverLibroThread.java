/**
 * 
 */
package cl.curso.java.control_cuatro.gzagal;

/**
 * @author Gabriel Zagal
 *hilo para devolver un libro
 */
public class DevolverLibroThread extends Thread {
	private Libro libro;

	/**
	 * 
	 */
	public DevolverLibroThread() {
	}

	/**
	 * @param libro
	 */
	public DevolverLibroThread(Libro libro) {
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
		this.getLibro().devolverLibro();
	}
	
	
}
