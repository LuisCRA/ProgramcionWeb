package pe.edu.upc.Lk;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Clase objeto= new Constructor()
    	Scanner s=new Scanner(System.in);
    	
        String[] arrNombre;
        arrNombre= new String[3];
        
        for (int i = 0; i < arrNombre.length; i++) {
        	System.out.print( "Ingrese un nombre"+(i+1));
        	arrNombre[i]=s.nextLine();
		}
        
        System.out.println( "Hello World!" );
    }
}
