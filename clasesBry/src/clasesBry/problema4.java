package clasesBry;
import java.util.Scanner;

public class problema4{
	public static Scanner entrada; 
	// entrada es el input del perograma
	public static void main(String[] args) {
	entrada = new Scanner(System.in);
	
	String password = "123";
	String passO = "";
	while(password.equals(passO)==false){
		System.out.print("Ingrese su contraseña: ");
		passO = entrada.next();
		if(password.equals(passO)==false) {
			System.out.println("Contraseña incorrecta");
		}
	}
	System.out.print("\nIngreso");
		
	}

}
