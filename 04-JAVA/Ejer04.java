//Intercambio de Variables sin auxiliar//

import java.util.Scanner;
public class Ejer04{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = teclado.nextInt();
       
        System.out.println("Números antes del intercambio: ");
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
             
        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;

        //Mostrar los números después del intercambio//

        System.out.println("Números después del intercambio: ");
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
    }

}
