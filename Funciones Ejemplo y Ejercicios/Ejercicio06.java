//Máximo de tres números: Crea una función que tome tres números y retorne el valor máximo entre ellos.

public class Ejercicio06{
    public static void main(String[] args ){
       
        
        System.out.println("Valor 1: " + mayor(10,5, 20));
        System.out.println("Valor 2: " + mayor(20,5, 3));
        System.out.println("Valor 3: " + mayor(30,5, 12));
        System.out.println("Valor 4: " + mayor(40,5, 50));
        System.out.println("Valor 5: " + mayor(50,5, 100));

    }
    //funcion con salida
    public static int mayor(int num1, int num2, int num3){
        int mayor=0;
        if(num1>num2 && num1>num3){
            mayor=num1;
        }
        
        if(num2>num1 && num2>num3){
            mayor=num2;
        }
        
        if(num3>num1 && num3>num2){
            mayor=num3;
        }


        
        return mayor;
    }

}
