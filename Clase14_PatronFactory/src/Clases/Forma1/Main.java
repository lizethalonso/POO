package Clases.Forma1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception{
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("********Bienvenidos a la factory********");
            System.out.println("Ingrese el tipo de empleado a crear: 2 para RD y 1 para EC");
            String tipoEmpleado= scanner.nextLine();
            if("1".equals(tipoEmpleado)){
                //si
                Empleado empleado= new EmpleadoContratadoFactory().crearEmpleado("EMP-PH");
                System.out.println("******Ingrese la cantidad de dias trabajados:");
                int dias= scanner.nextInt();
                double sueldo= empleado.calcularSueldo(dias);
                System.out.println(" sueldo calculado por sistema: "+sueldo);
                }else{
                if ("2".equals(tipoEmpleado)){
                    Empleado empleado= new EmpleadoEnRelacionDeDependenciaFactory().crearEmpleado("EMP-RD");
                    System.out.println("******Ingrese la cantidad de dias trabajados:");
                    int dias= scanner.nextInt();
                    double sueldo= empleado.calcularSueldo(dias);
                    System.out.println(" sueldo calculado por sistema: "+sueldo);
                }
            }
            scanner.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                System.out.println("muchas gracias por usar la fabrica");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
