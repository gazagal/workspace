package cl.curso.java.adapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GuitarraAcustica guitarraAcus = new GuitarraAcustica();
    	GuitarraElectricaAcustica guitElectAcus = new GuitarraElectricaAcustica(guitarraAcus);
    	
    	guitElectAcus.encender();
    	guitElectAcus.apagar();
    	
    	
    }
}
