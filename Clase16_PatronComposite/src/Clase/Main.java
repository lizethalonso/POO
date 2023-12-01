package Clase;

public class Main {
    public static void main(String[] args) {
        //Productos
        Producto producto1= new Hamburguesa("1/4 libra",10.0);
        Producto producto2= new Acompanamiento("Papas Fritas",4.0);

        System.out.println("Producto 1 : "+producto1.getNombre()+" .-$:"+producto1.getPrecio());
        System.out.println("Producto 2 : "+producto2.getNombre()+" .-$:"+producto2.getPrecio());


        Combo combo= new Combo("Big Digital");
        combo.agregarProducto(producto1);
        combo.agregarProducto(producto2);

        CarritoDeCompras carritoDeCompras= new CarritoDeCompras();
        carritoDeCompras.agregarProducto(producto1);
        carritoDeCompras.agregarProducto(producto2);
        System.out.println("Precio total del carrito sin Combo: $"+carritoDeCompras.calcularPrecioTotal());

        carritoDeCompras.agregarProducto(combo);

        System.out.println("El precio total agregando el combo es: "+combo.getPrecio());
    }
}
