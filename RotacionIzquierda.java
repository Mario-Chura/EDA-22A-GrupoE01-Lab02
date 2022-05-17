
public class RotacionIzquierda{
	private static int [] numeros = {1,2,3,4,5};
	public static void main(String[] args) {

		System.out.println("Array");
                mostrar();
	
		for (int i = 0 ; i < 5 ; i++){
            		rotacionIzquierda();
            		System.out.println("\nArray rotado a la izquierda "+ (i+1)+" vez");
            		mostrar();
       		}
		System.out.println("");        	
                
	}
	public static void rotacionIzquierda(){
 		
		int aux = numeros[0];
		for(int i=0; i<numeros.length - 1 ; i++ ){
			numeros[i] = numeros[i+1];
		}
		numeros[ numeros.length - 1] = aux;		 
	}
	public static void mostrar(){
		for (int i = 0 ; i < numeros.length ; i++){
			System.out.print(numeros[i] + " ");
		}
	}
}
