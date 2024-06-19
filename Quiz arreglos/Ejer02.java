import java.util.Scanner;
public class Ejer02{
    public static void main(String[] args) {

        //1. Variable de entrada de datos        
        Scanner teclado = new Scanner(System.in);      

        //2. Solicitar el número al usuario
        System.out.println("Ingresar tamaño del arreglo:");
        int n = teclado.nextInt();

        //3. Crear el arreglo
        int[] arreglo=new int[n];

        //4. llenar el arreglo
        
        for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = ((int) (Math.random()*9999)) +1;
            arreglo[i]=aleatorio;
        }

        //5. Imprimir el arreglo
        for (int i=0; i<arreglo.length; i++) {

            System.out.print(arreglo[i]+ " ");
        }
        //6. Solicitar un número al usuario
        System.out.print("\nIngresar un número:");
        int m = teclado.nextInt();

        //7. Buscar el número dentro del arreglo
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == m) {
                 encontrado=true;
                System.out.println("El número " + m + " se encuentra en la posición " + i + " del arreglo.");               
            }
        }
        //8. Imprimir mensaje en caso de no encontrar el número
        
        if (encontrado==false) {
            
            System.out.println("El número no está en el arreglo ");
        }
        

    }
}