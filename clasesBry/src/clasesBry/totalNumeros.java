import java.util.Scanner;
public class ejercicio4Lab5{
	public static Scanner entrada;
public static void main(String[] args){

	int cant_numeros, validacion, promedio, contadorPos, contadorNeg, positivos, negativos;
	validacion = 0;
	promedio = 0;
	contadorPos = 0;
        contadorNeg = 0;
        positivos = 0;
        negativos = 0;
	do{
		entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros que desea verificar");
		cant_numeros = entrada.nextInt();
		if(cant_numeros != 0){
		int[] numeros = new int[cant_numeros];
			for(int i = 0; i < numeros.length; i++ ){
				int posicion = i+1;
				System.out.println("Ingrese el numero #" + posicion);
				numeros[i] = entrada.nextInt();
				if(numeros[i] == 0){
					System.out.println("Detectamos el ingreso del numero 0, por favor reinicie el programa");
					validacion = 1;
					break;
				}
			}
                        for(int j = 0; j < numeros.length; j++ ){
                            if(numeros[j] > 0){
                                positivos += numeros[j];
                                contadorPos++;
                            }else if(numeros[j] < 0){
                                negativos += numeros[j];
                                contadorNeg++;
                            }
                        }
                        System.out.println("Se ingresaron " + contadorPos + " numeros positivos y su resultado es: " + positivos);
                        System.out.println("Se ingresaron " + contadorNeg + " de numeros negativos y su resultado es: " +negativos);

                        System.out.println("Se ingreso una cantidad de numeros igual a " + numeros.length);
                        
		}else{
			System.out.println("Detectamos el ingreso del numero 0, por favor reinicie el programa");
			validacion = 1;

			}
	}while(validacion == 0);
}}
