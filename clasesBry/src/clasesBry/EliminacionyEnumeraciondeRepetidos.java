import java.util.Scanner;
import java.util.Arrays;
public class ejercicio2Lab6 {
    public static Scanner entrada;
    public static void main(String[] args) {
        int tamaño, contIncidencias = 0, contador = 0, iterador = 0, indexJ = 0, contadorOnly = 0;
        entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del arreglo: ");
        tamaño = entrada.nextInt();
        int[] ar = new int[tamaño];
        for(int i = 0; i < ar.length; i++){
            System.out.print("Agregar valor a la posicion " + i + " Del arreglo: ");
            ar[i] = entrada.nextInt();
        }
        Arrays.sort(ar);
        int[] arNumElementos = new int[ar.length];
        int aux = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (aux == ar[i]) {
                contador++;             
            } else {
                arNumElementos[iterador] = contador;
                contador = 1;
                aux = ar[i];
                iterador++;
            }
        }
        arNumElementos[iterador] = contador;  
        int[] tempArray = new int[ar.length];
        for (int i = 0; i < ar.length - 1; i++) {
            int elemento = ar[i];
            if (elemento != ar[i + 1]) {
                tempArray[indexJ++] = elemento;
                contIncidencias++;
            }
        }
        tempArray[indexJ++] = ar[ar.length - 1];
        for (int elemento : tempArray) {
            if (elemento != 0){
                contadorOnly++;
            }
        }
        int[][] arRepetidos = new int[contadorOnly][2];
        for(int x = 0; x < arRepetidos.length; x++){
            for (int y = 0; y < arRepetidos[x].length; y++){
                if (y == 0) {
                    arRepetidos[x][y] = tempArray[x];
                } else {
                    arRepetidos[x][y] = arNumElementos[x];
                }
            }
        }
        System.out.println("Arreglo in repetir: ");
        for(int x = 0; x < arRepetidos.length; x++) {
            System.out.println(arRepetidos[x][0]);       
        }
        contIncidencias--;
        System.out.println("Los elementos repetidos son: " + contIncidencias);
    }
}
