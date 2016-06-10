/**
 * 
 */
package cl.curso.java.gui;

/**
 * @author Gabriel Zagal
 *
 */
public class Bomba extends Thread{
	
	@Override
	public void run() {
		final String[] NUMEROS = {"Nueve","Ocho","Siete","Seis","Cinco","Cuatro","Tres","Dos","Uno","Cero"};
		
		for(int i =0; i<10; i++){
			try{
				System.out.println(NUMEROS[i]);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Bomba bomba = new Bomba();
		bomba.start();
		bomba.join();
		System.out.println("Boom!!!");
	}
}
