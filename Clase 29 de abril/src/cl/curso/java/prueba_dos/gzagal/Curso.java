/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea el comportamiento y los atributos de un curso,
 * calcula el promedio general y el mejor promedio
 */
public class Curso implements Imprimible {
	private String nombre;
	private Alumno[] alumnos;

	public Curso() {
	}

	/**
	 * @param nombre
	 * @param alumnos
	 */
	public Curso(String nombre, Alumno[] alumnos) {
		this.nombre = nombre;
		this.alumnos = alumnos;
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
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos
	 *            the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public double calcularPromedioCurso() {
		double sumaPromedios = 0;
		for (int i = 0; i < this.getAlumnos().length; i++) {
			sumaPromedios = sumaPromedios + this.getAlumnos()[i].getPromedio();
		}
		return sumaPromedios / this.getAlumnos().length;
	}

	public double obtenerMejorPromedio() {
		int subIndiceMejorPromedio = 0;
		for (int i = 1; i < this.getAlumnos().length; i++) {
			if (this.getAlumnos()[i].getPromedio() > this.getAlumnos()[subIndiceMejorPromedio].getPromedio()) {
				subIndiceMejorPromedio = i;
			}
		}
		return this.getAlumnos()[subIndiceMejorPromedio].getPromedio();
	}

	@Override
	public void imprimir() {
		System.out.println("Nombre del Curso: " + this.getNombre());
		for (int i = 0; i < this.getAlumnos().length; i++) {
			this.getAlumnos()[i].imprimir();
		}
	}

}
