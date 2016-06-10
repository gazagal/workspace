/**
 * 
 */
package cl.curso.java.ejemplos.semaforo;

/**
 * @author Gabriel Zagal
 *
 */
public class Verde extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo(new Amarillo());
	}

}
