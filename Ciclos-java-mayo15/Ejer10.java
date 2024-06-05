//Realizar una aplicación en JAVA, que solicite al usuario ingresar un numero 
//entero denominado N, la aplicación debe calcular los NxN primeros números 
//primos e imprimirlos en pantalla en una cuadricula de N filas con N columnas. 

import java.util.Scanner;

public class Ejer10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        if(n>11){
            System.out.println("El número excede lo permitido.");
            return;
        }

      int num=2;
      int contador=0;

      while (contador<n*n) {
        int divisores=0;
        for(int i=2; i<=Math.sqrt(num);i++){
            if (num%i==0){
                divisores++;
                break;
            }
        }
        if(divisores==0){
            System.out.printf("[%03d]", num);
            contador++;
            if(contador%n==0){
                System.out.println();
            }
        }
        num++;
        
      }
       
    }
}
        