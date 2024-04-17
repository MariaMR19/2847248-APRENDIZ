//Escribir un programa que determine si un número ingresado por el usuario es divisible por 2, 3 y 5 al mismo
//tiempo.

import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num = scanner.nextInt();             


        if (num % 2 == 0 & num % 3 == 0 & num % 5 == 0) {           
            System.out.println("El número ingresado es divisible entre 2, 3 y 5");
        }else {
            System.out.println("El número ingresado no es divisible entre 2 o 3 o 5");
        }  
       
        scanner.close();       
        
    }
}
