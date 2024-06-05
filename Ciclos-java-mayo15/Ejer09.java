//Realizar una aplicación en JAVA que solicite ingresar al usuario un número entero y 
//muestre en pantalla si el numero es primo o no es primo. 

import java.util.Scanner;

public class Ejer09{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

       //Verificar si el número es primo

       int contador=0;
       for(int i=1; i<=numero; i++){
            if (numero%i==0){
            contador=contador+1;

            }
       }

       if(contador==2){
        System.out.println("Número ingresado Es Primo. ");
       }else{
        System.out.println("Número ingresado No es Primo. ");
       }
       
    }
}
