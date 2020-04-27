package clasesBry;
import java.util.Scanner;
public class sumanNum1 {
public static Scanner entrada;
public static void main(String[] args) {
	entrada = new Scanner(System.in);
	System.out.print("Ingrese un numero mayor que uno: ");
	int num = entrada.nextInt();
	int cont = 0;
	for(int x = 1; x<=num; x++) {
		cont+=x;
		System.out.println(cont);
	}
	
	
	}

}
