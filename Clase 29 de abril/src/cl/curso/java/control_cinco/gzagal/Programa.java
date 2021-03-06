/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		EJERCICIO 1
//		
//		List<Transaccion> transacciones = new ArrayList<>();
//		Date fecha1 = new Date(2016, 05, 02);
//		Date fecha2 = new Date(2016, 06, 03);
//		Date fecha3 = new Date(2016, 07, 02);
//		
//		Transaccion trans1 = new Transaccion("a-123", "deposito", fecha2, 12000);
//		Transaccion trans2 = new Transaccion("b-124", "abono", fecha3, 15000);
//		Transaccion trans3 = new Transaccion("c-133", "deposito", fecha1, 3200);
//		
//		transacciones.add(trans3);
//		transacciones.add(trans2);
//		transacciones.add(trans1);
//		
//		CuentaBancaria cuentaBancaria = new CuentaBancaria(123456, transacciones);
//		
//		cuentaBancaria.imprimir();
//		System.out.println(".....................");
//		cuentaBancaria.ordenarTransaccionesPorFecha();
//		cuentaBancaria.imprimir();
//		System.out.println(".....................");
//		cuentaBancaria.ordenarTransaccionesPorTipo();
//		cuentaBancaria.imprimir();
//		System.out.println(".....................");
		
		
//		EJERCICIO 2
		List<Empleado> empleados = new ArrayList<>();
		Departamento depto1 = new Departamento("A-123", "RRHH");
		Departamento depto2 = new Departamento("B-123", "Finanzas");
		
		Empleado empleado1 = new Empleado("18194997k", "Gabriel", "Zagal", 24, depto2, 1500000);
		Empleado empleado2 = new Empleado("123456789", "NN", "asdasd", 99, depto1, 100000);
		empleados.add(empleado2);
		empleados.add(empleado1);
		
		Empresa empresa = new Empresa("Acc123", empleados);
		
		empresa.imprimir();
		System.out.println("---------------------------------");
		empresa.ordenarEmpleadosPorNombre();
		empresa.imprimir();
		System.out.println("---------------------------------");
		empresa.ordenarEmpleadosPorDepartamento();
		empresa.imprimir();
		System.out.println("---------------------------------");
		
		System.out.println(empresa.buscarEmpleado("18194997k"));
		System.out.println(empresa.buscarEmpleado("18194992"));
		
		
		
		
		
		
		
	}
}
