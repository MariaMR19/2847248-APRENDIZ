import java.util.Scanner;
    public class Ejer01{
        public static void main(String[] args){
            try (Scanner scanner=new Scanner(System.in)){
                System.out.print("Ingrese un número entre 1 y 6: ");
                int num = scanner.nextInt(); 
    
                int numAleatorio=0;
                for(int i=0; i<num; i++){
                    int aleatorio =(int)(Math.random()*10);
                    numAleatorio = (numAleatorio*10)+aleatorio ;
                }
                System.out.println("El número construido es: "+numAleatorio);
                System.out.println("Resultado producto: "+numAleatorio*2);

            
            }
        }
    }

           