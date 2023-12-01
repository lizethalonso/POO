package Clase;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos= new ArrayList<>();

    public void agregarProducto(Producto p){
         productos.add(p);
    }
    public double calcularPrecioTotal(){
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+= producto.getPrecio();
        }
        //habia que aplicarle un descuento
        return precioTotal; //10 % off
    }
}
