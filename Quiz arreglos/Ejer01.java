import java.util.Scanner;
import java.util.Random;

public class Ejer01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Ingresar tamaño del arreglo:");
        int n = teclado.nextInt();

        
        int[] arreglo = new int[n];

        
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(50); 
        }

        
        System.out.println("Arreglo original:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
              
       
        int[] Impares = new int[n];
        
        int contImpares = 0;

        
        for (int valor : arreglo) {
            if (valor % 2 != 0) {
                Impares[contImpares++] = valor;
            } 
        }
            
        System.out.println("Arreglo de números impares:");
        for (int valor : Impares) {
            System.out.print(valor + " ");
        }
        
    }
}
