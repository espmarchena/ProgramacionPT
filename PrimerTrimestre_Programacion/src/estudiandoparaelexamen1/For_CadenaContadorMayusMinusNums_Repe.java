package estudiandoparaelexamen1;

import java.util.Scanner;

public class For_CadenaContadorMayusMinusNums_Repe {

	public static void main(String[] args) {
		// 1 cuantas mayus 2 cuantas minus 3 cuantos numeros 4 cuantos caracteres especiales
		
		Scanner sc = new Scanner (System.in);
		System.out.println("cadena texto:");
		String s = sc.nextLine();
		int contadorMayus=0;
		int contadorMinus=0;
		int contadorNums=0;
		
		for (int i=0;i<s.length();i++) {
			char A = s.charAt(i);
			if(A>='A' && A<='Z') {
			contadorMayus++;
			}
		}
		System.out.println("El total de mayusculas es: " + contadorMayus);
		
		for (int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			if(a>='a' && a<='z') {
				contadorMinus++;
			}
		}
		System.out.println("El total de minusculas es: " + contadorMinus);
		
		for (int i=0; i<s.length();i++) {
			char n= s.charAt(i);
			if(n>='0' && n<= '9') {
				contadorNums++;
			}
		}
		System.out.println("El total de números es: " + contadorNums);
		
		
		
		sc.close();
		
		
	}

}
