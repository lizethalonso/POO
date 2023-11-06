package PG;

/*
Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
mensaje.
*/

public class CadenasTxt {
    public static void main(String[] args) {
        String nombre1 = "Minina";
        String nombre2 = "Minina";

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres no son iguales");
        }
    }
}