/**
 * 
 */
package cl.curso.java.guia12.cinco;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Persona {
	private String nombre;
	private int saldo;
	private List<CuentaBancaria> cuentas;
	
	public Persona() {
	}

	/**
	 * @param nombre
	 * @param saldo
	 * @param cuentas
	 */
	public Persona(String nombre, int saldo, List<CuentaBancaria> cuentas) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.cuentas = cuentas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cuentas
	 */
	public List<CuentaBancaria> getCuentas() {
		return cuentas;
	}

	/**
	 * @param cuentas the cuentas to set
	 */
	public void setCuentas(List<CuentaBancaria> cuentas) {
		this.cuentas = cuentas;
	}
	
	public void girarDinero(int monto){
		Collections.max(this.getCuentas(),new Comparator<CuentaBancaria>() {

			@Override
			public int compare(CuentaBancaria o1, CuentaBancaria o2) {
				return new Integer(o1.getSaldo()).compareTo(new Integer(o2.getSaldo()));
			}
		}).girarDinero(monto);
		this.setSaldo(getSaldo()+monto);
	}
	
	public void depositarDinero(int monto){
		Collections.min(this.getCuentas(), new Comparator<CuentaBancaria>() {

			@Override
			public int compare(CuentaBancaria o1, CuentaBancaria o2) {
				return new Integer(o1.getSaldo()).compareTo(new Integer(o2.getSaldo()));
			}
		}).depositarDinero(monto);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", saldo=" + saldo + ", cuentas=" + cuentas + "]";
	}
	
}
