package PG;

/*
Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
Informar el resultado obtenido.
*/

public class ComparaNumeros {
    public static void main(String[] args) {
        Integer num1 = 2;
        Integer num2 = 3;
        Integer comparar = num1.compareTo(num2);

        if (comparar.equals(1)) {
            System.out.println("El número 1 es mayor que número 2");
        } else if (comparar.equals(-1)) {
            System.out.println("El número 1 es menor que número 2");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
