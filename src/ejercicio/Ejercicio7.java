package ejercicio;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String frase;
		
		String inv;
		
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca una frase:");
		frase=read.nextLine();	
		
		inv = new StringBuilder (frase).reverse().toString();
		
		if (frase.equals(inv)) {
			System.out.println("La frase es palíndroma");
		}else {
			System.out.println("La frase no es palíndroma");
		}
		read.close();
	}

}
