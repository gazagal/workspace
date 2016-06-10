/**
 * 
 */
package cl.curso.java.gui;

/**
 * @author Gabriel Zagal
 *
 */
public class Contador {
	private int cuenta;
	
	public Contador() {
	}

	/**
	 * @return the cuenta
	 */
	public int getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @param cuenta
	 */
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}

	
	public void aumentaCuenta(){
		synchronized (this) {
			this.cuenta++;
			System.out.println(this.cuenta);
		}
		
	}
}
