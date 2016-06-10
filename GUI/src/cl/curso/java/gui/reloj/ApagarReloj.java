/**
 * 
 */
package cl.curso.java.gui.reloj;

/**
 * @author Gabriel Zagal
 *
 */
public class ApagarReloj extends Thread {
	private Reloj reloj;
	private long milisegundos;
	
	public ApagarReloj() {
	}

	/**
	 * @param reloj
	 * @param milisegundos
	 */
	public ApagarReloj(Reloj reloj, long milisegundos) {
		super();
		this.reloj = reloj;
		this.milisegundos = milisegundos;
	}

	/**
	 * @return the reloj
	 */
	public Reloj getReloj() {
		return reloj;
	}

	/**
	 * @param reloj the reloj to set
	 */
	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}

	/**
	 * @return the milisegundos
	 */
	public long getMilisegundos() {
		return milisegundos;
	}

	/**
	 * @param milisegundos the milisegundos to set
	 */
	public void setMilisegundos(long milisegundos) {
		this.milisegundos = milisegundos;
	}
	
	public void apagarReloj(){
		try {
			sleep(this.getMilisegundos());
			this.getReloj().setEncendido(false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
