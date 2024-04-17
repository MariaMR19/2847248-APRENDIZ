//Escribir un programa que determine si una cadena ingresada por el usuario es un número par o impar//

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario ingresar un número como cadena
        System.out.print("Ingresa un número: ");
        String numeroStr = scanner.nextLine();
        
        // Convertir la cadena a un número entero
        try {
            int numero = Integer.parseInt(numeroStr);
            
            // Verificar si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si la cadena no es un número válido
            System.out.println("Error: Ingresa un número válido.");
        }
    }
}
