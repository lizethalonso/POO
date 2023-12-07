package Clase.Forma2;

import java.util.Observable;
import java.util.Observer;

//la implemementacion de observador
public class Seguidor implements Observer {
    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje= (String)arg;
        System.out.println(nombre+": fue notificado de la foto : "+mensaje);
        cantidadDeNotificaciones++;
    }
}
