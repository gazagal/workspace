/**
 * 
 */
package cl.curso.java.ejemplos.telefono_lista;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Gabriel Zagal
 *
 */
public class Telefono {
	private ArrayList<Contacto> contactos;
	
	public Telefono() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contactos
	 */
	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	/**
	 * @param contactos the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void imprimirFor(){
		for(int i = 0; i<contactos.size();i++){
			System.out.println(contactos.get(i).getNombre());
			System.out.println(contactos.get(i).getTelefono());
			System.out.println(contactos.get(i).getEmail());
			System.out.println("................");
		}
	}
	
	public void imprimirForeach(){
		for(Contacto contacto : contactos){
			System.out.println(contacto.getNombre());
			System.out.println(contacto.getTelefono());
			System.out.println(contacto.getEmail());
			System.out.println("..............");
		}
	}
	
	public void imprimirIterator(){
		Iterator<Contacto> iterator = contactos.iterator();
		while(iterator.hasNext()){
			Contacto contacto = iterator.next();
			System.out.println(contacto.getNombre());
			System.out.println(contacto.getTelefono());
			System.out.println(contacto.getEmail());
			System.out.println(".............");
		}
	}
}