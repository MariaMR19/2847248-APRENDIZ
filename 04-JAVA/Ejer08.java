//Concatenación de cadenas//

import java.util.Scanner;
public class Ejer08{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer texto: ");
        String texto1 = teclado.nextLine();

        System.out.print("  Ingrese el segundo texto: ");
        String texto2 = teclado.nextLine();

        String texto3 = texto1 + texto2;

        System.out.print("=>El texto completo es:  "  + texto3 );
    }

}
