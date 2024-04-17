//Realizar una aplicación en JAVA, que solicite al usuario ingresar cinco notas de asignaturas definidas,// 
//posteriormente se debe mostrar en pantalla://
//- Asignatura con mayor nota.//
//- Asignatura con menor nota.//
//- Promedio de notas.//
//- En el caso de que el promedio de notas de inferior a 3, se debe indicar en pantalla la nota que debió obtener en//
//la asignatura con menor nota para alcanzar el promedio de 3.//

public class Ejer10 {
    public static void main(String[] args){        
        Scanner scanner = new Scanner(System.in);

        // Definir las asignaturas
        String[] asignaturas = {"Matemáticas", "Ciencias", "Historia", "Literatura", "Inglés"};

        // Arreglos para almacenar las notas
        double[] notas = new double[5];

        // Solicitar al usuario ingresar las notas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota de " + asignaturas[i] + ":");
            notas[i] = scanner.nextDouble();
        }

        // Encontrar la asignatura con la mayor nota
        double mayorNota = notas[0];
        String asignaturaMayorNota = asignaturas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > mayorNota) {
                mayorNota = notas[i];
                asignaturaMayorNota = asignaturas[i];
            }
        }

        // Encontrar la asignatura con la menor nota
        double menorNota = notas[0];
        String asignaturaMenorNota = asignaturas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                asignaturaMenorNota = asignaturas[i];
            }
        }

        // Calcular el promedio de notas
        double sumaNotas = 0;
        for (int i = 0; i < 5; i++) {
            sumaNotas += notas[i];
        }
        double promedioNotas = sumaNotas / 5;

        // Mostrar resultados
        System.out.println("Asignatura con mayor nota: " + asignaturaMayorNota + " (" + mayorNota + ")");
        System.out.println("Asignatura con menor nota: " + asignaturaMenorNota + " (" + menorNota + ")");
        System.out.println("Promedio de notas: " + promedioNotas);

        // Verificar si el promedio es inferior a 3 y calcular la nota necesaria
        if (promedioNotas < 3) {
            double notaNecesaria = (3 * 5) - sumaNotas + menorNota;
            System.out.println("Para alcanzar un promedio de 3, debe obtener al menos " + notaNecesaria +
                    " en la asignatura " + asignaturaMenorNota);
        }
    }
}