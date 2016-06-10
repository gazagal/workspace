/**
 * 
 */
package cl.curso.java.ejemplos.janken;

/**
 * @author Gabriel Zagal
 *
 */
public class ProgramaJanken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Piedra piedra = new Piedra();
		Papel papel = new Papel();
		Tijera tijera = new Tijera();
		
		
		
		piedra.jugar(papel);
		papel.jugar(tijera);
		tijera.jugar(piedra);
		
		
	}

}
