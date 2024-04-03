//Calcular el área de un rectángulo//

import java.util.Scanner;
public class Ejer12{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el ancho del rectángulo: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese la altura del rectángulo: ");
        int numero2 = teclado.nextInt();

        int resultado = numero1*numero2;

        System.out.print("=>El área del rectángulo es: " + resultado);

}
}