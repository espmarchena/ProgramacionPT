package estudiandoparaelexamen1;

import java.util.Scanner;

public class DoWhile_PedirNumHasta0yDecirMayor {

	public static void main (String args[]) {
		//Pedir al usuario que introduzca números hasta que introduzca el 0 y y cuando lo haga decir el mayor número introducido
		
		Scanner sc = new Scanner (System.in);
		int num;
		int numMayor = 0;
		
		do {
			System.out.println("numero entre 0 y 100:");
			num = sc.nextInt();
		
			if (num>= numMayor) {
				numMayor = num;
			}
			
		}
		while(num!=0);
			System.out.println("Fin");
			
			
			System.out.println("El numero mayor introducido es "+ numMayor);
		
		
		
		sc.close();
			
	}
	
}
