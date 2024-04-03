//Suma de dos números//

import java.util.Scanner;
public class Ejer01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        int resultado = numero1+numero2;

        System.out.print("=>La suma de los dos números es: " + numero1 + "+" + numero2 + "=" + resultado);
    }

}