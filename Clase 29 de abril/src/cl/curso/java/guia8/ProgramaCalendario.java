package cl.curso.java.guia8;

public class ProgramaCalendario {

	public static void main(String[] args) {
		
		Calendario fecha = new Calendario(11, 5, 2016);
		Calendario fecha2 = new Calendario();
		
		fecha.imprimirFecha();
		fecha.imprimirFechaFormato();
		
		fecha2.imprimirFecha();
		fecha2.imprimirFechaFormato();
		

	}

}
