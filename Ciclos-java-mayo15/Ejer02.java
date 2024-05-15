import java.util.Scanner;
    public class Ejer02{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese la cantidad de Materias ");
            int materias = teclado.nextInt();

            double sumatoria = 0 ; 
            double total_creditos = 0 ;        

            for( int i=0; i<materias; i++){
                
                System.out.print("Digite la nota de materia "+(i+1)+" = ");
                double nota = teclado.nextDouble();

                System.out.print("Digite el crédito materia "+(i+1)+" = ");
                double creditos = teclado.nextDouble();

                sumatoria += (nota*creditos);
                total_creditos += creditos;
            }
            double promedio = sumatoria / total_creditos;
            System.out.println("Total de créditos: "+total_creditos);
            System.out.println(("El promedio ponderado es: "+promedio));

        }
    }
    

