//Multiplicación de dos números: Implementa una función que reciba dos números, los multiplique y 
//devuelva el resultado.

public class Ejercicio03{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + producto(10,5));
        System.out.println("Valor 2: " + producto(20,5));
        System.out.println("Valor 3: " + producto(30,5));;
        System.out.println("Valor 4: " + producto(40,5));
        System.out.println("Valor 5: " + producto(50,5));

    }
    //funcion con salida
    public static int producto(int num1, int num2){
        int respuesta = num1*num2;
        return respuesta;
    }

}
