package ejercicio;

import java.util.Scanner;

public class Ejercicio2Avanzado {

	public static void main(String[] args) {
		
		//Declaramos variables
		String contraseña; //Se guardará la contraseña 
		String intento; //Se guardará cada intento del jugador 2

		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos la contraseña
		System.out.println("Jugador 1. Introduzca una contraseña");
		//Leemos la contraseña
		contraseña = read.nextLine();

		//Ordenamos que
		do {
			//Se le pida al jugador 2 posibles contraseñas 
			System.out.println("Jugador 2. Introduzca la contraseña del jugador 2");
			//Leemos
			intento=read.nextLine();
			
			//Recorremos la contraseña
			for (int i=0; i<contraseña.length();i++) {
				//Si la i es menor que la longitud y el caracter de la posicion i es igual al del intento
				if (i<intento.length() && contraseña.charAt(i)==intento.charAt(i)) {
					//Se mostrará el carácter acertado
					System.out.println(contraseña.charAt(i));
					
				//Por el contrario
				}else {
					//Se mostrará un asterisco
					System.out.println("*");
				}
			}
			//Salto de línea
			System.out.println();
		//Mientras que la contraseña y el intento sea distinto
		}while(!contraseña.equals(intento));

		//Una vez acertado se le mostrasrá un mensaje de victoria
		System.out.println("¡¡Has adivinado la contraseña!!");
		
		//Cerramos Scanner
		read.close();
	}

}
