/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

/**
 * @author Gabriel Zagal
 *Crea y define un empleado
 */
public class Empleado extends Persona {
	private Departamento departamento;
	private int salario;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Empleado(String rut, String nombre, String apellido, int edad, Departamento departamento, int salario) {
		super(rut, nombre, apellido, edad);
		this.departamento = departamento;
		this.salario = salario;
	}

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Empleado){
			return this.getRut().equals(((Empleado) obj).getRut());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+" Empleado [departamento=" + departamento + ", salario=" + salario + "]";
	}
	
}
