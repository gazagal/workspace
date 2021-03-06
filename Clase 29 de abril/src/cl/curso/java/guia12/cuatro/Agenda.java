/**
 * 
 */
package cl.curso.java.guia12.cuatro;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Agenda {
	private String nombre;
	private List<Evento> eventos;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param eventos
	 */
	public Agenda(String nombre, List<Evento> eventos) {
		super();
		this.nombre = nombre;
		this.eventos = eventos;
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
	 * @return the eventos
	 */
	public List<Evento> getEventos() {
		return eventos;
	}

	/**
	 * @param eventos the eventos to set
	 */
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void agregarEvento(Evento evento){
		boolean fechaEncontrada = false;
		for(Evento eventosLista : eventos){
			if(eventosLista.equals(evento)){
				fechaEncontrada = true;
			}
		}
		if(fechaEncontrada == true){
			System.out.println("Ya tiene un evento en esta fecha/hora");
		}else{
			this.getEventos().add(evento);
		}
		
	}
	
	public void eliminarEvento(Evento evento){
		this.getEventos().remove(evento);
	}
	
	public void ordenarPorFecha(){
		Collections.sort(this.getEventos(), new Comparator<Evento>() {

			@Override
			public int compare(Evento o1, Evento o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}

		});
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", eventos=" + eventos + "]";
	}
	
	public void imprimir(){
		System.out.println(this.getEventos());
	}
}
