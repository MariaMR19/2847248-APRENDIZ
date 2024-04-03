//Cálculo del área de un triángulo//

import java.util.Scanner;
public class Ejer05{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);       
        

        System.out.print("Ingrese la base: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese la altura: ");
        int numero2 = teclado.nextInt();

        int resultado = (numero1*numero2)/2;

        System.out.print("=>El área del triángulo es: " + resultado);
    }

}
