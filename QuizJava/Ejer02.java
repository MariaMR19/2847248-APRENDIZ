//Calculo de Promedio de Notas, se debe solicitar al usuario ingresar la cantidad de 
// créditos y la nota obtenida en las siguientes asignaturas: matemáticas, español, inglés, 
// //ciencias naturales y deportes.
//  La aplicación debe mostrar en pantalla el Promedio Ponderado de las notas 
// obtenidas por el estudiante. 
//  En el caso de que el promedio de notas sea inferior a 3, se debe indicar en 
// pantalla la nota que debió obtener en la asignatura con menor nota para 
// alcanzar el promedio de 3.

import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese los créditos de matemáticas:  ");
        float cre_m = teclado.nextFloat();
        System.out.print("Ingrese nota matemáticas:  ");
        float nota_m = teclado.nextFloat();

        System.out.print("Ingrese los créditos de español:  ");
        float cre_e = teclado.nextFloat();
        System.out.print("Ingrese nota español:  ");
        float nota_e = teclado.nextFloat();

        System.out.print("Ingrese los créditos de inglés:  ");
        float cre_i = teclado.nextFloat();
        System.out.print("Ingrese nota inglés:  ");
        float nota_i = teclado.nextFloat();

        System.out.print("Ingrese los créditos de ciencias naturales:  ");
        float cre_cn = teclado.nextFloat();
        System.out.print("Ingrese nota ciencias naturales:  ");
        float nota_cn = teclado.nextFloat();

        System.out.print("Ingrese los créditos de deportes:  ");
        float cre_d = teclado.nextFloat();
        System.out.print("Ingrese nota deportes:  ");
        float nota_d = teclado.nextFloat();                   
               
        float pp=((nota_m*cre_m)+(nota_e*cre_e)+(nota_i*cre_i)+(nota_cn*cre_cn)+(nota_d*cre_d))/(cre_m+cre_e+cre_i+cre_cn+cre_d);

               
        
        System.out.println("PROMEDIO PONDERADO: "+ pp);

       if (pp < 3) {
            if (nota_m<nota_e & nota_m<nota_i & nota_m<nota_cn & nota_m<nota_d) {
                nota_m=(3*(cre_m+cre_e+cre_i+cre_cn+cre_d)-(nota_e*cre_e)-(nota_i*cre_i)-(nota_cn*cre_cn)-(nota_d*cre_d))/(cre_m);
                System.out.print("PARA OBTENER PROMEDIO DE 3,0 - NECESITABA MATEMÁTICAS EN: " +nota_m);  

            }else if (nota_e<nota_m & nota_e<nota_i & nota_e<nota_cn & nota_e<nota_d) {
                nota_e=(3*(cre_m+cre_e+cre_i+cre_cn+cre_d)-(nota_m*cre_m)-(nota_i*cre_i)-(nota_cn*cre_cn)-(nota_d*cre_d))/(cre_e); 
                System.out.print("PARA OBTENER PROMEDIO DE 3,0 - NECESITABA ESPAÑO EN: " +nota_e);  

            }else if (nota_i<nota_m & nota_i<nota_e & nota_i<nota_cn & nota_i<nota_d) {
                nota_i=(3*(cre_m+cre_e+cre_i+cre_cn+cre_d)-(nota_m*cre_m)-(nota_e*cre_e)-(nota_cn*cre_cn)-(nota_d*cre_d))/(cre_i); 
                System.out.print("PARA OBTENER PROMEDIO DE 3,0 - NECESITABA INGLÉS EN: " +nota_i);

            }else if (nota_cn<nota_m & nota_cn<nota_e & nota_cn<nota_i & nota_cn<nota_d) {
                nota_cn=(3*(cre_m+cre_e+cre_i+cre_cn+cre_d)-(nota_m*cre_m)-(nota_e*cre_e)-(nota_i*cre_i)-(nota_d*cre_d))/(cre_cn); 
                System.out.print("PARA OBTENER PROMEDIO DE 3,0 - NECESITABA CIENCIAS NATURALES EN: " +nota_cn);  

            }else if (nota_d<nota_e & nota_d<nota_i & nota_d<nota_cn & nota_d<nota_m){
                nota_d=(3*(cre_m+cre_e+cre_i+cre_cn+cre_d)-(nota_e*cre_e)-(nota_i*cre_i)-(nota_cn*cre_cn)-(nota_m*cre_m))/(cre_d); 
                System.out.print("PARA OBTENER PROMEDIO DE 3,0 - NECESITABA DEPORTES EN: " +nota_d);   
            }else {
                System.out.print("EL PROMEDIO FUE MENOR QUE 3,0 PERO ALGUNAS MATERIAS TUVIERON LA MISMA NOTA");
            }
       }
    }
}