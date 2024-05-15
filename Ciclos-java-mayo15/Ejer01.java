import java.util.Scanner;
    public class Ejer01{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese la cantidad de Notas ");
            int cantidad = teclado.nextInt();

            double sumatoria = 0 ;         

            for( int i=0; i<cantidad; i++){
                
                System.out.print("Digite la nota "+(i+1)+" = ");
                double nota = teclado.nextDouble();

                sumatoria += nota;
            }
            double promedio = sumatoria / cantidad;
            System.out.println(("El promedio es: "+promedio));

        }
    }