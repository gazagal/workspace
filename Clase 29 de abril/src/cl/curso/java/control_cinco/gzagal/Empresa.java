/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *Crea y define metodos de una empresa
 */
public class Empresa {
	private String nombre;
	private List<Empleado> empleados;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	/**
	 * ordena los empleados segun su nombre
	 */
	public void ordenarEmpleadosPorNombre(){
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
	}
	
	/**
	 * ordena los empleados segun el departamento en el que trabajan
	 */
	public void ordenarEmpleadosPorDepartamento(){
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getDepartamento().getNombre().compareTo(o2.getDepartamento().getNombre());
			}
		});
	}
	
	/**
	 * busca un empleado segun su rut, si no lo encuentra devuelve una Exception
	 * @param rut
	 * @return empleado
	 */
	public Empleado buscarEmpleado(String rut){
		for(Empleado empleado : this.getEmpleados()){
			if(rut.equals(empleado.getRut())){
				return empleado;
			}
		}
		throw new EmpleadoNoEncontradoException("No se encontro al empleado con el rut: "+rut);
		
	}
	
	/**
	 * imprime la lista de los empleados
	 */
	public void imprimir(){
		Iterator<Empleado> it = this.getEmpleados().iterator();
		while(it.hasNext()){
			Empleado empleado = it.next();
			System.out.println(empleado.getNombre()+" "+empleado.getApellido());
			System.out.println(empleado.getRut());
			System.out.println(empleado.getEdad());
			System.out.println(empleado.getSalario());
			System.out.println(empleado.getDepartamento());
			System.out.println("...........");
		}
	}
}
