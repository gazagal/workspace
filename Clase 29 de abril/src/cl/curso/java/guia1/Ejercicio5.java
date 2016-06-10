package cl.curso.java.guia1;

public class Ejercicio5 
{
	public static void main(String[] args)
	{
		byte cantidadImpares = 0;
		for(byte contador = 1; contador <= 100; contador = (byte) (contador + 2))
		{
			cantidadImpares ++;
			System.out.println("Imprimiendo " + contador);
		}
		System.out.println("Imprimiendo: la cantidad de impares entre 0 y 100 son " + cantidadImpares);
	}
}
