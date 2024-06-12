//Realizar una aplicación en Java que solicite al usuario un numero, cree un arreglo del tamaño del numero indicado, lo llene 
//con números impares en cada posición y después lo muestre en pantalla.

import java.util.Scanner;
public class Ejer01{
    public static void main(String[] args){
        
        Scanner entrada=new Scanner (System.in);

        System.out.println("Ingrese un numero entero: ");
        int tamano=entrada.nextInt();                                 
        
        int numeros[]=new int [tamano];

        for (int i=0; i<numeros.length; i++){
            int temp=(int)(Math.random()*1000);
            if (temp%2==0){
                numeros[i]=temp-1;
            }else{
                numeros[i]=temp;
            }
            System.out.println("El número impar es: " +numeros[i]);
        }
       
    }
}