package clasesBry;
import java.util.Scanner;

public class PiedraPapelTijera {
public static Scanner entrada;
public static String dato2;

public static void main(String[] args) {
	entrada = new Scanner(System.in);
	int comp;
	comp = 0;// variable a evaluar en doW
	do { //do global
		
	System.out.print("PIEDRA PAPEL TIJERA JUEGO\n1. Jugar con otra persona\n2. Jugar contra la maquina\nRespuesta: ");
	int resp = entrada.nextInt();
	switch(resp) {
	case 1:
		do {  //do de lo primero
		System.out.println("\nPiedra(P), Tijera(T), Papel(Pa)");
		System.out.print("Introducir dato 1: ");
		String dato1 = entrada.next();
		System.out.print("\nIntroducir dato 2: ");
		String dato2 = entrada.next();
		//inicio de condicionales
		//piedra gana a tijera
		if(dato1.equalsIgnoreCase("p") && dato2.equalsIgnoreCase("t")){
			System.out.println("El jugador 1 gana");
			
			// inicio
			System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
			int respuesta = entrada.nextInt();
			if(respuesta == 1) {
				comp++;
			}else if (respuesta == 2) {
				
				comp = 0;
			}else if(respuesta > 2 || respuesta <1) {
				comp = 0;
			}
			//final
			
		} else if (dato1.equalsIgnoreCase("t") && dato2.equalsIgnoreCase("p")) {
			System.out.println("El jugador 2 gana");
			// inicio
						System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
						int respuesta = entrada.nextInt();
						if(respuesta == 1) {
							comp++;
						}else if (respuesta == 2) {
							
							comp = 0;
						}else if(respuesta > 2 || respuesta <1) {
							comp = 0;
						}
						//final
		}
		//tijera gana a papel
		if (dato1.equalsIgnoreCase("t") && dato2.equalsIgnoreCase("pa")) {
			System.out.println("El jugador 1 gana");
			// inicio
						System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
						int respuesta = entrada.nextInt();
						if(respuesta == 1) {
							comp++;
						}else if (respuesta == 2) {
							
							comp = 0;
						}else if(respuesta > 2 || respuesta <1) {
							comp = 0;
						}
						//final
		} else if(dato1.equalsIgnoreCase("pa") && dato2.equalsIgnoreCase("t")) {
			System.out.println("Wl jugador 2 gana");
			
			// inicio
						System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
						int respuesta = entrada.nextInt();
						if(respuesta == 1) {
							comp++;
						}else if (respuesta == 2) {
							
							comp = 0;
						}else if(respuesta > 2 || respuesta <1) {
							comp = 0;
						}
						//final
		}
		//papel gana piedra
		if(dato1.equalsIgnoreCase("pa") && dato2.equalsIgnoreCase("p")) {
			System.out.println("El jugador 1 gana");
			
			// inicio
						System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
						int respuesta = entrada.nextInt();
						if(respuesta == 1) {
							comp++;
						}else if (respuesta == 2) {
							
							comp = 0;
						}else if(respuesta > 2 || respuesta <1) {
							comp = 0;
						}
						//final
			
		} else if(dato1.equalsIgnoreCase("p") && dato2.equalsIgnoreCase("pa")) {
			System.out.println("El jugador 2 gana");
			
			// inicio
						System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
						int respuesta = entrada.nextInt();
						if(respuesta == 1) {
							comp++;
						}else if (respuesta == 2) {
							
							comp = 0;
						}else if(respuesta > 2 || respuesta <1) {
							comp = 0;
						}
						//final
		}
		}while(comp == 1);
		break;
		case 2:	
			do {
			System.out.println("\nPiedra(P), Tijera(T), Papel(Pa)");
			System.out.print("Introducir dato 1: ");
			String dato1 = entrada.next();
			
			int random = (int)(Math.random()*3+1);
			
			
			if(random == 1) {
				dato2 = "p";
			} else if (random == 2) {
				dato2 = "t";
			} else if (random == 3) {
				dato2 = "pa";
			}
			
			
			//piedra gana a tijera
			if(dato1.equalsIgnoreCase("p") && dato2== "t"){
				System.out.println("El jugador 1 gana");
				System.out.println("La maquina elijio tijera");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
				
			} else if (dato1.equalsIgnoreCase("t") && dato2.equalsIgnoreCase("p")) {
				System.out.println("El jugador 2 gana");
				System.out.println("La maquina elijio piedra");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
			}
			
			
			
			//tijera gana a papel
			if (dato1.equalsIgnoreCase("t") && dato2.equalsIgnoreCase("pa")) {
				System.out.println("El jugador 1 gana");
				System.out.println("La maquina elijio papel");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
			} else if(dato1.equalsIgnoreCase("pa") && dato2.equalsIgnoreCase("t")) {
				System.out.println("Wl jugador 2 gana");
				System.out.println("La maquina elijio tijera");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
			}
			
			//papel gana piedra
			if(dato1.equalsIgnoreCase("pa") && dato2.equalsIgnoreCase("p")) {
				System.out.println("El jugador 1 gana");
				System.out.println("La maquina elijio piedra");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
			} else if(dato1.equalsIgnoreCase("p") && dato2.equalsIgnoreCase("pa")) {
				System.out.println("El jugador 2 gana");
				System.out.println("La maquina elijio papel");
				
				// inicio
				System.out.println("풴olver a jugar o cambiar modo de juego?\n1.Volver a jugar\n2.Menu\nRespuesta: ");
				int respuesta = entrada.nextInt();
				if(respuesta == 1) {
					comp++;
				}else if (respuesta == 2) {
					
					comp = 0;
				}else if(respuesta > 2 || respuesta <1) {
					comp = 0;
				}
				//final
			}
			break;
			}while(comp == 1);
			
		}
	}while(comp == 0);

}
}
