package estudiandoparaelexamen1;

import java.util.Scanner;

public class BooleanWhile_NumerosHasta0YMultiplo5 {

	public static void main(String[] args) {
		// Introducir numeros hasta 0 o multiplo de 5. Y si entra num par mostrar que eso ha pasado
		//Sumar pares y restar impares
		
		Scanner sc= new Scanner (System.in);
		int num = 1;
		boolean multiplo = num%5==0;
		int acumuladorPar=0;
		int acumuladorImpar=0;
		
		while(num!=0 && !multiplo) { // pongo '&&' en vez de '||' porque 'hasta que' entre el 0 ó(||) un multiplo de 5 es lo contrario de 'mientras que' (&&)
			System.out.println("numerito:");														// y en el if, en la condicion se pone al contrario
			num = sc.nextInt();
			multiplo = num%5 == 0; // lo declaro de nuevo aqui para cambiar correctamente el valor de num y multiplo
		}
		boolean par = num%2==0; // lo inicializo aqui para que no se me rompa el valor de la variable
		
		if (par) {
			System.out.println("ha entrado un número par");
			System.out.println("Suma de pares: " + (acumuladorPar += num));

		}
		else {
			System.out.println("no ha entrado un numero par");
			System.out.println("Suma de impares: " + (acumuladorImpar -= num));
		}
			
	sc.close();		
	}

}
