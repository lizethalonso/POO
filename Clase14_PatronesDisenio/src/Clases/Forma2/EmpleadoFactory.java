package Clases.Forma2;

public abstract class EmpleadoFactory {
     public static Empleado crearEmpleado(String tipo){
          if("EMP-RD".equalsIgnoreCase(tipo)){
               return new EmpleadoEnRelacionDeDependencia(1000);
          } else if ("EMP-PH".equalsIgnoreCase(tipo)) {
               return new EmpleadoContratado(7.0,14);
                         }
          else{
               throw new IllegalArgumentException("tipo de empleado no valido"+tipo);
          }
     }
}
