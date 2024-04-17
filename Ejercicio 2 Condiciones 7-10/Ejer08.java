//Ingresar un número máximo 9 dígitos y se muestre en pantalla//
//el número representado en palabras//

import java.util.Scanner;

public class Ejer08 {
    // Arreglos para las palabras en español
    private static final String[] UNIDADES = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private static final String[] DECENAS = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static final String[] ESPECIALES = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número (máximo 9 dígitos):");
        int numero = scanner.nextInt();

        // Verificar si el número está dentro del rango permitido
        if (numero >= 0 && numero <= 999999999) {
            // Convertir el número a palabras
            String numeroEnPalabras = convertirNumeroEnPalabras(numero);
            System.out.println("Número en palabras: " + numeroEnPalabras);
        } else {
            System.out.println("El número ingresado no está dentro del rango permitido.");
        }
    }

    private static String convertirNumeroEnPalabras(int numero) {
        if (numero == 0) {
            return "cero";
        }

        String palabras = "";

        // Millones
        if (numero >= 1000000) {
            palabras += convertirNumeroEnPalabras(numero / 1000000) + " millones ";
            numero %= 1000000;
        }

        // Miles
        if (numero >= 1000) {
            palabras += convertirNumeroEnPalabras(numero / 1000) + " mil ";
            numero %= 1000;
        }

        // Centenas
        if (numero >= 100) {
            palabras += UNIDADES[numero / 100] + " cientos ";
            numero %= 100;
        }

        // Decenas y unidades
        if (numero >= 10) {
            if (numero < 20) {
                palabras += ESPECIALES[numero % 10];
                numero = 0;
            } else {
                palabras += DECENAS[numero / 10];
                numero %= 10;
            }
            if (numero > 0) {
                palabras += " y ";
            }
        }

        // Unidades
        if (numero > 0) {
            palabras += UNIDADES[numero];
        }

        return palabras;
    }
}