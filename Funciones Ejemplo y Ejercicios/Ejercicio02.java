//Resta de dos números: Crea una función que acepte dos números y retorne su resta

public class Ejercicio02{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + resta(10,5));
        System.out.println("Valor 2: " + resta(20,5));
        System.out.println("Valor 3: " + resta(30,5));
        System.out.println("Valor 4: " + resta(40,5));
        System.out.println("Valor 5: " + resta(50,5));

    }
    //funcion con salida
    public static int resta(int num1, int num2){
        int respuesta = num1-num2;
        return respuesta;
    }

}
