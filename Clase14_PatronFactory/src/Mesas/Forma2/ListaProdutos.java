package Mesas.Forma2;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos implements Almacen {
    private List<Producto> listaProductos = new ArrayList<>();

    public void agregarProductos(Producto producto){
        listaProductos.add(producto);
    }

    @Override
    public Double calcularEspacioNecesario() {
        Double totalEspacio = 0.0;
        for (Producto producto : listaProductos){
            totalEspacio += producto.calcularEspacio();
        }
        return totalEspacio;
    }
}
