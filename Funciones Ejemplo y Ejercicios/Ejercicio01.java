//Suma de dos números: Escribe una función que tome dos números como parámetros y devuelva su suma

public class Ejercicio01{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + suma(10,5));
        System.out.println("Valor 2: " + suma(20,5));
        System.out.println("Valor 3: " + suma(30,5));
        System.out.println("Valor 4: " + suma(40,5));
        System.out.println("Valor 5: " + suma(50,5));

    }
    //funcion con salida
    public static int suma(int num1, int num2){
        int respuesta = num1+num2;
        return respuesta;
    }

}
   