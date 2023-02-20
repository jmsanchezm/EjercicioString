package ejercicio;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String frase1, frase2;
		int comp;
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca dos frases:");
		frase1= read.nextLine();
		frase2=read.nextLine();
		
		comp=frase1.compareTo(frase2);
		
		if (comp>0) {
			System.out.println("La frase 1 es más larga");
		}else if (comp<0){
			System.out.println("La frase 2 es más larga");
		}else {
			System.out.println("Las frases son de la misma longitud");
		}

		read.close();
	}

}
