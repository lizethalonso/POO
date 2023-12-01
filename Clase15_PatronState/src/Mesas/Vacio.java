package Mesas;

public class Vacio implements EstadoCarrito{

    @Override
    public void agregarProductoAlCarrito(Producto producto) {
        System.out.println("Cambia a estado Cargando");
    }

    @Override
    public void cancelarCarrito() {
        //No cambia estado
    }

    @Override
    public void volverPuntoAnterior() {
        //No cambia estado
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Pasa a estado cargando");
    }
}
