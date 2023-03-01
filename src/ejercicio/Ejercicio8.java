package ejercicio;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos las cadenas 
		String prefijo="Javalín, javalón"; //Será el prefijo 
		String sufijo = "javalén, len, len"; //Será el sufijo
		
		boolean traductor; //Se guardará el resultado de si comienza por el prefijo la frase
		boolean traductor2; //Se guardará el resultado de si termina por el sufijo la frase
		
		String frase; //Se guardará la frase 
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		//Leemos el dato
		frase=read.nextLine();
		
		//Comprobamos que la frase comienza por el prefijo o sufijo
		traductor = frase.startsWith(prefijo);
		traductor2 = frase.endsWith(sufijo);
		
		//Si el traductor es true
		if(traductor) {
			//Mostrará la frase letra por letra sin prefijo
			for (int i =prefijo.length();i<frase.length();i++) {
				System.out.print(frase.charAt(i));
			}
			
		//Si el traductor2 es true
		}else if (traductor2) {
			//Mostrará la frase letra por letra sin sufijo
			for (int i = 0; i<frase.length()-sufijo.length();i++) {
				System.out.print(frase.charAt(i));
			}
		//Por el contrario, mostrará que la frase no está contenida en el idioma	
		}else {
			System.out.println("La frase no está en idioma de Javalandia");
		}
		//Finalmente cerramos el Scanner
		read.close();
	}

}
