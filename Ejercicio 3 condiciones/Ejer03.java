//Escribir un programa que determine si un número ingresado por el usuario es par.//

import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        
        System.out.println("Ingrese un número:");
        int num = scanner.nextInt();        
       
        if (num % 2 == 0) {
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su número es impar.");
        }        
      
        scanner.close();
    }
}