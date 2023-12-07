package Clase.Forma2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

//la clase observable
public class Usuario extends Observable {
    private String nombre;
    private String apellido;


    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void subirFoto() {
        String mensaje = nombre + " subió una foto";
        setChanged();
        notifyObservers(mensaje);
    }

}
