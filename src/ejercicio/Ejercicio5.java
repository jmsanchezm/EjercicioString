package ejercicio;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String frase="";
		String palabra;
		Scanner read= new Scanner(System.in);
		
		System.out.println("Introduzca una frase palabara a palabra:");
		palabra=read.next();
		
		while(!palabra.equals("fin")) {
			frase+=palabra + " ";
			palabra=read.next();
			
		}
		System.out.println(frase);
		
		read.close();
	}

}
