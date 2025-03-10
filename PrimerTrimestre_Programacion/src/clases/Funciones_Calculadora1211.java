package clases;

import java.util.Scanner;

public class Funciones_Calculadora1211 {

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		miPrograma(); // LLAMO A LA FUNCION QUE ACUMULA TODAS LAS FUNCIONES QUE HACEN  EL PROGRAMA COMPLETO
		
		
		System.out.println("Fin del programa!!!");
		sc.close();

	}
	
	public static void miPrograma() { //FUNCION QUE HACE EL DO WHILE 
		int opcion;
		do {
			opcion = menu();	//LLAMO A LA FUNCION QUE HACE EL MENU
		} while (opcion != 0);
	}
	
	public static int pedirNumero(String mensaje) { //FUNCION PARA PEDIR EL NUMERO
		System.out.println(mensaje);
		int numero = sc.nextInt();
		return numero;
	}
	
	public static int menu() { // //FUNCION QUE PIDE LA OPCION DEL MENU
		System.out.println("Introduce una opción (1. Suma, 2. Resta, 3. Mul, 4. Div, 5. Resto, 0. Salir): ");
		int opcion = sc.nextInt(); 
		if (opcion != 0) {
			menuConOpcion(opcion); //LLAMO A LA FUNCION QUE HACE EL SWITCH
		}
		
		return opcion;
	}
	
	public static void menuConOpcion(int opcion) { //FUNCION PARA EL SWITCH
		int numero1 = pedirNumero("Por favor, introduce el número 1: "); //LLAMO A LA FUNCION QUE PIDE LOS NUMEROS
		int numero2 = pedirNumero("Introduce el número 2: "); //LLAMO A LA FUNCION QUE PIDE LOS NUMEROS
		
		switch (opcion) {
			case 1: 
				System.out.println("El resultado es " + suma(numero1, numero2));
				break;
			case 2: 
				System.out.println("El resultado es " + resta(numero1, numero2));
				break;
			case 3: 
				System.out.println("El resultado es " + mul(numero1, numero2));
				break;
			case 4: 
				System.out.println("El resultado es " + div(numero1, numero2));
				break;
			case 5: 
				System.out.println("El resultado es " + resto(numero1, numero2));
				break;
			case 0: 
				System.out.println("Adios");
				break;
			default: 
				System.out.println("Error en la opción");
			
		}
	}
	
	public static int suma(int num1, int num2) { //FUNCION QUE SUMA
		System.out.println("Entro a la función para calcular la suma de " + num1 + " + " + num2);
		return num1 + num2;
		
	}
	
	public static int resta(int num1, int num2) { //FUNCION QUE RESTA
		System.out.println("Entro a la función para calcular la resta de " + num1 + " - " + num2);
		return num1 - num2;
		
	}
	
	public static int mul(int num1, int num2) { //FUNCION QUE MULTIPLICA
		System.out.println("Entro a la función para calcular la multiplicación de " + num1 + " * " + num2);
		return num1 * num2;
		
	}
	
	public static int div(int num1, int num2) { //FUNCION QUE DIVIDE
		System.out.println("Entro a la función para calcular la división de " + num1 + " / " + num2);
		return num1 / num2;
		
	}
	
	public static int resto(int num1, int num2) { //FUNCION QUE CALCULA EL RESTO
		System.out.println("Entro a la función para calcular el resto de " + num1 + " % " + num2);
		return num1 % num2;
		
	}
		
	
	
	
}
