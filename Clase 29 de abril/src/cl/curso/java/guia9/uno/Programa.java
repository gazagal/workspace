package cl.curso.java.guia9.uno;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
//		Persona personaUno = new Persona("gabriel", "zagal", 123456789);
//		personaUno.imprimir();
//		System.out.println(personaUno.validarTelefono());
		
//		Auto autoUno = new Auto(1234, "Toyota", "Camioneta", 2000, "TG1240", 190000, 3000000, 2);
//		autoUno.vender(3);
		
//		Vendedor vendedorUno = new Vendedor("Gabriel", 2, 8, 5000);
//		System.out.println(vendedorUno.calcularComision());
		
		
		
//		String numeroCanciones = JOptionPane.showInputDialog("Ingrese el numero de canciones en el disco");
//		int i = Integer.parseInt(numeroCanciones);
//		
//		Canciones[] canciones = new Canciones[i];
//		
//		for(int subIndice = 0; subIndice < canciones.length; subIndice++){
//			String cancion = JOptionPane.showInputDialog("Ingrese titulo de la cancion "+(subIndice+1));
//			canciones[subIndice] = new Canciones(cancion);
//		}
//		
//		Disco discoUno = new Disco("Azul cielo", "Leroy", "trollll", canciones);
//		discoUno.imprimir();
		
		
		
		Libro libroUno = new Libro("Wololo", "Gabo", "Age of Empire", "0-13-911991-4");
		System.out.println(libroUno.validarIsbn());
		
		
		
	}

}
