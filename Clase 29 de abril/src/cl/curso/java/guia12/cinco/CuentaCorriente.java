/**
 * 
 */
package cl.curso.java.guia12.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public class CuentaCorriente extends CuentaBancaria{
	
	private int lineaDeCredito;
	
	public CuentaCorriente() {
	}
	
	/**
	 * @param numeroCuenta
	 * @param saldo
	 */
	public CuentaCorriente(int numeroCuenta, int saldo, int lineaDeCredito) {
		super(numeroCuenta, saldo);
		this.lineaDeCredito = lineaDeCredito;
	}

	/**
	 * @return the lineaDeCredito
	 */
	public int getLineaDeCredito() {
		return lineaDeCredito;
	}

	/**
	 * @param lineaDeCredito the lineaDeCredito to set
	 */
	public void setLineaDeCredito(int lineaDeCredito) {
		this.lineaDeCredito = lineaDeCredito;
	}

	@Override
	public void girarDinero(int monto) {
		if (this.getSaldo()>= monto){
			this.setSaldo(getSaldo()-monto);
		}else{
			if ((this.getSaldo()+this.getLineaDeCredito())>=monto){
				int aux = monto - this.getSaldo();
				this.setSaldo(0);
				this.setLineaDeCredito(getLineaDeCredito()-aux);
			}else{
				System.out.println("Saldo Insuficiente. \nSaldo: "+this.getSaldo()+"\nLinea de credito: "+this.getLineaDeCredito());
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"[lineaDeCredito=" + lineaDeCredito + "]";
	}
	

}
