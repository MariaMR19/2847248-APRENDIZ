//Cálculo de descuento//
import java.util.Scanner;
public class Ejer07{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        float numero1 = teclado.nextFloat();

        System.out.print("Ingrese el porcentaje de descuento (en número decimal): ");
        float numero2 = teclado.nextFloat();

        float resultado = numero1 - (numero1*numero2);

        System.out.print("=>El precio final del producto es: " + resultado);
    }

}