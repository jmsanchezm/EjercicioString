package ejercicio;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String prefijo="Javalín, javalón";
		String sufijo = "javalén, len, len";
		
		boolean traductor;
		boolean traductor2;
		String frase;
		
		Scanner read= new Scanner (System.in);
		frase=read.nextLine();
		
		traductor = frase.startsWith(prefijo);
		traductor2 = frase.endsWith(sufijo);
		if(traductor) {
			for (int i =prefijo.length();i<frase.length();i++) {
				System.out.print(frase.charAt(i));
			}
		}else if (traductor2) {
			for (int i = 0; i<frase.length()-sufijo.length();i++) {
				System.out.print(frase.charAt(i));
			}
		}else {
			System.out.println("La frase no está en idioma de Javalandia");
		}

	}

}
