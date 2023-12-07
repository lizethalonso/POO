package Clases.Forma1;

public class EmpleadoContratadoFactory implements EmpleadoFactory{


    @Override
    public Empleado crearEmpleado(String tipo)throws RuntimeException {
        if("EMP-PH".equals(tipo)){
        return new EmpleadoContratado(7.0,14.0);
    }else{
            throw new IllegalArgumentException("No se puede crear sin parametro");
        }


    }
}
