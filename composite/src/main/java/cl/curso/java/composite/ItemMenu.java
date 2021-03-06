/**
 * 
 */
package cl.curso.java.composite;


/**
 * @author Gabriel Zagal
 *
 */
public class ItemMenu extends Menu {
	private String atajo;
	
	public ItemMenu() {
	}
	
	/**
	 * @param nombre
	 */
	public ItemMenu(String nombre, String atajo, Command comando) {
		super(nombre, comando);
		this.atajo = atajo;
	}
	
	/**
	 * @return the atajo
	 */
	public String getAtajo() {
		return atajo;
	}

	/**
	 * @param atajo the atajo to set
	 */
	public void setAtajo(String atajo) {
		this.atajo = atajo;
	}

	@Override
	public void pintarMenu() {
		System.out.println(this.getNombre()+" "+ this.getAtajo());
	}

}
