/**
 * 
 */
package cl.curso.java.gui.reloj;

/**
 * @author Gabriel Zagal
 *
 */
public class Timer extends Thread {
	private Reloj reloj;

	/**
	 * @param reloj
	 */
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}

	/**
	 * @return the reloj
	 */
	public Reloj getReloj() {
		return reloj;
	}

	/**
	 * @param reloj
	 *            the reloj to set
	 */
	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}

	public void run() {
		while (this.getReloj().isEncendido()) {
			reloj.avanzarSegundo();
			System.out.println(
					this.getReloj().getHora() + ":" + this.getReloj().getMinuto() + ":" + this.getReloj().getSegundo());
			try {
				sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
