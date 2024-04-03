//Indicar si el número es par o impar//

import java.util.Scanner;
public class Ejer02{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número de tres dígitos");
        int num = teclado.nextInt();      
        
        if (num%2== 1){
            System.out.print("=> El número ingresado es impar");
        }else{
            System.out.print("=> El número ingresado es par");
        }  
        
    }    
}