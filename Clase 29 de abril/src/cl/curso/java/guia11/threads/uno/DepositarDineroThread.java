/**
 * 
 */
package cl.curso.java.guia11.threads.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class DepositarDineroThread extends Thread {
	private CuentaBancaria cuentaBancaria;
	private int montoADepositar;
	
	public DepositarDineroThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cuentaBancaria
	 * @param montoADepositar
	 */
	public DepositarDineroThread(CuentaBancaria cuentaBancaria, int montoADepositar) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.montoADepositar = montoADepositar;
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
	 * @return the montoADepositar
	 */
	public int getMontoADepositar() {
		return montoADepositar;
	}

	/**
	 * @param montoADepositar the montoADepositar to set
	 */
	public void setMontoADepositar(int montoADepositar) {
		this.montoADepositar = montoADepositar;
	}
	
	@Override
	public void run(){
		this.getCuentaBancaria().depositarDinero(this.getMontoADepositar());
	}
}
