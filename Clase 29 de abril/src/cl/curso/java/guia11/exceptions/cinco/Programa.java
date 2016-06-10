/**
 * 
 */
package cl.curso.java.guia11.exceptions.cinco;

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
		
			String numero = JOptionPane.showInputDialog("Ingrese numero");
		
			try {
				System.out.println(numero.trim());
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Error al ingresar numero, por favor intentelo nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
	}

}
