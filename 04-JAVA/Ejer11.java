//Cálculo del perímetro y el área de un círculo//

import java.util.Scanner;
public class Ejer11{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        float numero1 = teclado.nextFloat();        

        float perimetro = 2 * 314 * numero1 /100;
        float area = 314 * numero1 * numero1 /100;

        System.out.print("=>El perímetro del círculo es: " + perimetro + "  y el área es: " + area);
    }

}
