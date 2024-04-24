//Crea un programa que calcule el precio final de un producto después de aplicar un descuento. Se
//debe solicitar al usuario dos números enteros (Precio del producto y tasa de descuento).//

import java.util.Scanner;

public class Ejer01{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese el precio del producto");
        double precio = scanner.nextDouble();  

        System.out.print("Ingrese la tasa de descuento de 1 a 100");
        double porcentaje = scanner.nextDouble(); 
        
        double descuento=(precio*porcentaje)/100;
        double precio_final=precio-descuento;

        System.out.print("El precio final del producto es: " + precio_final);


       
        
    }
}