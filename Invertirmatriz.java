public class Invertirmatriz {
        
 public static void main(String[] args) {
    int[] matriz = {1,2,3};
    for(int a: matrizInvertida(matriz)){
       System.out.print(a + " " );
    }
   }
 public static int[] matrizInvertida(int[] matriz) {
     int iteraciones = (int) Math.floor(matriz.length/2);
     int longitud = matriz.length;

     for (int i = 0; i < iteraciones; i++){
         int auxiliar = matriz[i];
         matriz[i] = matriz[longitud - i - 1];
         matriz[longitud - i -1] = auxiliar;
     }
    
     return matriz;
 }
}
