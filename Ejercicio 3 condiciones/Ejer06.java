//Escribir un programa que determine si una persona puede votar ingresando su edad.//

import java.util.Scanner;

public class Ejer06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();        
        

        if (edad>=18) {
            System.out.println("Usted puede votar");
        }else {
            System.out.println("Usted no puede votar");
        }  
       
        scanner.close();       
        
    }
}
