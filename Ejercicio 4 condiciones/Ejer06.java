//Crea un programa que, dada una fecha (día, mes, año), determine qué día de la semana
//corresponde. Leer sobre la congruencia de Zeller.

import java.util.Scanner;

public class Ejer06{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese el dia  ");
        int q = scanner.nextInt();     
        
        System.out.print("Ingrese el mes  ");
        int m = scanner.nextInt(); 

        System.out.print("Ingrese el año  ");
        int Y = scanner.nextInt();  
        
        System.out.print("En que calendario desea ver el día 1. Gregoriano o 2. Juliano  ");
        int calendario = scanner.nextInt();  
        
        if (calendario==1) {
            int gregoriano=(q+((13*(m+1)/5))+Y+(Y/4)-(Y/100)+(Y/400))%7;

            System.out.println("El día de la semana que corresponde es: "+ gregoriano);
            if (gregoriano==0) {
                System.out.println("El día es SÁBADO");
            }else if (gregoriano==1){
                System.out.println("El día es DOMINGO");
            }else if (gregoriano==2) {
                System.out.println("El día es LUNES");
            }else if (gregoriano==3){
                System.out.println("El día es MARTES");
            }else if (gregoriano==4){
                System.out.println("El día es MIÉRCOLES");
            }else if (gregoriano==5){
                System.out.println("El día es JUEVES");
            }else if (gregoriano==6){
                System.out.println("El día es VIERNES");
            }
           

        }else if (calendario==2) {
            int juliano=(q+((13*(m+1)/5))+Y+(Y/4)+5)%7;

            System.out.println("El día de la semana que corresponde es: "+ juliano);
            if (juliano==0) {
                System.out.println("El día es SÁBADO");
            }else if (juliano==1){
                System.out.println("El día es DOMINGO");
            }else if (juliano==2) {
                System.out.println("El día es LUNES");
            }else if (juliano==3){
                System.out.println("El día es MARTES");
            }else if (juliano==4){
                System.out.println("El día es MIÉRCOLES");
            }else if (juliano==5){
                System.out.println("El día es JUEVES");
            }else if (juliano==6){
                System.out.println("El día es VIERNES");
            }
        }
       

       
       



       

        
    }
}



