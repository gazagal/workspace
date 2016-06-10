/**
 * 
 */
package cl.curso.java.ejemplos.janken;

/**
 * @author Gabriel Zagal
 *
 */
public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraTijera();
	}

	@Override
	public void jugarContraPapel() {
		System.out.println("Gana tijera");
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println("Pierde tijera");
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println("Empate");
		
	}

}
