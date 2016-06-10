/**
 * 
 */
package cl.curso.java.ejemplos.division;

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
		int dividendo = obtenerNumero("dividendo");
		int divisor = obtenerNumero("divisor");
		
		Division division = new Division(dividendo, divisor);
		
		
		try{
			System.out.println(division.hacerDivision());
		}catch (ArithmeticException e){
			JOptionPane.showMessageDialog(null, "Error al realizar la division "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
	}
	
	public static int obtenerNumero(String nombreDelCampo){
		int numero = 0;
		boolean numeroValido = false;
		
		do{
			try{
				String numeroStr = JOptionPane.showInputDialog("Ingrese "+ nombreDelCampo);
				numero = Integer.parseInt(numeroStr);
				numeroValido = !numeroValido;
			}catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Solo se deben ingresar numeros", "Error", JOptionPane.ERROR_MESSAGE);
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Un error inesperado ha surgido", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}while(!numeroValido);
		return numero;
	}

}

