import java.util.Scanner;
public class Ejer01{
    public static void main(String[] args) {
       //1. Crear la variable de entrada
        Scanner teclado = new Scanner(System.in);

      //2. Solicitar el número al usuario
        System.out.println("Ingresar tamaño del arreglo:");
        int n = teclado.nextInt();

         //3. Crear el arreglo
        int[] arreglo = new int[n];

         //4. Llenar el arreglo con números aleatorios impares

        int contador=0;
        while (contador<arreglo.length){
             //4.1 Generar un número impar
             int aleatorio = ((int) (Math.random()*99))+1;
             if (aleatorio%2==1){
                //4.2 Validar que el número impar no se repita
                boolean valido = true;
                for(int i=0; i<arreglo.length; i++){
                    if(aleatorio==arreglo[i]){
                        valido=false;
                    }
                }
                //4.3 Introducir el número en el arreglo
                if(valido==true){
                    arreglo[contador]=aleatorio;
                    contador++;
                }
             }            
        }
        //5. Imprimir el arreglo
        System.out.println("Arreglo de números impares:");
        for (int i=0; i<arreglo.length; i++ ) {
            System.out.print(arreglo[i] + " ");
        }      
        
    }
}
