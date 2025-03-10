package casa;

public class DeberesEnCasa_MatrizDiagonalP {

	public static void main(String[] args) {
		// TODO  funcion que recibe matriz aleatoria y devuelve array con diagonal principal
		
		int[][] matriz = generarArrayAleatorio(); // Generar una matriz aleatoria
	    int[] diagonalPrincipal = diagonal(matriz); // Obtener la diagonal principal

	    // Imprimir la matriz
	    System.out.println("Matriz:");
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }

	    // Imprimir la diagonal principal
	    System.out.println("Diagonal principal:");
	    for (int num : diagonalPrincipal) {
	        System.out.print(num + " ");
	    }
		
	}

	public static int obtenerNumeroAleatorio() { // Funcion para obtener los numeros aleatorios
		
		// Definir los valores de min y max para los números aleatorios
        int max = 10;
        int min = 0;
        int range = (max - min) + 1; // Calcula el rango de números posibles
		int nAleatorio = (int) ((range * Math.random()) + min);  // Generar un número aleatorio en el rango [min, max]
		
		return nAleatorio; // Me devuelve el número aleatorio
	}
	
	public static int[][] generarArrayAleatorio() {  // Función que genera un array de 'tamaño' números aleatorios
        
        int[][] matriz = new int[5][5];  // Crear un array de enteros con la longitud especificada
        
        // Llenar el array con números aleatorios generados con Math.random()
        for (int i = 0; i < matriz.length; i++) {
        	for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = obtenerNumeroAleatorio();  // Asignar un número aleatorio con la funcion que los genera, a cada posicion del array que he generado
        }
        	}
        
        return matriz; // Me devuelve el array generado
     }
	
	public static int[] diagonal (int matriz[][]){
	int[] diagonal = new int[matriz.length];
	for (int i=0, j=0; i<matriz.length && j<matriz.length ; i++, j++) {  
		diagonal[i] = matriz[i][j];
	}
	
	return diagonal;
	}
	
}
