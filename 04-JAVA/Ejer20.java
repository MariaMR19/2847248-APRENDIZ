//Suma de dígitos//

import java.util.Scanner;
public class Ejer20{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número de cinco cifras: ");
        int num = teclado.nextInt();
        int d_uno = num%10;
        int d_dos = (num/10)%10;
        int d_tres = (num/100)%10;
        int d_cuatro = (num/1000)%10;
        int d_cinco = (num/10000)%10;
        int suma = d_uno+d_dos+d_tres+d_cuatro+d_cinco;

        System.out.print("La suma de los cinco dígitos es:  " + suma);
        
            
        }     

        
    }


