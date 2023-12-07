package Clase.Forma1;

import java.util.ArrayList;
import java.util.List;

//la clase observable
public class Usuario {
    private String nombre;
    private String apellido;

    private int cantNotificaciones;

    private List<Observador> seguidores= new ArrayList<>();
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void subirFoto(){
        String mensaje= nombre+ " subió una foto";
        notificarSeguidores(mensaje);
    }
    public void agregarSeguidor(Observador seguidor){
        seguidores.add(seguidor);
    }
    public void eliminarSeguidor(Observador seguidor){
        seguidores.remove(seguidor);
    }
    public void notificarSeguidores(String mensaje){
        for (Observador seguidor : seguidores) {
            seguidor.notificar(mensaje);
            cantNotificaciones++;
        }
        System.out.println("cantidad de notificaciones: "+cantNotificaciones);
    }

}
