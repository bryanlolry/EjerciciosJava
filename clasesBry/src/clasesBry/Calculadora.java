package programacionJava;
import java.util.Scanner;
public class calculadora {
public static Scanner entrada;
public static void main(String[] args) {
	
	int n;
	n = 1;
	while(n >= 1){
		entrada = new Scanner(System.in);
		System.out.println(">>>>>Claculadora<<<<<");
		System.out.println("Ingrese el operando de la operacion a realizar: +, -, /, *, ^(Potencia), %");
		System.out.print(">>> ");
		String dt1 = entrada.nextLine();
		if(dt1.equals("+")) {
			System.out.println("Operacion Suma");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato: ");
			int num2 = entrada.nextInt();
			int resultado = num1+num2;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else if(dt1.equals("-")) {
			System.out.println("Operacion resta");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato: ");
			int num2 = entrada.nextInt();
			int resultado = num1-num2;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else if(dt1.equals("*")) {
			System.out.println("Operacion multiplicacion");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato: ");
			int num2 = entrada.nextInt();
			int resultado = num1*num2;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else if(dt1.equals("/")) {
			System.out.println("Operacion division");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato: ");
			int num2 = entrada.nextInt();
			float resultado = num1/num2;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else if(dt1.equals("^")) {
			System.out.println("Operacion potenciacion");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato(exponente): ");
			int num2 = entrada.nextInt();
			int resultado =  (int)Math.pow(num1, num2);;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else if(dt1.equals("%")) {
			System.out.println("Operacion Modulo");
			System.out.print("Ingrese el primer dato: ");
			int num1 = entrada.nextInt();
			System.out.print("Ingrese el segundo dato: ");
			int num2 = entrada.nextInt();
			int resultado = num1%num2;
			System.out.println("El resultado es " + resultado + "\n");
			
		}else {
			System.out.println("Caracter incorrecto.");
		}
	}
	

}
}
