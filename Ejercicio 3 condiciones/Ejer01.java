//Escribir un programa que determine si un número ingresado por el usuario es positivo o negativo.//

import java.util.Scanner;

public class Ejer01{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.println("Ingrese un número");
        double num = scanner.nextDouble();     
        
        if (num>0) {
            System.out.println(" Su número es positivo");
        }else if (num<0) {
            System.out.println("  Su número es negativo");
        }else{
            System.out.println(" Su número es el cero");
        }
       
        scanner.close();
    }
}