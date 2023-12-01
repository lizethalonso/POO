package Mesas;

public class Pagando implements EstadoCarrito{

    @Override
    public void agregarProductoAlCarrito(Producto producto) {
        System.out.println("Cambia a estado Cargando");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Cambia a estado Vacío");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("Cambia a estado Cargando");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Cambia a estado Cerrado");
    }
}
