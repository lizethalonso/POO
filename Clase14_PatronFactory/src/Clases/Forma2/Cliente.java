package Clases.Forma2;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("********Bienvenidos a la factory********");
            System.out.println("Ingrese el tipo de empleado a crear:");
            System.out.println("EMP-RD: Empleado en Relacion de Dependencia o EMP-PH para un empleado contratado");
            String tipoEmpleado= scanner.nextLine();
            Empleado empleado= EmpleadoFactory.crearEmpleado(tipoEmpleado);
            System.out.println("Ingresa la cantidad de dias que trabajó: ");
            int dias= scanner.nextInt();
            double salario= empleado.calcularSueldo(dias);
            System.out.println("el salario a percibir es de  $: "+salario);
            scanner.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
