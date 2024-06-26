//Potencia: Escribe una función que tome dos números como entrada y calcule el primero elevado a la 
//potencia del segundo

public class Ejercicio05{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + potencia(10,5));
        System.out.println("Valor 2: " + potencia(2,5));
        System.out.println("Valor 3: " + potencia(3,5));
        System.out.println("Valor 4: " + potencia(4,5));
        System.out.println("Valor 5: " + potencia(5,5));

    }
    //funcion con salida
    public static double potencia(int num1, int num2){
        double respuesta = Math.pow(num1, num2);
        return respuesta;
    }

}
