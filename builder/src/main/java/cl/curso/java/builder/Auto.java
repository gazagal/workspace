/**
 * 
 */
package cl.curso.java.builder;

import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Auto {
	private String marca;
	private String modelo;
	private List<Ruedas> ruedas;
	private GPS gps;
	private Motor motor;
	
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the ruedas
	 */
	public List<Ruedas> getRuedas() {
		return ruedas;
	}
	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(List<Ruedas> ruedas) {
		this.ruedas = ruedas;
	}
	/**
	 * @return the gps
	 */
	public GPS getGps() {
		return gps;
	}
	/**
	 * @param gps the gps to set
	 */
	public void setGps(GPS gps) {
		this.gps = gps;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", ruedas=" + ruedas + ", gps=" + gps + ", motor="
				+ motor + "]";
	}
	
	
}
