package cl.curso.java.ejemplos;

public class LlamarMetodos 
{

	public static void main(String[] args) 
	{
		LlamarMetodos ejercicio = new LlamarMetodos();
		int promedio = ejercicio.promedio(30, 50, 70);
		System.out.println(promedio);
	}
	
	public int promedio (int nota1, int nota2, int nota3)
	{
		int promedio = (nota1 + nota2 + nota3) /3;
		return promedio;
	}

}
