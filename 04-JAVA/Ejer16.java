//Interés compuesto//
import java.util.Scanner;
public class Ejer16{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = teclado.nextDouble();

        System.out.print("Ingrese el interés anual o mensual en porcentaje: ");
        double interes = teclado.nextDouble() / 100;

        System.out.print("Ingrese el tiempo a invertir en años o meses: ");
        int tiempo = teclado.nextInt();        
        
        double montofinal = capitalInicial *Math.pow(1+interes, tiempo);

        System.out.print("=>El monto final después del tiempo elegido es: " + montofinal);
    }

}
