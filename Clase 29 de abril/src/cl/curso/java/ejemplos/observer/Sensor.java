/**
 * 
 */
package cl.curso.java.ejemplos.observer;

import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class Sensor {
	private List<Observador> observadores;

	/**
	 * @return the observadores
	 */
	public List<Observador> getObservadores() {
		return observadores;
	}

	/**
	 * @param observadores the observadores to set
	 */
	public void setObservadores(List<Observador> observadores) {
		this.observadores = observadores;
	}
	
	public abstract void notificar();
	
	public  void agregar(Observador observador){
		this.getObservadores().add(observador);
	}
	public  void eliminar(Observador observador){
		this.getObservadores().remove(observador);
	}
}
