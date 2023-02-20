package ejercicio;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String frase;
		int numEspacio=0;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca una frase");
		frase=read.nextLine();
		
		for (int i =0; i<frase.length();i++) {
			if (frase.charAt(i)==' ') {
				numEspacio++;
			}
		}
		
		System.out.println("El número de espacios es de " + numEspacio);
		
		read.close();
	}

}
