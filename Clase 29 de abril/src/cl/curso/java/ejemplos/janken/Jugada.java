/**
 * 
 */
package cl.curso.java.ejemplos.janken;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class Jugada {

	public abstract void jugar(Jugada jugada);
	
	public abstract void jugarContraPapel();
	public abstract void jugarContraPiedra();
	public abstract void jugarContraTijera();
}
