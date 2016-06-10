/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *Crea y define metodos de una Cuenta Bancaria
 */
public class CuentaBancaria {
	private int numero;
	private List<Transaccion> transacciones;
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * @param transacciones the transacciones to set
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	/**
	 * ordena las Transacciones segun la fecha de la transaccion
	 */
	public void ordenarTransaccionesPorFecha(){
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}
		});
	}
	
	/**
	 * ordena las transacciones segun el tipo de transaccion
	 * mostrando primero "deposito" y luego "abono"
	 */
	public void ordenarTransaccionesPorTipo(){
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				return o2.getTipo().compareTo(o1.getTipo());
			}
		});
	}
	
	/**
	 * imprime la lista de transacciones
	 */
	public void imprimir(){
		System.out.println(this.getNumero());
		for(int i=0;i< this.getTransacciones().size();i++){
			System.out.println(this.getTransacciones().get(i));
		}
	}
}
