//Orden ascendente de tres números//

import java.util.Scanner;
public class Ejer05{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = teclado.nextInt();

        if (a<b & b<c){
            System.out.print("=> Los tres números fueron ingresados en orden ascendente");
        }else{
            System.out.print("=> Los números fueron ingresados en desorden");
        }       
        
    }    
}
