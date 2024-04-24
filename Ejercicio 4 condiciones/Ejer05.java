//Implementa un juego simple de piedra, papel o tijeras en el que el usuario pueda elegir su opción y
//el programa elija aleatoriamente la suya, luego muestra quién ganó o si fue un empate.
//Para generar un numero aleatorio entre 0 y N, se puede usar:
//int aleatorio = (int) (Math.random() * N);

import java.util.Scanner;

public class Ejer05{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese su opción 0. piedra, 1. papel o 2. tijera:  ");
        int opcion= scanner.nextInt();     
        
        System.out.print("El programa elige su opcion:  ");
        int aleatorio= (int) (Math.random()*2); 

        // PIEDRA
        if ( opcion==0 ){
            if (aleatorio==0){
                System.out.println("Hubo empate de piedra");
            }else if (aleatorio ==1){
                System.out.println("Perdí con papel");
            }else if (aleatorio==2){
                System.out.println("Gané con tijera");
            }   

        }

        // PAPEL
        if (opcion==1){
            if (aleatorio==0){
                System.out.println("Gané con piedra");
            }else if (aleatorio ==1){
                System.out.println("Hubo empate de papel");
            }else if (aleatorio==2){
                System.out.println("Perdí con tijera");
            }   
        }
        
        //TIJERA
        if (opcion==2){
            if (aleatorio==0){
                System.out.println("Perdí con piedra");
            }else if (aleatorio ==1){
                System.out.println("Gané con de papel");
            }else if (aleatorio==2){
                System.out.println("Hubo empate con tijera");
            }   

         }
     
        
             

        
    }
}

