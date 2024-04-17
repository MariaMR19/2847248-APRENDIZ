//Escribir un programa que calcule el promedio de tres notas ingresadas por el usuario y muestre un mensaje//
//de aprobado si el promedio es mayor o igual a 7, y un mensaje de reprobado en caso contrario.//

import java.util.Scanner;

public class Ejer04{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.println("Ingrese la primera nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Ingrese la segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Ingrese la tercera nota:");
        double nota3 = scanner.nextDouble();        
       
        double promedio = (nota1 + nota2 + nota3) / 3;        
        
        if (promedio >= 7) {
            System.out.println("¡Aprobado! Su promedio es: " + promedio);
        } else {
            System.out.println(" ¡Reprobado! Su promedio es: " + promedio);
        }        
        
        scanner.close();
    }
}