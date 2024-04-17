//Escribir un programa que determine si una persona es mayor de edad ingresando su fecha de nacimiento.//

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        System.out.print("Ingresa tu fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        
        // Convertir la fecha de nacimiento de String a LocalDate
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        // Calcular la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Calcular la edad
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
       
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
