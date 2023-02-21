package ejercicio;

import java.util.Scanner;

public class Ejercicio2Avanzado {

	public static void main(String[] args) {
		
		String contraseña;
		String adivina;

		Scanner read= new Scanner (System.in);
		
		System.out.println("Jugador 1. Introduzca una contraseña");
		contraseña = read.nextLine();

		do {
			System.out.println("Jugador 2. Introduzca la contraseña del jugador 2");
			adivina=read.nextLine();
			
			for (int i=0; i<contraseña.length();i++) {
				
				if (i<adivina.length() && contraseña.charAt(i)==adivina.charAt(i)) {
					System.out.println(contraseña.charAt(i));
				}else {
					System.out.println("*");
				}
			}
			System.out.println();
		}while(!contraseña.equals(adivina));

		System.out.println("¡¡Has adivinado la contraseña!!");
	}

}
