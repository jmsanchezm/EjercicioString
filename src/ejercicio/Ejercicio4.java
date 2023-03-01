package ejercicio;

import java.util.Scanner;

public class Ejercicio4 {
	
	
	public static void inverso(String cadena) {
		for (int i=cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		//Declaramos la variable 
		String frase;
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Pedimos la frase
		System.out.println("Introduzca una frase");
		//Leemos la frase
		frase=read.nextLine();
		
		//Llamamos a la función inverso
		Ejercicio4.inverso(frase);
		
		read.close();
	}

}
