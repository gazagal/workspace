/**
 * 
 */
package cl.curso.java.ejemplos.observer;

/**
 * @author Gabriel Zagal
 *
 */
public class SensorHumo extends Sensor {
	private long ppm;
	
	/**
	 * @return the ppm
	 */
	public long getPpm() {
		return ppm;
	}

	/**
	 * @param ppm the ppm to set
	 */
	public void setPpm(long ppm) {
		this.ppm = ppm;
	}

	@Override
	public void notificar() {
		
	}


}
