/**
 * 
 */
package cl.curso.java.gui;

/**
 * @author Gabriel Zagal
 *
 */
public class EjemploHilo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("El nombre del thread es: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new EjemploHilo2());
		thread.start();
		System.out.println("metodo main; El nombre del thread es: "+Thread.currentThread().getName());
	}

}
