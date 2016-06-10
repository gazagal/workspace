/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Zagal
 *Programa para probar y crear objetos
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TrenRutaRoja trenRojo = new TrenRutaRoja(213, "Cinco");
		TrenRutaVerde trenVerde = new TrenRutaVerde(132, "Cinco");
		
		EstacionRutaRoja estacionRoja = new EstacionRutaRoja("Ciudad del niño","Cinco");
		EstacionComun estacionComun = new EstacionComun("Lo Ovalle", "Cinco");
		EstacionRutaVerde estacionVerde = new EstacionRutaVerde("El Parron", "Cinco");
		
		System.out.println(trenVerde.seDetiene(estacionVerde));
		System.out.println(trenRojo.seDetiene(estacionVerde));
		System.out.println(trenRojo.seDetiene(estacionComun));
		System.out.println(trenRojo.seDetiene(estacionRoja));

		
		
//		Persona persona = new Persona("Jose", 24, "18.123.456-k", 70, 1.95);
//		System.out.println(persona.calcularIMC());
		
		
		
//		Alumno[] alumnos = new Alumno[5];
//		
//		for (int i = 0;i<alumnos.length;i++){
//			String nombre = JOptionPane.showInputDialog("Nombre del alumno "+(i+1));
//			String promedio = JOptionPane.showInputDialog("Promedio alumno "+(i+1));
//			alumnos[i] = new Alumno(nombre, Double.parseDouble(promedio));
//		}
//		
//		Curso curso = new Curso("Java", alumnos);
//		curso.imprimir();
//		curso.calcularPromedioCurso();
//		curso.obtenerMejorPromedio();
		
		
		
		
	}

}
