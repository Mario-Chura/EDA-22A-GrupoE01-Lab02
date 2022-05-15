import java.util.Scanner;
import java.util.Arrays;
public class RotacionIzquierda{
	private static int [] numeros = {1,2,3,4,5};
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese numero de rotacion: ");
		int n = leer.nextInt();
	
		System.out.println("Array");
                mostrar();
                rotacionIzquierda(n);
        	System.out.println("\nArray rotado a la izquierda"+n+" vez");
                mostrar();
	}
	public static void rotacionIzquierda(int n){
	 	
 		for(int h = 1; h <= n ; h++){
			int aux = numeros[0];
			for(int i=0; i<numeros.length - 1 ; i++ ){
				numeros[i] = numeros[i+1];
			}
			numeros[ numeros.length - 1] = aux;
			aux = 0;
		}	 
	}
	public static void mostrar(){
		for (int i = 0 ; i < numeros.length ; i++){
			System.out.print(numeros[i] + " ");
		}
	}
}
