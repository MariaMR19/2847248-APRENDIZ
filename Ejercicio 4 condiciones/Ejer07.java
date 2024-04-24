//Escribe un programa que calcule el monto final de una inversión después de cierto período de
//tiempo (Año o Meses), considerando una tasa de interés compuesto (Anual) y la frecuencia de
//capitalización (Anual o Mensual).


import java.util.Scanner;

public class Ejer07{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese el capital a invertir  ");
        int c= scanner.nextInt();     
        
        System.out.print("Ingrese la tasa de interés (0-1)  ");
        int i = scanner.nextInt(); 

        System.out.print("La tasa de interés es 1. anual o 2. mensual  ");
        int periodo= scanner.nextInt();       
        
                        
        if (periodo==1) {
            System.out.println("Ingrese a cuántos años desea hacer la inversión");
            int t=scanner.nextInt(); 

            int montoFinal= c Math.pow(1+i, t);
            System.out.println("El monto final de la inversión es: " +montoFinal);               

           
        }else if (periodo==2){
            System.out.println("Ingrese a cuántos meses desea hacer la inversión");
            int t=scanner.nextInt(); 

            int montoFinal= c Math.pow(1+i, t);
            System.out.println("El monto final de la inversión es: " +montoFinal);               

        }
       

       
       



       

        
    }
}




