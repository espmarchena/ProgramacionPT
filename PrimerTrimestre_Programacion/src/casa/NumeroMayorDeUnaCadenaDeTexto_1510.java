package casa;

import java.util.Scanner;

public class NumeroMayorDeUnaCadenaDeTexto_1510 {

	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número:");
		String cadena=sc.nextLine();
		
		char menor='9';
		int i=0;
		
		while(i<cadena.length()) {
			
			char c= cadena.charAt(i);
			
			if(c>= '0' && c<= '9') {
				
				if(c<menor) {
					menor=c;
				}
			}
			i++;
		}
		
		System.out.println("El número menor de la cadena de texto es: " + menor);
		
		
		
		
		
		sc.close();
	
		
		
	}
	
}
