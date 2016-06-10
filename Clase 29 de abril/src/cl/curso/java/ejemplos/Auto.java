package cl.curso.java.ejemplos;


public class Auto {

	String color;
	String marca;
	String patente;
	Motor motor;
	int kilometros;

	public Auto() {
		color = "Rojo";
		marca = "horda";
		patente = "tg1240";
		
	}

	public Auto(int kilometros) {
		this.kilometros = kilometros;
	}

	public Auto(String color, String marca, String patente) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
	}

	public void avanzar(int kilometros) {

		if (this.motor.isEncendido()) {
			
			this.kilometros = this.kilometros + kilometros;
			
			System.out.println("Avanzar " + this.marca + "\n Ha recorrido " + this.kilometros + " kilometros");
		} else {
			System.out.println("El auto no esta encendido");
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getPatente() {
		return this.patente;
	}

	public void atributos() {
		System.out.println("Color: "+color + "\n" + "Marca: " + marca + "\n" + "Patente: " + patente);
	}

	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor
	 *            the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	

	public void encender() {
		this.motor.setEncendido(true);
	}

}
