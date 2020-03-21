package clasesBry;

import java.util.Scanner;

public class problema2 {
private static Scanner obt;	// inicio de variable
public static void main(String[] args) {
	int x = 1; // Para el while
	do {
	obt = new Scanner(System.in);  // creando el acc al teclado
	System.out.println("Ingrese el numero a verificar: ");
	int punber = obt.nextInt(); // entrada de dato
	int rst = punber%2; // modulo del dato obtenido
	if (rst == 0) { // sentencia
		System.out.println("El numero es par");
	}else{
		System.out.println("El numero es impar");
	}
	}while(x == 1 || x <= 3 ); // validacion para ejecutarlo un numero determinado de veces
	System.out.println("El Numero de ooperaciones fue excedido, reinicie el programa");
	
	
}

}
