package Mesas;

public class Cargando implements EstadoCarrito{
    @Override
    public void agregarProductoAlCarrito(Producto producto) {
        //No cambia
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Cambia a estado Vacío");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("Cambia a estado Vacío");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Cambia a estado Pagando");
    }
}
