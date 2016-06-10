/**
 * 
 */
package cl.curso.java.guia11.threads.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class RetirarDineroThread extends Thread {
	private CuentaBancaria cuentaBancaria;
	private int montoARetirar;
	
	public RetirarDineroThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cuentaBancaria
	 * @param montoARetirar
	 */
	public RetirarDineroThread(CuentaBancaria cuentaBancaria, int montoARetirar) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.montoARetirar = montoARetirar;
	}

	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	/**
	 * @return the montoARetirar
	 */
	public int getMontoARetirar() {
		return montoARetirar;
	}

	/**
	 * @param montoARetirar the montoARetirar to set
	 */
	public void setMontoARetirar(int montoARetirar) {
		this.montoARetirar = montoARetirar;
	}
	
	@Override
	public void run(){
		this.getCuentaBancaria().retirarDinero(this.getMontoARetirar());
	}
}
