package deberesenclase;

public class FuncionesArrays_NumsAleatorios {

	public static void main(String[] args) {
		
		System.out.println("\nArray de números aleatorios generado: ");
		int[] numerosAleatorios = generarArrayAleatorio(10); // Funcion para generar un array de 10 números aleatorios
		pintarArray(numerosAleatorios); //pinta el array de numeros aleatorios
        
        int cantidadPares = contarNumerosPares(numerosAleatorios, true); // Funcion para contar cuántos números pares hay en el array
        System.out.println("\nCantidad de números pares en el array: " + cantidadPares);
        
        int cantidadImpares = contarNumerosPares(numerosAleatorios, false); // Funcion para contar cuántos números impares hay en el array
        System.out.println("\nCantidad de números impares en el array: " + cantidadImpares);
        
        System.out.println("\nLos número de pares son: ");
        int subconjuntoPares[] =  obtenerSubcontunjoParesImpares(numerosAleatorios, true, cantidadPares);
        pintarArray(subconjuntoPares);
        
        System.out.println("\nLos números de impares son: ");
        int subconjuntoImpares[] = obtenerSubcontunjoParesImpares(numerosAleatorios, false, cantidadImpares);
        pintarArray(subconjuntoImpares);
        
	}

	public static int obtenerNumeroAleatorio() { // Funcion para obtener los numeros aleatorios
		
		// Definir los valores de min y max para los números aleatorios
        int max = 10;
        int min = 0;
        int range = (max - min) + 1; // Calcula el rango de números posibles
		int nAleatorio = (int) ((range * Math.random()) + min);  // Generar un número aleatorio en el rango [min, max]
		
		return nAleatorio; // Me devuelve el número aleatorio
	}
	
    public static int[] generarArrayAleatorio(int tamaño) {  // Función que genera un array de 'tamaño' números aleatorios
        
        int[] tabla = new int[tamaño];  // Crear un array de enteros con la longitud especificada
        
        // Llenar el array con números aleatorios generados con Math.random()
        for (int i = 0; i < tabla.length; i++) {
            
            tabla[i] = obtenerNumeroAleatorio();  // Asignar un número aleatorio con la funcion que los genera, a cada posicion del array que he generado
        }
         
        return tabla; // Me devuelve el array generado
    }
	
 
    public static int contarNumerosPares(int[] tabla, boolean pares) { // Función que recibe un array y un boolean que si es true devuelve los pares y si es false devuelve los impares
        
        int contador = 0; // Inicializar un contador para los números pares o impares
        
        // Recorrer cada número en el array usando un bucle tradicional
        for (int i = 0; i < tabla.length; i++) {
            
            if (pares && tabla[i] % 2 == 0) { // Verificar si el número es par(true) (divisible por 2)               
                contador++; // Incrementar el contador si el número es par
            }
            else if (!pares && tabla[i] % 2 != 0) { // // Verificar si el número es impar(false) (no divisible por 2)
            	contador++; // Incrementar el contador si el número es impar
            } //el else de un and es un or, por eso usamos aqui else if **
        }       
        
        return contador; // Devolver la cantidad de números pares encontrados
    }
	
    
    public static int[] obtenerSubcontunjoParesImpares (int tabla[], boolean pares, int cantidad) {
    	
    	int tablaSubconjunto[] = new int [cantidad]; //creo una tabla para guardar los numeros, con una cantidad dada por parametro cuando llame a la funcion desde el main
    	int posicionSubconjunto= 0; //esto es la i de la nueva tabla
    	
    	for (int i = 0; i < tabla.length; i++) { //recorre mi tabla de numeros aleatorios
    		if (pares && tabla[i] % 2 == 0) { // Verificar si el número es par(true) (divisible por 2)
    		tablaSubconjunto[posicionSubconjunto++] = tabla[i]; // la relleno con los numeros pares o impares diciendole que lo haga en la posicion correcta aumentando una en cada vuelta que de el bucle,
    		//ya que si no lo pongo todos los valores van a la posicion en la que etaban en la tabla inicial de los numeros aleatorios
    		}
    		else if (!pares && tabla[i] % 2 != 0) { // // Verificar si el número es impar(false) (no divisible por 2)
    			tablaSubconjunto[posicionSubconjunto++] = tabla[i];
    		 }
    	}
    	return tablaSubconjunto;
    }
    
    
    public static void pintarArray (int[]tabla) {
    
        for (int i = 0; i < tabla.length; i++) { //recorro la tabla
            System.out.print(tabla[i] + " "); // Imprimo el array generado con espacio entre cada número
        }
    }
    
    
    
}
