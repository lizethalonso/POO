package Mesas;

public class Producto {
    private EstadoCarrito estadoCarrito;

    public Producto(){
        estadoCarrito = new Vacio();
    }

    public void agregarProductoAlCarrito(){
        estadoCarrito.agregarProductoAlCarrito(Producto p);
        if (estadoCarrito instanceof Vacio){
            estadoCarrito =new Cargando();
        } else if (estadoCarrito instanceof Cargando) {
            estadoCarrito = new Cargando();
        } else if (estadoCarrito instanceof Pagando) {
            estadoCarrito = new Cargando();
        }else if (estadoCarrito instanceof Cerrado) {
            estadoCarrito = new Cargando();
        }
    }
}
