/**
 * 
 */
package cl.curso.java.control_cuatro.gzagal;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// EJERCICIO 5
		// Libro libro = new Libro("Como Programar", "Java Cursos", 10, 0);
		//
		// ReservarLibroThread thread1 = new ReservarLibroThread(libro);
		// ReservarLibroThread thread2 = new ReservarLibroThread(libro);
		// ReservarLibroThread thread3 = new ReservarLibroThread(libro);
		// DevolverLibroThread thread4 = new DevolverLibroThread(libro);
		// DevolverLibroThread thread5 = new DevolverLibroThread(libro);
		// DevolverLibroThread thread6 = new DevolverLibroThread(libro);
		//
		// thread1.start();
		// thread2.start();
		// thread3.start();
		// thread4.start();
		// thread5.start();
		// thread6.start();

		// EJERCICIO 6
		Auto auto = new Auto("Toyota", "Yaris", 2000, 0);
		try {
			auto.venderAuto();
		} catch (SinStockException e) {
			System.out.println(e.getMessage());
		}

	}

}
