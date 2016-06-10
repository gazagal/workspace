package cl.curso.java.guia1;

public class Ejercicio4 {

	public static void main(String[] args)
	{
		int suma = 0;
		for (byte cont = 1; cont <= 100; cont++)
		{
			suma = (int) (suma + cont);
		}
		System.out.println("Imprimiendo " + suma);

	}

}
