package clasesBry;

public class Arrayfinanciero {
public static void main(String[] args) {
	double acumulado;
	double interes= 0.10;
	
	double[][] saldo = new double[6][5];
	for(int i = 0; i<6; i++ ) {
		saldo[i][0]=10000; //rellena la primera fila con el valor de 10000: 0:1 0:2 0:3 0:4 0:5
		acumulado = 10000;
		System.out.println();
		for(int j = 1; j<5; j++){
			acumulado = acumulado+(acumulado*interes);  //saca el valor del interes 
			saldo[i][j]=acumulado;
			
		
			}
			interes = interes + 0.01;
				
		}
	for(int y = 0; y<6; y++) {
		System.out.println();
		for(int z = 1; z<5; z++) {
			System.out.print(saldo[y][z] + " ");
		}
	}

	}
}
