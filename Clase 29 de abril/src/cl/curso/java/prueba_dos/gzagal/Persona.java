/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea el comportamiento y los atributos de una persona,
 * calcula el indice de masa corporal y si es mayor de edad
 */
public class Persona {
	private String nombre;
	private int edad;
	private String rut;
	private double peso;
	private double altura;

	public Persona() {
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param rut
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, String rut, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC() {
		// el Indice de masa corporal deberia compararse a una escala para saber
		// si es el peso ideal,
		// porque de esta manera siempre el peso de la persona sera mayor al IMC
		// (suponiendo que las personas miden mas de un metro)
		double pesoIdeal = this.getPeso() / (this.getAltura() * this.getAltura());
		if (this.getPeso() > pesoIdeal) {
			return 1;
		} else {
			if (this.getPeso() == 0) {
				return 0;
			} else {
				return -1;
			}
		}
	}

	public boolean esMayorDeEdad() {
		return this.getEdad() >= 18;
	}

}
