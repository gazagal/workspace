/**
 * 
 */
package cl.curso.java.composite;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class Menu {
	private String nombre;
	private Command comando = new ComandoNulo();
	
	public Menu() {
	}

	/**
	 * @param nombre
	 */
	public Menu(String nombre, Command comando) {
		super();
		this.nombre = nombre;
		this.comando = comando;
	}

	/**
	 * @return the comando
	 */
	public Command getComando() {
		return comando;
	}

	/**
	 * @param comando the comando to set
	 */
	public void setComando(Command comando) {
		this.comando = comando;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void pintarMenu();
	
	public void onClick(){
		this.comando.ejecutar();
	}
}
