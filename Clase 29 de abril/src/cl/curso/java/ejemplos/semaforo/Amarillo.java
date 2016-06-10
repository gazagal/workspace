/**
 * 
 */
package cl.curso.java.ejemplos.semaforo;

/**
 * @author Gabriel Zagal
 *
 */
public class Amarillo extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo(new Rojo());
	}

}
