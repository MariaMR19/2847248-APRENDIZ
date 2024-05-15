import java.util.Scanner;
    public class Ejer05{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese un número ");
            int n = teclado.nextInt();             
            
            int n1=0;
            int n2=1;
            for (int i=0; i<n; i++){
                System.out.print(n1+" ");
                int aux=n1;
                n1=n2;
                n2=aux+n2;        

            }     
                       

        }
    }
