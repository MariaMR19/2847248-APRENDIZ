//Ingresar un número (máximo 10 dígitos e inferior a los dos mil millones//
//Después mostrar en pantalla el el número con formato de moneda//

import java.text.NumberFormat;
import java.util.Locale;

import java.util.Scanner;
public class Ejer07{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número de diez dígitos:  ");
        long numero = teclado.nextLong();
        
        if (numero >= 0 && numero < 2000000000) {
            
            NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);
            String numeroFormateado = formatoMoneda.format(numero);

            System.out.println("FORMATO DE MONEDA: " + numeroFormateado);
        } else {
            System.out.println("El número ingresado no está dentro del rango permitido.");
        }
        
    }    
}