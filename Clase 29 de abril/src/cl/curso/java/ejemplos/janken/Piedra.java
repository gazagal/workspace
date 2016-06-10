/**
 * 
 */
package cl.curso.java.ejemplos.janken;

/**
 * @author Gabriel Zagal
 *
 */
public class Piedra extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraPiedra();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println("Pierde piedra");
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println("Empate");
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println("Gana piedra");
		
	}

}
