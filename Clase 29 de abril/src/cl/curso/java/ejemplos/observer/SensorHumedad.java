/**
 * 
 */
package cl.curso.java.ejemplos.observer;

/**
 * @author Gabriel Zagal
 *
 */
public class SensorHumedad extends Sensor {
	private int humedadRelativa;
	
	
	/**
	 * @return the humedadRelativa
	 */
	public int getHumedadRelativa() {
		return humedadRelativa;
	}

	/**
	 * @param humedadRelativa the humedadRelativa to set
	 */
	public void setHumedadRelativa(int humedadRelativa) {
		this.humedadRelativa = humedadRelativa;
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		
	}


}
