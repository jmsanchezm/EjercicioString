package ejercicio;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos variables
		String frase1, frase2; //Se guardarán las frases
		int comp;//Se guardará el resultado de la comparación
		
		//Creamos Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos frases
		System.out.println("Introduzca dos frases:");
		frase1= read.nextLine(); //Leemos frase
		frase2=read.nextLine(); //Leemos frase
		
		//Comparamos las frases
		comp=frase1.compareTo(frase2);
		
		//Si la comparación nos da un valor mayor a 0
		if (comp>0) {
			//La frase 1 es más larga
			System.out.println("La frase 1 es más larga");
			
		//Si la comparación es menor a 0
		}else if (comp<0){
			//La frase 2 es más corta
			System.out.println("La frase 2 es más larga");
			
		//Por el contrario
		}else {
			//La longitud de las frases es la misma
			System.out.println("Las frases son de la misma longitud");
		}
		
		//Cerramos Scanner
		read.close();
	}

}
