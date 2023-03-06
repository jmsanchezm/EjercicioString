package ejercicio;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		String palabraJ1;
		String palabraJ2;
		int posAleatoria;
		char[] palabra;
		
		Scanner read= new Scanner (System.in);
		
		System.out.println("Jugador 1. Introduzca una palabra");
		palabraJ1= read.nextLine();
		
		palabra=palabraJ1.toCharArray();
		
		for (int i =0; i < palabra.length;i++) {
			posAleatoria = (int)(Math.random()*palabra.length);
			System.out.print(palabra[posAleatoria]);
			
		}

	}

}
