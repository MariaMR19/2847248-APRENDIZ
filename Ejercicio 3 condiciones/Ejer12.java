//Escribir un programa que calcule el descuento aplicado a una compra ingresando el precio original y el//
//porcentaje de descuento, pero solo si el porcentaje de descuento es válido (entre 0 y 100).//


import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la compra:");
        int precio = scanner.nextInt();  

        System.out.println("Ingrese el porcentaje de descuento: entre 0 y 100 ");
        int porcentaje = scanner.nextInt();       


        if (porcentaje > 0 & porcentaje < 100) {
            int descuento=(precio*porcentaje)/100;
            System.out.println("El descuento aplicado en la compra es: " + descuento);
        }else {
            System.out.println("Los valores ingresados no permiten hallar el descuento");
        }  
       
        scanner.close();       
        
    }
}
