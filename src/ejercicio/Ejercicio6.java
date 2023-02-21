package ejercicio;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String frase;
		String palabra;
		int cont=0;
		int posicion=0;
		
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca una frase");
		frase=read.nextLine();
		
		System.out.println("Introduzca una palabra:");
		palabra= read.next();
	
		while (posicion!=-1) {
			posicion =frase.indexOf(palabra, posicion+1);
			if (posicion>=0) {
				cont++;
			}
		}
		System.out.println("La palabra aparece " + cont + " veces");
	}

}
