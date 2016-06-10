package cl.curso.java.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Director director = new Director();
    	BuilderAutoToyota autoToyota = new BuilderAutoToyota();
    	BuilderAutoTesla autoTesla = new BuilderAutoTesla();
    	
    	director.setBuilder(autoToyota);
    	System.out.println(director.construirAuto());
    	
    	director.setBuilder(autoTesla);
    	System.out.println(director.construirAuto());
    }
}
