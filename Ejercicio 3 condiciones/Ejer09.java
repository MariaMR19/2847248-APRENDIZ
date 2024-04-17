//Escribir un programa que calcule el salario semanal de un empleado ingresando las horas trabajadas y la tarifa
//por hora. Si el empleado trabajó más de 40 horas, se le pagará un 50% extra por las horas extras.//

import java.util.Scanner;

public class Ejer09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas en la semana:");
        int horas = scanner.nextInt();  

        System.out.println("Ingrese el valor de la hora trabajada:");
        int precio = scanner.nextInt(); 
        
        int sueldo=horas*precio;
        int extra=sueldo*50/100;
        int sueldofinal=sueldo+extra;


        if (horas>40) {            
            System.out.println("El empleado ganó por la semana de trabajo: "+ sueldofinal);
        }else {
            System.out.println("El empleado ganó por la semana de trabajo: "+ sueldo);
        }  
       
        scanner.close();       
        
    }
}