//Escribir un programa que calcule el máximo de 4 números ingresados por el usuario utilizando una estructura
//condicional.//

import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();
        
        System.out.println("Ingrese el cuarto número:");
        double num4 = scanner.nextDouble();        
       
        double mayor = num1; 
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        if (num4 > mayor) {
            mayor = num4;
        }
        
        System.out.println("El mayor de los cuatro números ingresados es: " + mayor);
        
        
        scanner.close();
    }
}
