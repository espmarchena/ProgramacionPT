package estudiandoparaelexamen1;

import java.util.Scanner;

public class CharAtWhile_CadenaAlDerechoYAlRevesYSumarNumsYVolverAPreguntar {

	public static void main(String[] args) {
		// cadena texto y leerla del reves y sumar numeros
		// pregunta si quiere introducir otra cadena, si dice que si vuelve a preguntar, si se equivoca vuelve a preguntar y sino sale.
		
		Scanner sc = new Scanner (System.in);
		String respuesta;
		
		do {
			System.out.println("Cadena texto con algun numero:");
			String s = sc.nextLine();
			int i = s.length()-1;
			int resultado= 0;
			
			if (s.length()>0) {
				
				while(i>=0) { //importante el '=' sino no coge la primera letra
					System.out.println(s.charAt(i));
				
					char c = s.charAt(i); // cojo los caracteres uno por uno de la cadena
					if(c>='0' && c<='9') { // y si entre ellos hay numeros
						int n= c-'0'; // le resto 0 al caracter para que lo convierta en numeros
						resultado += n; // y los sumo
					}
					i--; // lo declaro aqui para no perder el valor correcto de i				
					
				}
				System.out.println("suma de los numeros: " + resultado);
			}
			
			
	
			//con el siguiente bucle dentro del bucle principal, controlo que vuelva a preguntar si la respuesta no es ni si ni no
			do {
				System.out.println("¿Quieres otra cadena?");
				respuesta = sc.nextLine();
			}
			while(!respuesta.equals("si") && !respuesta.equals("no"));
		}
		while (respuesta.equals("si"));
		
		System.out.println("Fin");
		
		
		sc. close();
		

	}

}
