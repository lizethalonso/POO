package Mesas;

public interface EstadoCarrito {
    void agregarProductoAlCarrito(Producto producto);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void pasarSiguienteEstado();

}
