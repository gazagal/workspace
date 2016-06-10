package cl.curso.java.guia8;

public class Calendario {

	private int dia;
	private int mes;
	private int anno;
	public final String[] nombreMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };
	public final int[] largoMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Calendario() {
		this.dia = 23;
		this.mes = 5;
		this.anno = 1995;
	}

	public Calendario(int dia, int mes, int anno) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void imprimirFecha() {
		System.out.println(this.getDia() + "-" + this.getMes() + "-" + this.getAnno());
	}

	public void imprimirFechaFormato() {
		String nombreMes = nombreMeses[this.getMes() - 1];
		System.out.println(this.getDia() + " de " + nombreMes + " de " + this.getAnno());
	}

	public boolean esBisiesto() {
		return ((this.getAnno() % 4 == 0 || this.getAnno() % 400 == 0) && this.getAnno() % 100 != 0);
	}

	public void validarDia() throws DiaNoValidoException, MesNoValidoException {
		validarMes();
			if (this.getMes() == 2 && this.esBisiesto()) {
				if (!(this.getDia() >= 1 && this.getDia() <= 29)){
					throw new DiaNoValidoException("Si el año es bisiesto y el mes es Febrero no puede exceder de 29 dias");
				}
			} else {
				int cantDias = largoMes[this.getMes() - 1];
				if (!(this.getDia() >= 1 && this.getDia() <= cantDias)){
					throw new DiaNoValidoException("El mes de "+this.getMes()+" no puede exceder "+this.getDia()+" dias");
				}
			}
		
	}
	
	public void validarMes() throws MesNoValidoException {
		if (!(this.getMes() >= 1 && this.getMes() <= 12)){
			throw new MesNoValidoException("El mes debe estar entre 1 y 12");
		}
	}

}
