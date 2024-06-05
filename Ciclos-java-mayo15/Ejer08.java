//Realizar una aplicación en JAVA que solicite ingresar al usuario un número máximo de 6 dígitos, 
//posteriormente muestre en pantalla los dígitos separados con saltos de línea (El recorrido debe 
//realizarlo de izquierda a Derecha). 


import java.util.Scanner;
    public class Ejer08{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("-->Ingresar un número: ");
            int num = teclado.nextInt();

           //Algoritmo para invertir el número

           int invertido=0;
           while (num>0) {
                int digito=num%10;
                int resto=num/10;
                 num=resto;

                invertido=(invertido*10)+digito;
           }         

           //Algoritmo para extraer dígitos
           int i=1;
           while (invertido>0) {
            int digito=invertido%10;
            int resto=invertido/10;
            invertido=resto;

            System.out.println("El dígito "+i+" es: "+digito);
            i++;
            }
        }
    }

