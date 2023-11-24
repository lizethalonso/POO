package Clases.Forma2;

public class EmpleadoEnRelacionDeDependencia extends Empleado {
    private double sueldoMensual;

    public EmpleadoEnRelacionDeDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return (sueldoMensual/30)*dias;
    }
}
