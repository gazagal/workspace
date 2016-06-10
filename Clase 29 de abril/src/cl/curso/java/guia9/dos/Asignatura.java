/**
 * 
 */
package cl.curso.java.guia9.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Asignatura {
	private String nombreAsignatura;
	private String nombreProfesor;
	private Alumno[] alumnos;
	
	public Asignatura(){
		
	}

	/**
	 * @param nombreAsignatura
	 * @param nombreProfesor
	 * @param alumnos
	 */
	public Asignatura(String nombreAsignatura, String nombreProfesor, Alumno[] alumnos) {
		this.nombreAsignatura = nombreAsignatura;
		this.nombreProfesor = nombreProfesor;
		this.alumnos = alumnos;
	}

	/**
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	/**
	 * @return the nombreProfesor
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}

	/**
	 * @param nombreProfesor the nombreProfesor to set
	 */
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	public void imprimir(){
		System.out.println(this.getNombreAsignatura());
		System.out.println(this.getNombreProfesor());
		
		for (int i = 0; i<this.getAlumnos().length; i++){
			this.getAlumnos()[i].imprimir();
		}
	}
	
}
