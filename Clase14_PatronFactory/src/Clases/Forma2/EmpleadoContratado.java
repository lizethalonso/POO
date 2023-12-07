package Clases.Forma2;

public class EmpleadoContratado extends Empleado {
    private double importePorHora;
    private double retencionImpuesto;

    public EmpleadoContratado(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {

        return (8*importePorHora*dias)*(1-retencionImpuesto/100);
    }
}
