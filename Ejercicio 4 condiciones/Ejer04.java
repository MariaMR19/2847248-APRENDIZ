//Haz un programa que calcule el Índice de Masa Corporal (IMC) de una persona utilizando su peso
//y altura, y luego clasifique el resultado en una categoría (bajo peso, peso normal, sobrepeso, etc.).


import java.util.Scanner;

public class Ejer04{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
       
        System.out.print("Ingrese su peso en kg:  ");
        float peso= scanner.nextFloat();     
        
        System.out.print("Ingrese su estatura en metros:  ");
        float estatura= scanner.nextFloat(); 

        float imc=peso/(estatura*estatura);
        
        if (imc<18.5) {   
            System.out.println("Su categoría es BAJO PESO");         
        }else if (imc>=18.5 & imc<25) {
            System.out.println("Su categoría es NORMAL");
        }else if (imc>=25 & imc<30) {
            System.out.println("Su categoría es SOBRE PESO");
        }else if (imc>=30 & imc<35) {
            System.out.println("Su categoría es OBESIDAD I");
        }else if (imc>=35 & imc<40) {
            System.out.println("Su categoría es OBESIDAD II");
        }else if (imc>=40 & imc<50) {
            System.out.println("Su categoría es OBESIDAD III");
        }else if (imc>=50) {
            System.out.println("Su categoría es OBESIDAD IV");
        }     
            
        
             

        
    }
}
