package Clase.Forma1;

//la implemementacion de observador
public class Seguidor implements Observador {
    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+ "Fue notificado de la foto : "+mensaje);
        cantidadDeNotificaciones++;
    }

    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }
}
