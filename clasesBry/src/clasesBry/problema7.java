package clasesBry;
import java.util.Scanner;

public class problema7 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		Long resultado = 1L;
		System.out.println("Introduzca el numero del cual desea sacar el factorial");
		int numero = entrada.nextInt();
		for(int x=numero; x>0; x--) {
			resultado = resultado*x;
		}
		System.out.println("El resultado es " + resultado);
	}

}
