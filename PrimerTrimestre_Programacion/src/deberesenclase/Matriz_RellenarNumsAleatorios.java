package deberesenclase;

public class Matriz_RellenarNumsAleatorios {

	public static void main(String[] args) {
		
		/*int max=10;
		int min=0;
		int range= (max-min) +1;
		int nAleatorio = (int) ((range * Math.random()) + min);*/

		int tabla[][] = new int [5][5];				
		int sumaTotal = 0; 
		int sumaFila= 0;
		
		int max=9;
		int min=0;
		int range= (max-min) +1;
		    	
		for (int i=0; i<tabla.length; i++) {	               
			for (int j=0; j<tabla[i].length; j++) {  //uso la longitud de las filas de la tabla
				int nAleatorio = (int) (Math.random() * range + min);
				tabla[i][j] = nAleatorio; // asigno los numeros aleatorios a mi matriz
			}
			
		}
		
		for (int i=0; i<tabla.length; i++) {  
			for (int j=0; j<tabla[i].length; j++) {
				if(i%2==0){ // i = filas
					System.out.print("\u001B[32m" + tabla[i][j] + " "); // pinta de un color las filas pares
				}
				else if (i%2!=0) {
					System.out.print("\u001B[35m" + tabla[i][j] + " "); // pinta de un color las filas impares
				}
			}
			System.out.println(""); //la clave esta aqui PARA PINTAR EN FORMATO MATRIZ, para cosa que ocurre en el bucle de dentro, pasan cosas en el bucle de fuera
			//en este caso, cada vez que acaba el bucle, salta y vuelve a repetir hasta 5 veces
		}
		
		for (int i=0; i<tabla.length; i++) {  
			for (int j=0; j<tabla[i].length; j++) {
			
				sumaTotal = sumaTotal + i + j;
			}
			sumaFila=+i;
			System.out.println("\u001B[30m" + "Suma de la fila " + i + " :" + sumaFila);
		}
		System.out.println("\u001B[30m" + "Suma total de la matriz: " + sumaTotal);
	}

}
