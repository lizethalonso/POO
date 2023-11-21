package Mesa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor(123,Procedencia.Canada,true);
        Contenedor contenedor2 = new Contenedor(128,Procedencia.Brasil,true);
        Contenedor contenedor3 = new Contenedor(120,Procedencia.China,true);
        Contenedor contenedor4 = new Contenedor(115,Procedencia.Desconocida,true);

        contenedor.agregarContenedor(contenedor);
        contenedor.agregarContenedor(contenedor2);
        contenedor.agregarContenedor(contenedor3);
        contenedor.agregarContenedor(contenedor4);

        contenedor.mostrarContenedor();
        System.out.println("Contenedores peligrosos de procedencia Desconocida: " + contenedor.calcularPeligrososUbicacionDesconocida());


    }
}
