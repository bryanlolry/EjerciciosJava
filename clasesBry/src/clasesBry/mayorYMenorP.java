import java.util.Scanner;
public class ejercicio3Lab6 {
    public static Scanner entrada;
    public static void main(String[] args){
        int tamaño, num, posPosi = 0, posNeg = 0;
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su arreglo");
        tamaño = entrada.nextInt();
        int[] numeros = new int[tamaño];
        for(int i = 0; i < numeros.length; i++){
            num = 1 + i;
            System.out.print("Ingrese el valor para la posicion" + num +": ");
            numeros[i] = entrada.nextInt();
        }
	int numMayor = numeros[0];
        int numMenor = numeros[0];
	for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > numMayor) {
                numMayor = numeros[x];
                posPosi = x+1;
            }
            if (numeros[x] < numMenor) {
                numMenor = numeros[x];
                posNeg = x+1;
            }
	}
	System.out.println("El mayor es: " + numMayor + ", se encuentra en la posicion: " + posPosi);
        System.out.println("El menor es: " + numMenor + ", se encuentra en la posicion: " + posNeg);     
    }
}
