package Clase;

import java.util.ArrayList;
import java.util.List;

//compuesto
public class Combo extends Producto{
    private List<Producto> combos= new ArrayList<>();

    public Combo(String nombre) {
        super(nombre, 0.0); //el precio se inicializaria en 0
    }
    public void agregarProducto(Producto producto){
        combos.add(producto);
    }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for (Producto producto : combos) {
            precioTotal+= producto.getPrecio();
                    }
        System.out.println("El descuento aplicado es del 10%");
        //habia que aplicarle un descuento
        return precioTotal*0.9; //10 % off
    }
}
