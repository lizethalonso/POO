package Clase;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese por separado tu fecha de nacimiento: día, mes, año");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        System.out.println("Las iniciales son: ");
        String iniciales = obtenerIniciales(nombre, apellido);
        System.out.println(iniciales);
        String fecha = obtenerFechaNacimiento(dia, mes, anio);

        String ficha = "Nombre ingresado: " + nombre+" "+ apellido + "\n"
                        + "Iniciales: " + iniciales + "\n"
                        + "Fecha nacimiento" + fecha;

        System.out.println(ficha);
    }

    public static String obtenerIniciales(String nombre, String apellido) {
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        return inicialNombre + " " + inicialApellido;
    }

    public static String obtenerFechaNacimiento(int dia, int mes, int anio) {
        String diaStr = String.format("%02d", dia);
        String mesStr = String.format("%02d",mes);
        return diaStr+"/"+mesStr+"/"+anio;
    }

}
