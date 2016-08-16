package pe.edu.pe.view;

import java.util.Scanner;

import pe.edu.upc.entitys.Operacion;

public class vista {
	public static void main(String[] args) {
		Operacion obOperacion=new Operacion();
		
		while (true) {
			Scanner s=new Scanner(System.in);
			System.out.println("Operacion :");
			obOperacion.setS(s.next().charAt(0));
				
			System.out.println("Número1");
			obOperacion.setNumeroA(s.nextDouble());
			
			System.out.println("Número2");
			obOperacion.setNumeroB(s.nextDouble());
			
			System.out.println("Resultado="+obOperacion.Calcular());
			
			System.out.println("Desea continuar... (SI/NO)");
			
			if(s.next().equals("NO"))
			{
				System.out.println("OK gracias");
				break;
			}
			
		}
	}
}
