//Ingresar un número que represente una fecha (ddmmaaaa), la//
//aplicación debe mostrar en pantalla la fecha en forma de texto.//

import java.util.Scanner;

public class Ejer09 {
    private static final String[] NOMBRES_MESES = {
            "", "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato ddmmaaaa:");
        int fecha = scanner.nextInt();

        // Verificar si la fecha es válida
        int dia = fecha / 1000000;
        int mes = (fecha / 10000) % 100;
        int anio = fecha % 10000;

        if (validarFecha(dia, mes, anio)) {
            String fechaEnTexto = convertirFechaEnTexto(dia, mes, anio);
            System.out.println("La fecha en texto es: " + fechaEnTexto);
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }

    private static boolean validarFecha(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && esBisiesto(anio)) {
            diasPorMes[2] = 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes];
    }

    private static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    private static String convertirFechaEnTexto(int dia, int mes, int anio) {
        String fechaEnTexto = "";

        // Día
        fechaEnTexto += dia + " de ";

        // Mes
        fechaEnTexto += NOMBRES_MESES[mes] + " ";

        // Año
        fechaEnTexto += "de " + anio;

        return fechaEnTexto;
    }
}
