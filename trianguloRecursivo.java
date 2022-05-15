import java.util.Scanner;
public class trianguloRecursivo {

	public static void main(String[] args) {

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