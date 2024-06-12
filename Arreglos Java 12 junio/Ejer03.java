//Realizar una aplicación en Java que solicite al usuario un numero entero, se debe llenar el arreglo con datos solicitados al 
//usuario. Después de que el arreglo se encuentre lleno, se solicita al usuario ingresar un número correspondiente a una 
//posición dentro del arreglo. Se debe imprimir en pantalla el arreglo original y los valores del arreglo en sentido anti horario 
//desde la posición indicada por el usuario. 

import java.util.Scanner;

public class Ejer03{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduce un número entero: ");
        int tamano = entrada.nextInt();         

        int arreglo[i] = new int[tamano];

        System.out.println("Introduce los elementos del arreglo:");

        for (i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Arreglo completo:");
        for (i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("Introduce la posición del elemento que deseas ver en sentido anti-horario:");
        int posicion = entrada.nextInt();

        if (posicion > 0 && posicion <= tamano) {
            System.out.println("Arreglo original:");
            for (i = 0; i < tamano; i++) {
                System.out.print(arreglo[i] + " ");
            }

            System.out.println("Elementos en sentido anti-horario desde la posición " + posicion + ":");
            for (i = posicion - 1; i >= 0; i--) {
                System.out.print(arreglo[i] + " ");
            }
        } else {
            System.out.println("La posición debe ser entre 1 y " + tamano);
        }
    }
}


