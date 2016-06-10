package cl.curso.java.singleton_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Motor motor1 = Motor.getInstance();
        Motor motor2 = Motor.getInstance();
        Motor motor3 = Motor.getInstance();
        Motor motor4 = Motor.getInstance();
        
        System.out.println(motor1);
        System.out.println(motor2);
        System.out.println(motor3);
        System.out.println(motor4);
        
    }
}
