//Escribir un programa que determine si un año ingresado por el usuario es bisiesto//

import java.util.Scanner;

public class Ejer05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año que desea:");
        int año = scanner.nextInt();  

        int bisiesto1=(2024-año);
        int bisiesto2=(2024+año);


        if (bisiesto1 % 4 == 0   |  bisiesto2 % 4 == 0) {
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }  
       
        scanner.close();       
        
    }
}
