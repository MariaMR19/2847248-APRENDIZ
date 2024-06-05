import java.util.Scanner;
    public class Ejer07{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.println("ingresar tres números enteros: ");
            System.out.print("Ingrese el primer número "); 
            int n1 = teclado.nextInt();   
            System.out.print("Ingrese el segundo número ");
            int n2 = teclado.nextInt();  
            System.out.print("Ingrese el tercer número ");
            int n3 = teclado.nextInt();  

            int mayor=n1;

            if (n2>mayor){
                mayor=n2;
            }
            if (n3>mayor){
                mayor=n3;
            }
            int i=mayor;

            while ((i%n1!=0) || (i%n2!=0)  || (i%n3!=0)){
                i++;
            }
            System.out.print("El MCM es: "+i);               
                           
           
            }                           

        }