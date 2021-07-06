
import java.util.Scanner;

public class ejercicio10Lab5 {
    public static Scanner entrada;
    public static void main(String[] args){
        entrada = new Scanner(System.in);
        int tamaño, num;
        double total, promedio;
        total = 0;
        System.out.print("Digite el numero de temperaturas a ingresar: ");
        tamaño = entrada.nextInt();
        double[] temperaturas = new double[tamaño];
        for(int i = 0; i < temperaturas.length; i++){
            num = i + 1;
            System.out.print(num + ".- Ingrese su temperatura: ");
            temperaturas[i] = entrada.nextDouble();
            total += temperaturas[i];
        }
        promedio = total / temperaturas.length;
        System.out.println("El promedio de todas las temperaturas es: " + promedio);
        
        System.out.print("Las temperaturas menores a la media son: ");
        for(int j = 0; j < temperaturas.length; j++){
            if(temperaturas[j] < promedio){
                System.out.print(temperaturas[j] + ", ");
            }
        }
    }
}
