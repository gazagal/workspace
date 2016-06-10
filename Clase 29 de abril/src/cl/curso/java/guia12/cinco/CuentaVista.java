/**
 * 
 */
package cl.curso.java.guia12.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public class CuentaVista extends CuentaBancaria {
	
	/**
	 * 
	 */
	public CuentaVista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCuenta
	 * @param saldo
	 */
	public CuentaVista(int numeroCuenta, int saldo) {
		super(numeroCuenta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void girarDinero(int monto) {
		if(this.getSaldo()>= monto){
			this.setSaldo(getSaldo()- monto);
		}else{
			System.out.println("Saldo insuficiente, su saldo actual es "+this.getSaldo());
		}
	}

}
