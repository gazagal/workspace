package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class CuadroDeDialogo {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Ingrese un valor");
		String nota2 = JOptionPane.showInputDialog("Ingrese un valor");
		String nota3 = JOptionPane.showInputDialog("Ingrese un valor");
		
		int n1 = Integer.parseInt(nota1);
		int n2 = Integer.parseInt(nota2);
		int n3 = Integer.parseInt(nota3);
		
		LlamarMetodos ejemplo = new LlamarMetodos();
		int promedio = ejemplo.promedio(n1, n2, n3);
		
		JOptionPane.showConfirmDialog(null, promedio);
	}

}
