/**
 * 
 */
package cl.curso.java.guia12.cuatro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Evento> eventos = new ArrayList<>();
		
		Date fecha1 = new Date(2016, 06, 13);
		Date fecha2 = new Date(2016, 07, 12);
		
		Evento evento1 = new Evento("Evento 1", fecha1);
		Evento evento2 = new Evento("evento 2", fecha1);
		Evento evento3 = new Evento("evento 3", fecha2);
		
		Agenda agenda = new Agenda("Gabriel", eventos);
		
		agenda.agregarEvento(evento1);
		agenda.agregarEvento(evento2);
		agenda.agregarEvento(evento3);
		
		agenda.imprimir();
		
	}

}
