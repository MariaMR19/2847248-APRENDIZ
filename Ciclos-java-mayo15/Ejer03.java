import java.util.Scanner;
    public class Ejer03{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("Ingrese la altura de la pirámide ");
            int numero = teclado.nextInt();    
            
            
           for (int i=1; i<=numero; i++){
                for (int p=1; p<=numero-i; p++){                    
                    System.out.print(" ");         
                   
                }
                for (int q=1; q<=(2*i-1); q++){
                    
                    System.out.print("X");

                }
                System.out.println();
                
           }
          
            

        }
    }
