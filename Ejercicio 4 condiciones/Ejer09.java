//9.Escribe un programa que solicite al usuario ingresar un numero entero máximo de 6 dígitos, la
//aplicación debe mover todos los dígitos de izquierda a derecha. En el caso del ultimo digito, se
//debe ubicar de primero.

import java.util.Scanner;

public class Ejer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero (maximo 6 digitos): ");
        int n = scanner.nextInt();

        int digito = n%10;
        int resto = n/10;

        if (n > 0 && n < 10) {
            System.out.println(n);
        }else if (n >= 1000000) {
            System.out.println("Usted ha ingresado un numero mayor a 6 digitos");
        }else if (n < 0) {
            System.out.println("Usted ha ingresado un numero negativo, debe ingresar un entero positivo");
        }else{
            System.out.print(+ digito);
            System.out.print(+ resto);
        }

       
        
       scanner.close();
    }
}

