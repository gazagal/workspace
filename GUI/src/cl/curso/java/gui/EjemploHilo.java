/**
 * 
 */
package cl.curso.java.gui;

/**
 * @author Gabriel Zagal
 *
 */
public class EjemploHilo extends Thread {
	@Override
	public void run(){
		
		try{
			sleep(1000);
		}catch (InterruptedException ex){
		}
		System.out.println("El nombre del thread es: "+getName());
	}
	
	public static void main(String[] args) {
		EjemploHilo thread = new EjemploHilo();
		thread.start();
		System.out.println("metodo main; El nombre del thread es: "+Thread.currentThread().getName());
	}
	
}
