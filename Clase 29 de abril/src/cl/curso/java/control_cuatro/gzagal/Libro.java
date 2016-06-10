/**
 * 
 */
package cl.curso.java.control_cuatro.gzagal;

/**
 * @author Gabriel Zagal 
 * clase libro que sirve para crear un libro y tiene los
 * metodos reservar y devolver libro
 */
public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	/**
	 * 
	 */
	public Libro() {
	}

	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 *            the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 *            the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * metodo sincronizado para reservar un libro
	 */
	public synchronized void reservarLibro() {
		if (this.getCantidadLibrosPrestados() >= this.getCantidadLibros()) {
			System.out.println("No quedan libros para reservar");
		} else {
			this.setCantidadLibrosPrestados(this.getCantidadLibrosPrestados() + 1);
			System.out.println("Libro reservado");
		}
	}

	/**
	 * metodo sincronizado para devolver un libro
	 */
	public synchronized void devolverLibro() {
		if (this.getCantidadLibrosPrestados() <= 0) {
			System.out.println("Ya devolvieron todos los libros");
		} else {
			this.setCantidadLibrosPrestados(this.getCantidadLibrosPrestados() - 1);
			System.out.println("Libro devuelto");
		}
	}
}
