//Llenado de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el arreglo 
//lleno con números aleatorios

public class Ejercicio07{
    public static void main(String[] args ){
       
        int lista1= new int[10];
        lista1= llenadoArreglo(lista1);
        int lista2= new int[8];
        lista2= llenadoArreglo(lista2);
        int lista3= new int[6];
        lista3= llenadoArreglo(lista3);
        int lista4= new int[4];
        lista4= llenadoArreglo(lista4);
        int lista5= new int[12];
        lista5= llenadoArreglo(lista5);

        imprimirArreglo(lista1);
        imprimirArreglo(lista2);
        imprimirArreglo(lista3);
        imprimirArreglo(lista4);
        imprimirArreglo(lista5);
        
    }
    //Crear el arreglo
    public static int[] llenadoArreglo(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            int aleatorio = (int)(Math.random()*100);
            arreglo[i]=aleatorio;
        }
    }
    //funcion para imprimir
    public void imprimirArreglo(int[] arreglo){
        System.out.println("Imprimiendo arreglo: ");
        for(int i=0; i<arreglo.length;i++){
            System.out.println("[ " + arreglo[i]+" ]");
        }
        return arreglo;
       
    }
       
    

}
