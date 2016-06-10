/**
 * 
 */
package cl.curso.java.guia11.threads.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class CuentaBancaria {
	private int saldo;
	private String numeroCuenta;
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param saldo
	 * @param numeroCuenta
	 */
	public CuentaBancaria(int saldo, String numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
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
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public synchronized void depositarDinero(int monto){
		this.setSaldo(this.getSaldo()+monto);
	}
	
	public synchronized void retirarDinero(int monto){
		if(this.getSaldo()<monto){
			System.out.println("Saldo insuficiente");
		}else{
			this.setSaldo(this.getSaldo()-monto);
		}
	}
}
