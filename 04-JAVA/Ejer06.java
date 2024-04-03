//Cálculo del promedio//

import java.util.Scanner;
public class Ejer06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = teclado.nextInt();

        System.out.print("Ingrese el cuarto número: ");
        int numero4 = teclado.nextInt();

        System.out.print("Ingrese el quinto número: ");
        int numero5 = teclado.nextInt();

        int resultado = (numero1+numero2+numero3+numero4+numero5)/5;

        System.out.print("=>El promedio de los cinco números es: " + resultado);
    }

}