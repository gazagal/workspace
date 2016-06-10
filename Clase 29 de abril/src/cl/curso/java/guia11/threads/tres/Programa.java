/**
 * 
 */
package cl.curso.java.guia11.threads.tres;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Asiento[] asientos = new Asiento[10];
		
		for(int i = 0;i<asientos.length;i++){
			asientos[i]= new Asiento(); 
		}
		
		Bus bus = new Bus("Camino al Cielo", asientos);
		ReservaThread reserva1=new ReservaThread(bus, 9);
		ReservaThread reserva2=new ReservaThread(bus, 9);
		
		reserva1.start();
		
		reserva2.start();
		
		
		
		
	}

}
