package clasesBry;
import java.util.Scanner;
public class nose {
public static Scanner entrada;
	public static void main(String[] args) {
	int x = 0;
	do {
		entrada = new Scanner(System.in);
		System.out.println("Mostrar numeros del 1 al 100 con bucles\n 1)While\n 2)For\n 3)Salir");
		System.out.print("Introduzca el tipo de bulce que desea: ");
		
		int dato = entrada.nextInt();
		if(dato == 1) {
			int n = 0;
			do {
				System.out.println(n);
				n++;
			}while(n <= 100);
			continue;
		}else if (dato == 2) {
			for(int j = 0; j <= 100; j++ ) {
				System.out.println(j);
			}
		}else if(dato == 3){
			System.out.println("Hasta Luego");
			x++;
		}
		
	}while(x == 0);
	}

}
