/**
 * 
 */
package cl.curso.java.guia10.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmpleadoContratado empleadoUno= new EmpleadoContratado("Gabriel", 40);
		System.out.println(empleadoUno.calcularSalario());
		
		EmpleadoComision empleadoDos = new EmpleadoComision("Jose", 1, 2, 1000);
		System.out.println(empleadoDos.calcularSalario());
		
		
	}

}
