import java.util.Scanner;
    public class Ejer05{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese un número ");
            int n = teclado.nextInt();   

            int n1=0;
            int n2=1;
            System.out.print("La sucesión fibonaci es: ");
            
            for (int i=1; i<=n; i++){
                if (i==1){
                    System.out.print(n1);
                }else if(i==2){
                    System.out.print(","+n2);
                }else {
                    int nActual = n1+n2;
                    System.out.print("," +nActual);
                    
                    n1=n2;
                    n2=nActual;  
                }
                
            }     
                       

        }
    }
