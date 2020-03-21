package clasesBry;

import java.util.Scanner;
import java.lang.Math;

public class problema1 {
	private static Scanner oby; // declarando variable estatica
	
	public static void main(String[] args) {
	int x = 0 ;
	do {
	
	oby = new Scanner(System.in);
	System.out.println("Recuerde agregar su numero con el caracter ',' y no con punto.\n");
	System.out.print("Ingrese el radio de su circunferencia: " );
	double rad = oby.nextDouble();
	
	double cua = Math.pow(rad, 2.0);
	double rst = Math.PI*cua;
	System.out.print("\nEl radio de su circunferencia es: ");
	System.out.printf("%1.2f\n", rst);
	System.out.println("--------------------------------------------\n");
	x++;
	
	} while(x == 0 || x <= 2);
	 System.out.println("Exediste el numero de calculos posibles, Reinicie porfavor");
	} 
	
}
