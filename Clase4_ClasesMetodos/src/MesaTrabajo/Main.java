package MesaTrabajo;

public class Main {
    public static void main(String[] args) {
    UsuarioJuego usuarioJuego = new UsuarioJuego("Maria","cacaca");
        System.out.println(usuarioJuego.getNombre());
        System.out.println(usuarioJuego.getClave());
        usuarioJuego.aumentarPuntaje();
        System.out.println("Puntaje: "+ usuarioJuego.getPuntaje());
        usuarioJuego.subirNivel();
        System.out.println("Nivel: "+ usuarioJuego.getNivel());
        usuarioJuego.bonus(2);
        System.out.println("Puntaje nuevo: " + usuarioJuego.getPuntaje());
    }
}
