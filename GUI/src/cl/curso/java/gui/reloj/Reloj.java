/**
 * 
 */
package cl.curso.java.gui.reloj;

/**
 * @author Gabriel Zagal
 *
 */
public class Reloj {
	private int hora;
	private int minuto;
	private int segundo;
	private boolean encendido;
	
	public Reloj() {
	}

	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Reloj(int hora, int minuto, int segundo, boolean encendido) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.encendido = encendido;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora
	 *            the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto
	 *            the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @return the segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * @param segundo
	 *            the segundo to set
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public void avanzarSegundo() {
		this.segundo++;
		if (segundo == 60) {
			this.setSegundo(0);
			this.avanzarMinuto();
		}

	}

	public void avanzarMinuto() {
		this.minuto++;
		if (minuto == 60) {
			this.setMinuto(0);
			this.avanzarHora();
		}
	}

	public void avanzarHora() {
		this.hora++;
		if (this.hora == 24) {
			this.setHora(0);
		}
	}
}
