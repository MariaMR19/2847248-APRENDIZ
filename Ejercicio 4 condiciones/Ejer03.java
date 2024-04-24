//Desarrolla un programa que solicite al usuario la longitud de los tres lados de un triángulo y
//clasifique el triángulo según sus características. El programa debe identificar si el triángulo es:
// Equilátero: Los tres lados tienen la misma longitud.
// Isósceles: Dos lados tienen la misma longitud.
// Escaleno: Los tres lados tienen longitudes diferentes.
// No es un triángulo: Si la suma de dos lados es menor o igual que el tercer lado, no se
//puede formar un triángulo.


import java.util.Scanner;

public class Ejer03{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese el primer lado del triángulo:  ");
        int a= scanner.nextInt();     
        
        System.out.print("Ingrese el segundo lado del triángulo:  ");
        int b= scanner.nextInt(); 

        System.out.print("Ingrese el tercer lado del triángulo:  ");
        int c= scanner.nextInt(); 
        
        if (a+b<=c || a+c<=b || b+c<=a) {   
            System.out.println("La medida de los lados no corresponden a las de un triángulo");         
        }else if (a==b & b==c) {
            System.out.println("La medida de los lados corresponden a un triángulo EQUILÁTERO");
        }else if (a==b | b==c | a==c) {
            System.out.println("La medida de los lados corresponden a un triángulo ISÓSCELES");
        }else {
            System.out.println("La medida de los lados corresponden a un triángulo ESCALENO");
        }
            
            
        
             

        
    }
}
