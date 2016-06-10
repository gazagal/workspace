package cl.curso.java.ejemplos;



/**
 * @author Usuario
 *
 */
public class Motor {

	int caballosDeFuerza;
	String tipo;
	boolean encendido;

	public Motor() {
		this.caballosDeFuerza = 1000;
	}

	public Motor(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public Motor(int caballosDeFuerza, String tipo) {
		this.caballosDeFuerza = caballosDeFuerza;
		this.tipo = tipo;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCaballosDeFuerza() {
		//Se devuelve los caballos de fuerza
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
