//Realizar una aplicación en JAVA, que solicite al usuario ingresar un numero 
//entero denominado N, la aplicación debe calcular los NxN primeros números 
//primos e imprimirlos en pantalla en una cuadricula de N filas con N columnas. 


    import java.util.Scanner;

    public class Ejer10{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número entero para N: ");
            int n = scanner.nextInt();
    
            int contador = 0;
            int numero = 2;
    
            System.out.println("Los " + n*n + " primeros números primos son:");
            while (contador < n*n) {
                if (esPrimo(numero)) {
                    System.out.print(numero + " ");
                    contador++;
                }
                numero++;
            }
    
            scanner.close();
        }
    
        // Método para verificar si un número es primo
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }