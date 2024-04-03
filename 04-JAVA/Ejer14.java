//Cálculo del promedio ponderado//

import java.util.Scanner;
public class Ejer14{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la primera  nota: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Ingrese la segunda  nota: ");
        float nota2 = teclado.nextFloat();

        System.out.print("Ingrese la tercera  nota: ");
        float nota3 = teclado.nextFloat();

        System.out.print("Ingrese los créditos de la  primera nota : ");
        
        float cred1 = teclado.nextFloat();

        System.out.print("Ingrese los créditos de la  segunda nota : ");
        float cred2 = teclado.nextFloat();

        System.out.print("Ingrese los créditos de la  tercera nota : ");
        float cred3 = teclado.nextFloat();

        float resultado = (nota1*cred1 + nota2*cred2 + nota3*cred3)/(cred1 + cred2 + cred3);

        System.out.print("=>Su promedio ponderado es: " + resultado);
    }

}
