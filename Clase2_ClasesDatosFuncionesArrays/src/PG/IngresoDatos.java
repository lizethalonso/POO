package PG;

import java.util.Scanner;

// Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
// una tercera tus iniciales.

public class IngresoDatos {
     public static void main(String[] args) {
         Scanner scanner;
         scanner = new Scanner(System.in);

         String nombre;
         String apellido;
         char InicialNombre;
         char InicialApellido;

         System.out.println("Ingrese su nombre");
         nombre = scanner.nextLine();
         System.out.println("Ingrese su apellido");
         apellido = scanner.nextLine();

         InicialNombre = nombre.charAt(0);
         InicialApellido = apellido.charAt(0);

         System.out.println("Las iniciales son: " + InicialNombre + InicialApellido);
     }
}
