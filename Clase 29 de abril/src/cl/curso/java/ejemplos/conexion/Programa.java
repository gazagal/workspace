package cl.curso.java.ejemplos.conexion;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		ConexionAbierta conexionAbierta = new ConexionAbierta();
		Conexion conexion = new Conexion(conexionAbierta);
//		conexion.abrir();
		conexion.cerrar();
		System.out.println(conexion.getEstadoConexion());

	}

}
