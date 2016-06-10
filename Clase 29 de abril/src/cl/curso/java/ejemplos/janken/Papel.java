/**
 * 
 */
package cl.curso.java.ejemplos.janken;

/**
 * @author Gabriel Zagal
 *
 */
public class Papel extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraPapel();
	}

	@Override
	public void jugarContraPapel() {
		System.out.println("Empate");
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println("Gana papel");
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println("Pierde papel");
		
	}

}
