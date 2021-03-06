/**
 * 
 */
package cl.curso.java.guia12.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class CuentaBancaria {
	private int numeroCuenta;
	private int saldo;
	
	
	public CuentaBancaria() {
	}

	/**
	 * @param numeroCuenta
	 * @param saldo
	 */
	public CuentaBancaria(int numeroCuenta, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
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
	
	public abstract void girarDinero (int monto);
	public void depositarDinero(int monto){
		this.setSaldo(getSaldo()+monto);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}

	public void imprimir(){
		this.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CuentaBancaria){
			return this.getNumeroCuenta() == ((CuentaBancaria)obj).getNumeroCuenta();
		}
		return false;
	}
}
