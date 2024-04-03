//Conversión de unidades de longitud//

import java.util.Scanner;
public class Ejer15{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la longitud en metros a la cual desea hacer la conversión: ");
        float metros = teclado.nextFloat();        

        float centimetros = metros * 100;
        float pulgadas = metros * 393701/10000;
        float pies = metros * 328084/100000;

        System.out.print(+ metros + " metros = " + centimetros + " centímetros " + pulgadas + " pulgadas " + pies +" pies " );
    }

}
