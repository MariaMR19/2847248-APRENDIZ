//Realizar una aplicación en Java que solicite al usuario un numero, cree un arreglo del tamaño del numero indicado, lo llene 
//con números primos en cada posición y después lo muestre en pantalla.

import java.util.Scanner;

public class Ejer02{
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner (System.in);

        System.out.print("Ingrese un número entero: ");
        int n=entrada.nextInt();                                 
        
        int numeros[]=new int [n];
        
        int[] primos = new int[n];
        int contador = 0;
        int num = 2;
        boolean esPrimo;

        while (contador < n) {
            esPrimo = true;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[contador] = num;
                contador++;
            }
            num++;
        }

        System.out.print("Arreglo de números primos:");
        for (int i = 0; i < n; i++) {
            System.out.println(primos[i] + " ");
        }
    }
}
