//Realizar una aplicación en JAVA que solicite ingresar al usuario un número entero y 
//muestre en pantalla si el numero es primo o no es primo. 

import java.util.Scanner;
    public class Ejer09{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese un número entero ");
            int numero = teclado.nextInt();               

             // Verificar si el número es primo
            
             for(int i>=1; i<=numero; i++){
                int contador=0;
                if (num%i==0){
                    contador=contador+i;
                }
                if(contador==2){
                    System.out.println(" Numero ingresado Es Primo. ");
                }else{
                    System.out.println(" Numero ingresado No Es Primo. ");
                }

             }
    }
}
