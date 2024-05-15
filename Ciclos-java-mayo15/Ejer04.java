import java.util.Scanner;
    public class Ejer04{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int opcion=0;          

            
            while (opcion != 3) {
                System.out.println("El siguiente menú tiene 3 opciones digite cual desea  ");
                System.out.println("1. Docente");
                System.out.println("2. Estudiante");
                System.out.println("3. Salir");
                opcion=teclado.nextInt();

                if (opcion==1){
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
                if (opcion==2){
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

            System.out.println("Usted ha salido del menú ");

        }
    }
