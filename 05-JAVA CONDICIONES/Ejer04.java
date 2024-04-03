//Tres números enteros, indicar mayor y menor//
import java.util.Scanner;
public class Ejer04{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = teclado.nextInt();

        if (a>= b & a>=c){

            System.out.println("El número: "+a + " Es el mayor");

        }

        if (b>= a & b>=c){

            System.out.println("El número: "+b + " Es el mayor");

        }

        if (c>= a & c>=b){

            System.out.println("El número: "+c + " Es el mayor");

        }
            //Numero menor

        if (a<= b & a<=c){

            System.out.println("El número: "+a + "Es el menor");

        }

        if (b<= a & b<=b){

            System.out.println("El número: "+b + "Es el menor");

        }

        if (c<= a & c<=b){

            System.out.println("El número: "+c + " Es el menor");         
        
        }
    }
}
