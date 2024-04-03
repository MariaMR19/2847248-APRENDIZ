//Registro de empleados//

import java.util.Scanner;
public class Ejer19{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre:  ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = teclado.nextLine();

        System.out.print("Ingrese su salario:  ");
        String salario = teclado.nextLine();

        String datospersonales = nombre + edad + salario;

        System.out.print("=>La información completa es:  "  + datospersonales);
    }

}
