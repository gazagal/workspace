/**
 * 
 */
package cl.curso.java.ejemplos.smartphone;

import java.util.ArrayList;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<App> app = new ArrayList<>();
		App piteateFifo = new App("Piteate un fifo", 45);
		App wololo = new App("Wololo", 25);
		App asdw = new App("asdw", 35);
		
				
		SmartPhone smartPhone = new SmartPhone("Samsung", "1234-XL", 100, app);
		smartPhone.instalarApp(piteateFifo);
		smartPhone.instalarApp(wololo);
		smartPhone.instalarApp(asdw);
		
		smartPhone.eliminarApp(wololo);
		smartPhone.instalarApp(asdw);
		
		System.out.println(smartPhone);
		
		
		
	}

}
