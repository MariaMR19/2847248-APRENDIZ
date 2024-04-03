//Saludar al usuario y preguntar su edad//

import java.util.Scanner;
public class Ejer01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Bienvenido a esta plataforma, por favor ingrese su edad");
        byte edad = teclado.nextByte();

        if (edad<18){
            System.out.print("=> Usted recibirá una auxilio de $800000");
        }else{
            System.out.print("=> Usted debe pagar un impuesto $200000");
        }       
        
    }    
}