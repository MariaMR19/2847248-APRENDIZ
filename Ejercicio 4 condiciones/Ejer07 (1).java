//7. Escribe un programa que calcule el monto final de una inversión después de cierto período de
//tiempo (Año o Meses), considerando una tasa de interés compuesto (Anual) y la frecuencia de
//capitalización (Anual o Mensual).

import java.util.Scanner;
public class Ejer07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor inicial de su inversion: ");
        double valor = scanner.nextDouble();

        System.out.print("Ingrese el periodo de tiempo de su inversion (meses): ");
        double tiempo = scanner.nextDouble();

        double anual = tiempo / 12;

        System.out.print("Ingrese la tasa de interes (anual): ");
        double interes = scanner.nextDouble();

        double tasa = interes / 100;

        
        double capital = valor * Math.pow((1 + tasa), anual);
        double interestotal = capital - valor;

        if (anual > 0) {
            System.out.println("Capitalizacion anual por el periodo  especifico de " + anual + " años: " + interestotal);
            System.out.println("Monto final de la inversion: " + capital);
        }

              
    }
