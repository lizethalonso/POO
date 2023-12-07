package Mesas.Forma2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            ListaProdutos listaProdutos = new ListaProdutos();
            System.out.println("¿Desea ingresar productos? - 1) Si, 2) No");
            String opcion = scanner.nextLine();
            while (opcion.equals("1")){
                System.out.println("Ingrese el tipo de producto a elegir");
                System.out.println("************************************");
                System.out.println("Opción 1: Pelota de futbol");
                System.out.println("Opción 2: Pelota de tenis");
                System.out.println("Opción 3: Caja 10x10");
                String tipoProducto = scanner.nextLine();
                Producto producto = ProductoFactory.crearProducto(tipoProducto);
                producto.calcularEspacio();
                listaProdutos.agregarProductos(producto);
                System.out.println("Desea ingresar más productos? - Seleccione 1 Si, 2 No");
                opcion = scanner.nextLine();
            }
            Double espacioTotal = listaProdutos.calcularEspacioNecesario();
            System.out.println(espacioTotal);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
