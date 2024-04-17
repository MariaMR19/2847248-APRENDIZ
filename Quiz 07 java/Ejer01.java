import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número de 3 dígitos como máximo");
        int num = teclado.nextInt();

        int d3=num%10;
        int d2=(num/10)%10;
        int d1=(num/100);

        //  CENTENAS  //

        if (d1==1 && d2==0 && d3==0){
            System.out.print("CIEN ");
        }
        if (d1==1 && (d2!=0 || d3!=0)){
            System.out.print("CIENTO ");
        }
        if (d1==2 && d2==0 && d3==0){
            System.out.print("DOSCIENTOS ");
        }
        if (d1==2 && (d2!=0 || d3!=0)){
            System.out.print("DOSCIENTOS ");
        }
        if (d1==3 && d2==0 && d3==0){
            System.out.print("TRESCIENTOS ");
        }
        if (d1==3 && (d2!=0 || d3!=0)){
            System.out.print("TRESCIENTOS ");
        }
        if (d1==4 && d2==0 && d3==0){
            System.out.print("CUATROCIENTOS ");
        }
        if (d1==4 && (d2!=0 || d3!=0)){
            System.out.print("CUATROCIENTOS ");
        }
        if (d1==5 && d2==0 && d3==0){
            System.out.print("QUINIENTOS ");
        }
        if (d1==5 && (d2!=0 || d3!=0)){
            System.out.print("QUINIENTOS ");
        }
        if (d1==6 && d2==0 && d3==0){
            System.out.print("SEISCIENTOS ");
        }
        if (d1==6 && (d2!=0 || d3!=0)){
            System.out.print("SEISCIENTOS ");
        }
        if (d1==7 && d2==0 && d3==0){
            System.out.print("SETECIENTOS ");
        }
        if (d1==7 && (d2!=0 || d3!=0)){
            System.out.print("SETECIENTOS ");
        }
        if (d1==8 && d2==0 && d3==0){
            System.out.print("OCHOCIENTOS ");
        }
        if (d1==8 && (d2!=0 || d3!=0)){
            System.out.print("OCHOCIENTOS ");
        }
        if (d1==9 && d2==0 && d3==0){
            System.out.print("NOVECIENTOS ");
        }
        if (d1==9 && (d2!=0 || d3!=0)){
            System.out.print("NOVECIENTOS ");
        }

        //  DECENAS //

        if (d2==1){
            if (d3==0){
                System.out.print("DIEZ ");
            }else if (d3==1) {
                System.out.print("ONCE ");
            }else if (d3==2){
                System.out.print("DOCE ");
            }else if (d3==3){
                System.out.print("TRECE ");
            }else if(d3==4){
                System.out.print("CATORCE ");
            }else if(d3==5){
                System.out.print("QUINCE ");                
            }else {
                System.out.print("DIECI");
            }

        }
        if (d2==2){
            if (d3==0){
                System.out.print("VEINTE");
            }else {
                System.out.print("VEINTI");
            }
        }

        if (d2==3){
            if (d3==0){
                System.out.print("TREINTA");
            }else {
                System.out.print("TREINTA Y ");
            }
        }

        if (d2==4){
            if (d3==0){
                System.out.print("CUARENTA");
            }else {
                System.out.print("CUARENTA Y ");
            }
        }

        if (d2==5){
            if (d3==0){
                System.out.print("CINCUENTA");
            }else {
                System.out.print("CINCUENTA Y ");
            }
        }

        if (d2==6){
            if (d3==0){
                System.out.print("SESENTA");
            }else {
                System.out.print("SESENTA Y ");
            }
        }

        if (d2==7){
            if (d3==0){
                System.out.print("SETENTA");
            }else {
                System.out.print("SETENTA Y ");
            }
        }

        if (d2==8){
            if (d3==0){
                System.out.print("OCHENTA");
            }else {
                System.out.print("OCHENTA Y ");
            }
        }

        if (d2==9){
            if (d3==0){
                System.out.print("NOVENTA");
            }else {
                System.out.print("NOVENTA Y ");
            }
        }

        //  UNIDADES  //

        if (d3==1 && d2!=1){ 
            System.out.print("UNO");
        }
        if (d3==2 && d2!=1){
            System.out.print("DOS");
        }
        if (d3==3 && d2!=1){
            System.out.print("TRES");
        }
        if (d3==4 && d2!=1){
            System.out.print("CUATRO");
        }
        if (d3==5 && d2!=1){
            System.out.print("CINCO");
        }
        if (d3==6){
            System.out.print("SEIS");
        }
        if (d3==7){
            System.out.print("SIETE");
        }
        if (d3==8){
            System.out.print("OCHO");
        }
        if (d3==9){
            System.out.print("NUEVE");
        }
        if (d1==0 & d2==0 & d3==0){
            System.out.print("CERO");
        }




       


    }

}
           
        
        
        








    
 