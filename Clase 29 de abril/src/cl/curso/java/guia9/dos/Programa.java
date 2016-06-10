package cl.curso.java.guia9.dos;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
//		Permiso permisoUno = new Permiso("lolo", 123456789, "eso ps");
//		
//		PerfilDos perfilUno = new PerfilDos("gabo", "trololo", permisoUno);
//		
//		perfilUno.imprimir();
		
		
		
//		String numero= JOptionPane.showInputDialog("Ingrese numero de alumnos en la asignatura");
//		int n1 = Integer.parseInt(numero);
//		
//		Alumno[] alumnos = new Alumno[n1];
//		
//		for(int i = 0;i<alumnos.length;i++){
//			String nombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del "+(i+1)+"º alumno");
//			String edadAlumno = JOptionPane.showInputDialog("Ingrese la edad del "+(i+1)+"º alumno");
//			int edadAlumnoNum = Integer.parseInt(edadAlumno);
//			alumnos[i] = new Alumno(nombreAlumno, edadAlumnoNum);
//		}
//		
//		Asignatura asignaturaUno = new Asignatura("Matematicas", "Valenzuela", alumnos);
//		asignaturaUno.imprimir();
		
		
		String numero= JOptionPane.showInputDialog("Ingrese numero de productos");
		int n1 = Integer.parseInt(numero);	
		
		Producto[] productos = new Producto[n1];
		
		for (int i = 0; i<productos.length; i++){
			String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del "+(i+1)+"º Producto");
			String tipoArticulo = JOptionPane.showInputDialog("Ingrese el tipo de articulo del "+(i+1)+"º Producto");
			String cantidadArticulo = JOptionPane.showInputDialog("Ingrese la cantidad del "+(i+1)+"º Producto");
			String precio= JOptionPane.showInputDialog("Ingrese el precio del "+(i+1)+"º Producto");
			int cantArticulo = Integer.parseInt(cantidadArticulo);
			int precioArticulo = Integer.parseInt(precio);
			
			productos[i]= new Producto(nombreProducto, tipoArticulo, cantArticulo, precioArticulo);
		}
		
		Tienda tiendaUno = new Tienda("Wololo", "Mayorista", productos);
		tiendaUno.imprimir();
	}

}
