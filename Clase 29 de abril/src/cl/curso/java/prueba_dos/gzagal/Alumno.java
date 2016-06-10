/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea el comportamiento y los atributos de los alumnos
 */
public class Alumno implements Imprimible {
	private String nombre;
	private double promedio;

	public Alumno() {
	}

	/**
	 * @param nombre
	 * @param promedio
	 */
	public Alumno(String nombre, double promedio) {
		this.nombre = nombre;
		this.promedio = promedio;
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
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio
	 *            the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public void imprimir() {
		System.out.println("");
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Promedio: " + this.getPromedio());

	}

}
