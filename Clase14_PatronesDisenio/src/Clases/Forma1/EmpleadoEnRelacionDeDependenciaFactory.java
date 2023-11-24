package Clases.Forma1;

public class EmpleadoEnRelacionDeDependenciaFactory implements EmpleadoFactory{
    @Override
    public  Empleado crearEmpleado(String tipo) {
        if("EMP-RD".equals(tipo)){
            return new EmpleadoEnRelacionDeDependencia(1000);
        }else{
            throw new IllegalArgumentException("No se puede crear sin parametro");
        }

    }
}
