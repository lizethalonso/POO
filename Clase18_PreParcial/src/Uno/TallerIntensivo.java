package Uno;

public class TallerIntensivo extends OfertaAcademica{
    private int CantidadTrabajosPracticos;
    private Double precioTrabajoPractico;

    public TallerIntensivo(String nombre, String descripcion, int CantidadTrabajosPracticos, Double precioTrabajoPractico) {
        super(nombre, descripcion);
        this.CantidadTrabajosPracticos = CantidadTrabajosPracticos;
        this.precioTrabajoPractico = precioTrabajoPractico;
    }

    @Override
    public Double calcularPrecio() {
        return CantidadTrabajosPracticos * precioTrabajoPractico;
    }
}
