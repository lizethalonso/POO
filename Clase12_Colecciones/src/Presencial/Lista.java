package Presencial;

import Mesa.Contenedor;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Contenedor> listaContenedores= new ArrayList<>();

    public void agregarContenedor(Contenedor contenedor){
        listaContenedores.add(contenedor);
    }

    public void mostrarContenedor(){
        System.out.println("Lista de contenedores: ");
        Integer cont = listaContenedores.get(0).getIdentificador();
        List<Contenedor> listaOrdenada= new ArrayList<>();

        //for (i = 0; i<listaContenedores.size();i++)
        for (Contenedor contenedor:listaContenedores)
        {
            if (contenedor.getIdentificador() < cont){
                cont = contenedor.getIdentificador();
                listaOrdenada.add(contenedor);
                System.out.println(contenedor);
            }
        }


    }
}
