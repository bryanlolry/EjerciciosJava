package clasesBry;
import java.lang.Math;
import java.util.Scanner;

public class problema5 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int numA = 1;
		int evaluar = 1;
		int intentos = 0; 
		while(evaluar <= 1 && (intentos > 3)==false) {
		numA = (int) (Math.random()*10);
		System.out.print("Ingrese un numero: ");
		int numE = entrada.nextInt();
		if(numA == numE) {
			System.out.println("Listo");
		}else {
			System.out.println("El numero es incorrecto");
			intentos++;
			
		}
	}
		System.out.println("Numero de intentos concluido. Reinicie por favor.");
		
	}
}
