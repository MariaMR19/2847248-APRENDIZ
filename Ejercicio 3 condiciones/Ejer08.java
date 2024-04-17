//Escribir un programa que calcule el área de un triángulo ingresando su base y altura, pero solo si ambos valores
//son positivos.//

import java.util.Scanner;

public class Ejer08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        int base = scanner.nextInt();  

        System.out.println("Ingrese la altura del triángulo:");
        int altura = scanner.nextInt();       


        if (base > 0 & altura > 0) {
            int area=(base*altura)/2;
            System.out.println("El área del triángulo es: " + area);
        }else {
            System.out.println("Los valores ingresados no permiten hallar el área");
        }  
       
        scanner.close();       
        
    }
}
