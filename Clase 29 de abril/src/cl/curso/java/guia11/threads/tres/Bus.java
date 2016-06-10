/**
 * 
 */
package cl.curso.java.guia11.threads.tres;

/**
 * @author Gabriel Zagal
 *
 */
public class Bus {
	private String nombre;
	private Asiento[] asiento;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param asiento
	 */
	public Bus(String nombre, Asiento[] asiento) {
		super();
		this.nombre = nombre;
		this.asiento = asiento;
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

	/**
	 * @return the asiento
	 */
	public Asiento[] getAsiento() {
		return asiento;
	}

	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(Asiento[] asiento) {
		this.asiento = asiento;
	}
	
	public synchronized void reservarAsiento(int numeroAsiento){
		if(!(this.getAsiento()[numeroAsiento].isDisponible())){
			this.getAsiento()[numeroAsiento].setDisponible(true);
		}else{
			System.out.println("El asiento no esta disponible.");
		}
		
	}
	
}
