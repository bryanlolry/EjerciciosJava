package banco;
import java.util.Scanner;
public class pedidaDatos {
	public static Scanner entradaa;
public static void main(String[] args) {
	
	entradaa = new Scanner(System.in);
	cuenta entradaU = new cuenta();
	System.out.print("Ingresar el titular de la cuenta: ");
	String titular = entradaa.next();
	String cuenta = entradaU.mostrar_tit();
	int evaluar1 = 0;
	
	
	if(titular.equals(cuenta) == true) {
		System.out.println("El titular de la cuenta es " + cuenta + " y el dinero disponible es: " + entradaU.devolver_cantidad());
		do {
			
		System.out.print("1)Retirar fondos\n2)Ingresarfondos\n3)Salir de la cuenta\n>>> ");
		int entIf = entradaa.nextInt();
		switch(entIf) {
		case 1:
			System.out.print("Ingresar la cantidad a retirar: ");
			float cantidad_a_retirar = entradaa.nextFloat();
			entradaU.pedir_cantidad(entradaU.devolver_cantidad() - cantidad_a_retirar);
			System.out.println("Se hizo un retiro de: " + cantidad_a_retirar + ", el valor restante en la cuenta es: " + entradaU.devolver_cantidad());
			break;
		case 2:
			System.out.print("Ingresar la cantidad a depositar: ");
			float cantidad_a_depositar = entradaa.nextFloat();
			entradaU.pedir_cantidad(entradaU.devolver_cantidad() + cantidad_a_depositar);
			System.out.println("Se hizo un deposito de: " + cantidad_a_depositar + ", el valor actual en la cuenta es: " + entradaU.devolver_cantidad());
			break;
		case 3:
			System.out.println("¡HASTA LA PROXIMA!");
			evaluar1 = 2;
		}}while(evaluar1 <1);
		
	}else {
		System.out.println("El titular de la cuenta es incorrecto");
	}
	
	}

}
