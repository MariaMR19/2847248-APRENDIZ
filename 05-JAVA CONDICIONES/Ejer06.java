//Con un número de 6 dígitos, con un menú mostrar el dígito deseado//

import java.util.Scanner;
public class Ejer06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número de cinco dígitos:  ");
        int num = teclado.nextInt();

        System.out.print("Menú");

        System.out.print("  1. Primer dígito");
        
        System.out.print("  2. Segundo dígito");
        
        System.out.print("  3. Tercer dígito");
        
        System.out.print("  4. Cuarto dígito");
        
        System.out.print("  5. Quinto dígito");
        
        System.out.print("  6. Sexto dígito");
        

        int d_uno = num%10;
        int d_dos = (num/10)%10;
        int d_tres = (num/100)%10;
        int d_cuatro = (num/1000)%10;
        int d_cinco = (num/10000)%10;
        int d_seis = (num/100000)%10;


        System.out.println("Ingrese una opción");
        int opcion = teclado.nextInt();          

        if (opcion==1){
            System.out.print("=> El primer dígito es: " +d_uno);
        }
        if (opcion==2){
            System.out.print("=> El segundo dígito es: " +d_dos);
        } 
        if (opcion==3){
            System.out.print("=> El tercer dígito es: " +d_tres);
        }   
        if (opcion==4){
            System.out.print("=> El cuarto dígito es: " +d_cuatro);
        }
        if (opcion==5){
            System.out.print("=> El quinto dígito es: " +d_cinco);
        }
        if (opcion==6){
            System.out.print("=> El sexto dígito es: " +d_seis);
        }
        
    }    
}
