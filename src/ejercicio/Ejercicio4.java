package ejercicio;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void inverso(String cadena) {
		for (int i=cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
		}
	}

	public static void main(String[] args) {
		String frase;
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca una frase");
		frase=read.nextLine();
		
		Ejercicio4.inverso(frase);
		
		read.close();
	}

}
