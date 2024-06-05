//Realizar una aplicación en JAVA que solicite ingresar al usuario un número máximo de 6 dígitos, 
//posteriormente muestre en pantalla los dígitos separados con saltos de línea (El recorrido debe 
//realizarlo de izquierda a Derecha). 


import java.util.Scanner;
    public class Ejer08{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            System.out.print("-->Ingresar un número: ");
            int num = teclado.nextInt();

            //--> Ingresar un numero: 654321 
            //-> El digito 01 es: 6  
            //-> El digito 02 es: 5  
            //-> El digito 03 es: 4  
            //-> El digito 04 es: 3  
            //-> El digito 05 es: 2  
            //-> El digito 06 es: 1 

            int digito1=(num/100000)%10 ;  
            int digito2=(num/10000)%10 ;
            int digito3=(num/1000)%10 ;
            int digito4=(num/100)%10 ;
            int digito5=(num/10)%10 ;
            int digito6=num%10 ;
            
            if (num<10) {
                int digito6=num%10;
            } else if(num>=10 & num<100){
                int digito5=(num/10)%10;
            }else if(num>=100 & num<1000){
                int digito4=(num/100)%10 ;
            }else if(num>=1000 & num<10000){
                int digito3=(num/1000)%10 ;
            }else if(num>=10000 & num<100000){
                int digito2=(num/10000)%10 ;
            }else if(num>=100000 & num<1000000){
                int digito1=(num/100000)%10 ; 
            }else{
                System.out.print("-->El número ingresado es cero o supera las 6 cifras ");
            }

            // Mostrar cada dígito en una línea separada
            for( int i=1; i<7; i++){
                System.out.println("-->El número dígito ",+i, " es:",+digito6 );
            }                 
        

        }
    }

