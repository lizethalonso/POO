package Clase;

import java.util.Scanner;

public class Braulio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Constructor, es llamando a instanciar
        System.out.println("Ingrese el nombre del caballo");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad de " + nombre);;
        int edad = scanner.nextInt();
        System.out.println("Los datos ingresados son: " + nombre + " " + edad + " años");
    }
}
