//Cálculo del IMC//

import java.util.Scanner;
public class Ejer18{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        float peso = teclado.nextFloat();

        System.out.print("Ingrese su estatura en metros: ");
        float estatura = teclado.nextFloat();

        float imc = peso/(estatura*estatura);

        System.out.print("=>Su índice de masa corporal es: " + imc);
    }

}