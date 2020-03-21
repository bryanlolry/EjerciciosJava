package clasesBry;
import java.util.Scanner;
public class problema6 {
	public static Scanner entrada;
	public static void main(String[] args) {
		int arroba = 0;
		boolean punto = false;
		
		entrada = new Scanner(System.in);
		System.out.println("Introduce tu email: ");
		String correo = entrada.next();
		for(int x=0; x<correo.length(); x++) {
				if(correo.charAt(x)=='@') {
					 arroba++;
					 
				}
				if(correo.charAt(x)=='.') {
					 
					 punto = true;
				}
				
			}
		if(arroba == 1 && punto==true) {
			System.out.println("Email valido");
		}else if(arroba >1) {
			System.out.println("introduce un correo valido, hay " + arroba + " arrobas");
		}else if (arroba < 1) {
			System.out.println("introduce un correo valido, falta la arroba");
		}
		
	}
		
}


