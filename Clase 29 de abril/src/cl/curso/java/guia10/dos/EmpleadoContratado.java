/**
 * 
 */
package cl.curso.java.guia10.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class EmpleadoContratado extends Empleado {
	
	
	
	
	/**
	 * 
	 */
	public EmpleadoContratado() {
	}

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
	}

	@Override
	public int calcularSalario() {
		return this.getHorasTrabajadas()*20000;
	}

}
