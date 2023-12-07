package Clase.Forma1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("German","Fraire");
        Usuario usuario2= new Usuario("Gina","Arias");

        Seguidor seguidor1= new Seguidor("Beatriz", "Collin");
        Seguidor seguidor2= new Seguidor("Rene", "Valenzuela");


        usuario1.agregarSeguidor(seguidor1);
        usuario1.agregarSeguidor(seguidor2);

        usuario1.subirFoto();
        usuario1.subirFoto();


        //usuario2.subirFoto();

        System.out.println("Cantidad de veces que se notico: "+seguidor1.getCantidadDeNotificaciones());
    }
}
