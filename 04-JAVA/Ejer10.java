//División y resto//

import java.util.Scanner;
public class Ejer10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el divisor: ");
        int numero2 = teclado.nextInt();

        int cociente = numero1/numero2;
        int residuo = numero1-(numero2*cociente);

        System.out.print("=>El cociente de la división es: " + cociente); 
        System.out.print("  y el residuo es: " + residuo);         
        
    }

}
