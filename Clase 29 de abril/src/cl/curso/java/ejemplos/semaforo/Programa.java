package cl.curso.java.ejemplos.semaforo;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
		Rojo rojo = new Rojo();
		Semaforo semaforo = new Semaforo(rojo);
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		
		while(true){
			semaforo.cambiarColor();
			Thread.sleep(1);
		}
	}

}
