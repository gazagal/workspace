/**
 * 
 */
package cl.curso.java.guia11.exceptions.tres;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = {"foo"};
		try {
			String functionName = str[10];
			System.out.println(functionName);
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Posicion "+e.getMessage()+" fuera de rango", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
