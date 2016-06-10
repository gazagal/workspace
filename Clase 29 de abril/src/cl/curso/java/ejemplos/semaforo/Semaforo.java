/**
 * 
 */
package cl.curso.java.ejemplos.semaforo;

/**
 * @author Gabriel Zagal
 *
 */
public class Semaforo {
	private EstadoSemaforo estadoSemaforo;

	/**
	 * @param estado
	 */
	public Semaforo(EstadoSemaforo estadoSemaforo) {
		super();
		this.estadoSemaforo = estadoSemaforo;
	}

	/**
	 * @return the estado
	 */
	public EstadoSemaforo getEstadoSemaforo() {
		return estadoSemaforo;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstadoSemaforo(EstadoSemaforo estado) {
		this.estadoSemaforo = estado;
	}
	
	public void cambiarColor(){
		this.getEstadoSemaforo().siguienteColor(this);
		System.out.println(this.getEstadoSemaforo());
	}
	
}
