//División de dos números: Crea una función que reciba dos números, los divida y retorne el cociente

public class Ejercicio04{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + division(10,5));
        System.out.println("Valor 2: " + division(20,5));
        System.out.println("Valor 3: " + division(30,5));
        System.out.println("Valor 4: " + division(40,5));
        System.out.println("Valor 5: " + division(50,5));

    }
    //funcion con salida
    public static int division(int num1, int num2){
        int respuesta = num1/num2;
        return respuesta;
    }

}