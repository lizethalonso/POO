package Mesas;

public class Cerrado implements EstadoCarrito{

    @Override
    public void agregarProductoAlCarrito(Producto producto) {
        System.out.println("Cambia a estado Cargando");
    }

    @Override
    public void cancelarCarrito() {
        //No cambia;
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No se puede");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Cambia a estado Vacío");
    }
}
