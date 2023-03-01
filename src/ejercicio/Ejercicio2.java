package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variables
		String contraseña; //Se guardará la contraseña
		String adivina; //Se irá guardano los intentos del jugador
		int longi; //Se guardará la longitud de la contraseña
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		//Solicitamos la contraseña al jugador 1
		System.out.println("Jugador 1. Introduzca una contraseña");
		//Leemos dato
		contraseña = read.nextLine();
		
		//Ordenamos que:
		do {
			//Pida las posibles contraseñas al jugador 2
			System.out.println("Jugador 2. Introduzca la contraseña del jugador 2");
			//Leemos dato
			adivina=read.nextLine();
			//Comparamos el intento con la contraseña reak
			longi=contraseña.compareTo(adivina);
			
			//Si la longitud es mayor que 0
			if(longi>0) {
				//Le mostrará que la contraseña es mayor alfabéticamente
				System.out.println("La palabra es mayor alfabéticamente");
			//Si la longitud es menor que 0
			}else if (longi<0){
				//Le mostrará que la contraseña es menor alfabéticamente
				System.out.println("La palabara es menor alfabéticamente");
			//Por lo contrario
			}else {
				//Se saldrá del bucle
				break;
			}
		//Mientra que la contraseña sea distinto del intento
		}while(!contraseña.equals(adivina));
		
		//Una vez haya salido del bucle, le mostrará que ha acertado.
		System.out.println("¡¡Has adivinado la contraseña!!");
		
		//Cerramos el Scanner
		read.close();
	}

}
