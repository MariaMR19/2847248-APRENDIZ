//8. Escribe un programa que cuente la cantidad de dígitos que tiene un número dado por el usuario
//(Máximo 6 dígitos).

import java.util.Scanner;

public class Ejer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero (maximo 6 digitos): ");
        int num = scanner.nextInt();

        if (num < 10) {
            System.out.print("El número ingresado es de 1 digito");
        }else if (num < 100) {
            System.out.print("El número ingresado es de 2 digitos");
        }else if (num < 1000) {
            System.out.print("El número ingresado es de 3 digitos");
        }else if (num < 10000) {
            System.out.print("El número ingresado es de 4 digitos");
        }else if (num < 100000) {
            System.out.print("El número ingresado es de 5 digitos");
        }else if (num < 1000000) {
            System.out.print("El número ingresado es de 6 digitos");
        }else{
            System.out.print("El número ingresado supera las 6 cifras");
        }

        
    }
}

