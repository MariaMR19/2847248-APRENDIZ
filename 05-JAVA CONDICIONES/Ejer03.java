//Cuadrantes plano cartesiano//

import java.util.Scanner;
public class Ejer03{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero correspondiente a la coordena x ");
        byte abscisa = teclado.nextByte();

        System.out.print("Ingrese un número entero correspondiente a la coordena y ");
        byte ordenada = teclado.nextByte();

        if (abscisa>0 & ordenada>0){
            System.out.print("=>El punto se encuentra en el I cuadrante ");
        }else if (abscisa<0 & ordenada>0){
            System.out.print("=>El punto se encuentra en el II cuadrante ");
        }else if (abscisa<0 & ordenada<0){
            System.out.print("=>El punto se encuentra en el III cuadrante ");
        }else if (abscisa>0 & ordenada<0){
            System.out.print("=>El punto se encuentra en el IV cuadrante ");
        }else{
            System.out.print("=>El punto es cuadrantal");
        }
        
    }    
}

