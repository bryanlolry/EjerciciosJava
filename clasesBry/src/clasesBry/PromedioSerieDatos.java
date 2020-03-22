package clasesBry;
import java.util.Scanner;

public class PromedioSerieDatos {
public static Scanner entrada;
public static void main(String[] args) {
	double cont = 0, contN = 0;
	double suma = 0, sumaN = 0;
	entrada = new Scanner(System.in);
	double[] datos = new double[10];
	for(int i = 0; i < datos.length; i++) {
		System.out.print("Introduzca el numero de la serie de datos: ");
		datos[i] = entrada.nextInt();
		
	}
	for (int j = 0; j < datos.length; j++) {
	if(datos[j] > 0) {
		suma += datos[j];
		cont++;
	}else if(datos[j] < 0) {
		sumaN += datos[j];
		contN++;
	}
	}
	
	if(cont != 0) {
		System.out.println("La media de sus datos positivos es: " + suma / cont);
	}else {
		System.out.println("No introdujo numeros negativos");
	}
	if(contN != 0) {
		System.out.println("La media de sus datos negativos es: " + sumaN / contN);
	}else {
		System.out.println("No introdujo numeros negativos");
	}
	
	
}


}
