//Conversión de moneda//

import java.util.Scanner;
public class Ejer17{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero en COP: ");
        float cop = teclado.nextFloat();

        float dolar = cop*26/100000;
        float euro = cop*24/100000;
        float yen = cop*39/1000;
        float libraesterlina = cop*21/100000;        

        System.out.print("=>El dinero ingresado en COP representa: " + dolar + " dólares " + euro + " euros " + yen + " yenes " + libraesterlina +" libras esterlinas ");
    }

}