package ejercicio;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		String palabraJ1;
		String palabraJ2;
		int posAleatoria;
		char[] palabra;
		String palabraDesordenada="";
		int cont=0;
		Scanner read= new Scanner (System.in);
		
		System.out.println("Jugador 1. Introduzca una palabra/frase");
		palabraJ1= read.nextLine();
		
		
		palabra=palabraJ1.toCharArray();
		
		while(palabraJ1.length() != palabraDesordenada.length() ) {
			posAleatoria = (int)(Math.random()*palabra.length);
			if (palabra[posAleatoria] != ' ') {
				palabra[posAleatoria]=palabra[cont];
				cont++;
			}
		}
		
		System.out.println();
		System.out.println("Jugador 2. Intente adivinar la palabra/frase");
		do {
			palabraJ2=read.nextLine();
			
			
		}while(!palabraJ1.equals(palabraJ2));

	}

}
