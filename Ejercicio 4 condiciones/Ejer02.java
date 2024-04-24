//Realice un programa que reciba dos números enteros, correspondiente al precio original de un
//producto y el precio final del producto, la aplicación debe mostrar en pantalla si al producto se le ha
//realizado algún descuento e indicar el % del descuento aplicado.


import java.util.Scanner;

public class Ejer02{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese el precio original del producto:  ");
        double precio1= scanner.nextDouble();     
        
        System.out.print("Ingrese el precio final del producto:  ");
        double precio2 = scanner.nextDouble(); 
        
        if (precio1<precio2) {
            double aumento=(precio2*100/precio1)-100;
            System.out.println("El precio original del producto tuvo un aumento del " + aumento);
        }else if (precio1>precio2) {
            double descuento=100-(precio2*100/precio1);
            System.out.println("El precio original del producto tuvo un descuento del " + descuento);            
        }else {
            System.out.print("El precio original y final del producto son iguales, no tuvo descuento ni aumento de precio"); 
        }    
            
        
             

        
    }
}
