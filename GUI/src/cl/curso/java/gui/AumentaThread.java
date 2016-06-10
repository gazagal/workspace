/**
 * 
 */
package cl.curso.java.gui;

/**
 * @author Gabriel Zagal
 *
 */
public class AumentaThread extends Thread {
	private Contador contador;
	
	/**
	 * @param contador
	 */
	public AumentaThread(Contador contador) {
		super();
		this.contador = contador;
	}

	/**
	 * @return the contador
	 */
	public Contador getContador() {
		return contador;
	}



	/**
	 * @param contador the contador to set
	 */
	public void setContador(Contador contador) {
		this.contador = contador;
	}


	public void run(){
		for(int i = 0; i<3;i++){
			contador.aumentaCuenta();
		}
	}
}
