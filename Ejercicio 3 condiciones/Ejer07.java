//Escribir un programa que determine si un numero entero ingresado por el usuario es palíndromo.//

import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);       
       
                System.out.print("Ingresa un número entero: ");
                int number = scanner.nextInt();
                
                if (isPalindrome(number)) {
                    System.out.println(number + " es un palíndromo.");
                } else {
                    System.out.println(number + " no es un palíndromo.");
                }
            }
            
            public static boolean isPalindrome(int number) {
                String strNumber = String.valueOf(number);
                int left = 0;
                int right = strNumber.length() - 1;
                
                while (left < right) {
                    if (strNumber.charAt(left) != strNumber.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }
                return true;     
        
                  
        
    }
}
