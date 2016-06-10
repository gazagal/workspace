package cl.curso.java.guia10.tres;

public class Programa {

	public static void main(String[] args) {
		
		Libro libro = new Libro("A Fifo le gusta la...", "Chulapi");
		libro.imprimir();
		
		Revista revista = new Revista(1, "Conma", "Yo");
		revista.imprimir();
		
	}

}
