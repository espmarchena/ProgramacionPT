package deberesenclase;

public class FuncionesMatriz_StringRepes {

	public static void main(String[] args) {
		// funcion que reciba un array de String y un apellido y que devuelva cuantos hay
		String tablaPersonas[][] = {{"Esperanza", "Marchena"},
									{"Jesus", "Marchena"},
									{"Ana", "Moreno"}};
											
				
		for (int i=0; i<tablaPersonas.length; i++) { //personas.length devuelve un 2 (las filas)					
			System.out.println(tablaPersonas[i][0]); // pinta el nombre de todas las personas, porque estan en la fila i que va a ir recorriendo todas las filas y en la posicion 0 siempre
			System.out.println(tablaPersonas[i][1]); // pinta el apellido de todas las personas
		}	
		
		for (int i=0; i<tablaPersonas.length; i++) {
			String persona[]= tablaPersonas[i];
			System.out.println("Persona " + i + ": ");
			
			for (int j=0; j<tablaPersonas[i].length; j++) { // uso la longitud de 
				System.out.println(tablaPersonas[i][j]); // i va cambiando y para cada i va cambiando j
			}
		}
		
		
		
	}
}
