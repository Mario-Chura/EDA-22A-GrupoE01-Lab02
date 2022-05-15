import java.util.Scanner;
public class trianguloRecursivo {

	public static void main(String[] args) {
        System.out.println ("Ejemplo de triangulo recursivo en  Java");
        System.out.println("Ingrese la base: ");
        Scanner scan = new Scanner (System.in);
        trianguloRecursivo(5, "");
	}
    public static void trianguloRecursivo (int numeroCaracteres, String cadena) {
        if ( numeroCaracteres < 1) {
            System.out.print(" ");
        }else {
            System.out.println("*" + cadena);
            cadena += "*";
            trianguloRecursivo(numeroCaracteres-1,  cadena);
        }
    }
}