package Mesas.Forma2;

public abstract class ProductoFactory {
    public static Producto crearProducto(String tipoProducto){
        if ("3".equalsIgnoreCase(tipoProducto)){
            return new Caja(20.0);
        }else if ("1".equalsIgnoreCase(tipoProducto)) {
            return new Pelota(1.5,false);
        } else if ("2".equalsIgnoreCase(tipoProducto)) {
            return new Pelota(1.0,true);
        }else{
            throw new IllegalArgumentException("Tipo de producto no valido" + tipoProducto);
        }
    }
}
