package clasesBry;
import java.util.Scanner;
import java.lang.Math;
public class problema3 {
	private static Scanner obj;
    public static void main(String[] args) {
    /*
     * obj es el nombre de la instancia del scanner
     * oby es el que condiciona al switch
     */
    obj = new Scanner(System.in);
    
	int y = 2;
    do {
    System.out.println("1. Circulo");
    System.out.println("2. Cuadrado");
    System.out.println("3. Triangulo");
    System.out.println("4.Rectangulo");
    System.out.print("Introducir el numero de la figura geometrica: ");
    int oby = obj.nextInt();
    switch (oby){
    	case 1:
    		
    		System.out.print("\nIntroduzca el radio de su circunferencia: ");
    		double radio = obj.nextDouble();
    		System.out.print("El area de la circunferencia es ");
    		System.out.printf("%1.3f", Math.PI*(Math.pow(radio, 2.0)));
    		break;
    	case 2:
    		
    		System.out.print("\nIntroduzca la distancia de uno de sus lados: ");
    		double diam = obj.nextDouble();
    		System.out.print("El area de su cuadrado es :" + diam*4);
    		break;
    	case 3:
    		
    		System.out.print("\nIntroduzca la altura de su triangulo: ");
    		double altura = obj.nextDouble();
    		System.out.print("Introduzca la base de su triangulo: ");
    		double base = obj.nextDouble();
    		
    		System.out.print("El area de su triangulo es: " + (base*altura)/2);
    		break;
    	case 4:
    		
    		System.out.print("\nIntroduzca el lado 1 de su rectangulo: ");
    		double ladou = obj.nextDouble();
    		System.out.print("Introduzca el lado 2 de su rectangulo: ");
    		double ladod = obj.nextDouble();
    		System.out.print("El area de su rectangulo es: " + ladou*ladod);
    		break;
    		}
    	System.out.println("\n¿Desea salir del programa?\n1. SI\n2. NO");
    		System.out.println("Respuesta: ");
    		int resp = obj.nextInt();
    		
    		if(resp == 1) {
    			System.exit(0);
    			
    		}else if( resp > 2) {
    			
    			System.out.print("El numero introducido es incorrecto, se reiniciara el codigo.\n");
    			y = 3;
    		}else {
    			y = 3;
    		}
    }while( y == 3);
    
       
    }
}