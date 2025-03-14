package deberesenclase;

public class Matriz_RellenarNumsAleatorios {

	public static void main(String[] args) {
		
		/*int max=10;
		int min=0;
		int range= (max-min) +1;
		int nAleatorio = (int) ((range * Math.random()) + min);*/

		int tabla[][] = new int [5][5];				
		
		
		int max=9;
		int min=0;
		int range= (max-min) +1;
		    	
		for (int i=0; i<tabla.length; i++) {	               
			for (int j=0; j<tabla[i].length; j++) {  //uso la longitud de las filas de la tabla
				int nAleatorio = (int) (Math.random() * range + min);
				tabla[i][j] = nAleatorio; // asigno los numeros aleatorios a mi matriz
			}
			
		}
		
		for (int i=0; i<tabla.length; i++) {  //(array principal) (un array de arrays)
			for (int j=0; j<tabla[i].length; j++) {  //cojo la columna de cada una de las filas. Para cada uno de los i empiezo a ejecutar las j // tabla[i] es un array
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
		int sumaTotal=0;
		
		for (int i=0; i<tabla.length; i++) {  
			int sumaFila= 0;
			
			for (int j=0; j<tabla[i].length; j++) { //cada una de las columnas
				
				sumaFila+=tabla[i][j];
			}	
			System.out.println("\u001B[30m" + "Suma de la fila " + i + " :" + sumaFila);
			sumaTotal+=sumaFila;
	
		}
		System.out.println("\033[38;5;94m" + "Suma total de la matriz: " + sumaTotal);	
		
		
		
		int sumaColumna=0;
		for (int j=0; j<tabla.length; j++) {
			int i=0;
			sumaColumna=0;
			for (i=0; i<tabla[j].length; i++) { 
				sumaColumna+=tabla[i][j];
			}
			System.out.println("\u001B[30m" + "Suma de la columna " + j + " :" + sumaColumna);
		}
		
		 /* int sumaDiagonalP=0;
		 * for (int i=0; i<tabla.length;i++){
		 * sumaDiagonalP+=tabla[i][i];            // tabla[i][i] porque los valores son los mismos  0,0  1,1  2,2 ......
		 *}
		 FORMA LOGICA DE HACERLO*/
		int sumaDiagonalP =0;
		for (int i=0, j=0; i<tabla.length && j<tabla.length ; i++, j++) {  
			sumaDiagonalP+=tabla[i][j];
			
		}
		System.out.println("\033[38;5;214m"+ "Suma diagonal izq a dcha: " + sumaDiagonalP);
		
		
		
		/* for (int i=0; i<tabla.length;i++){
		 * suma+=tabla[i][(tabla.length-1)-i];        //  2,0  1,1  0,2 ..........
		 *}
		 FORMA LOGICA DE HACERLO*/
		int sumaDiagonalS =0;
		for (int i=0, j=(tabla.length)-1; i<tabla.length && j>=0 ; i++, j--) {  
			sumaDiagonalS+=tabla[i][j];
			
		}
		System.out.println("\033[38;5;209m"+ "Suma diagonal dcha a izda: " +sumaDiagonalS);
		
		
		
		
		
	}
	
	

	
}
