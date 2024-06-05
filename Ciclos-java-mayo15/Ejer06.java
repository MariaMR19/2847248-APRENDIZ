import java.util.Scanner;
    public class Ejer06{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingresar la posicion del n-ésimo Fibonacci: ");
            int n = teclado.nextInt();   

            int n1=0;
            int n2=1;
            System.out.print("> El n-ésimo número Fibonacci es: ");
            
            for (int i=3; i<=n; i++){
                
                    int nActual = n1+n2;
                    
                    
                    n1=n2;
                    n2=nActual;  
                }
                System.out.print(+n2); 
            }     
                       

        }
    