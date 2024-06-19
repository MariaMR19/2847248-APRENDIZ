import java.util.Scanner;
import java.util.Random;

public class Ejer02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Ingresar tamaño del arreglo:");
        int n = teclado.nextInt();

        System.out.println("Ingresar número a buscar:");
        int numABuscar = teclado.nextInt();
        
        int[] arreglo = new int[n];
        
        Random random = new Random();
        for (int i = 1; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(10000); 
        }

        System.out.println("Arreglo principal:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
                
        int posicion = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numABuscar) {
                posicion = i;                
            }
        }
        
        if (posicion == 0) {
            System.out.println();
            System.out.println("El número no está en el arreglo ");
        } else {
            System.out.println("El número " + numABuscar + " se encuentra en la posición " + posicion + " del arreglo.");
        }
    }
}
