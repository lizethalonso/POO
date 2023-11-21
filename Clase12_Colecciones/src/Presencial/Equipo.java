package Presencial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listaJugadores= new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares(){
        System.out.println("Lista de convocados para el finde semana:::::");
        /*for (Jugador jugador : listaJugadores) {
            if(jugador.getEsTitular()) {
                System.out.println(jugador.toString());
            }
        }
*/
        listaJugadores.stream().filter(Jugador::getEsTitular).sorted().forEach(jugador -> System.out.println(jugador.getNombre()+" camiseta numero: "+jugador.getNumeroCamiseta()));
    }
    public int getCantidadDeLesionados(){
        return (int)listaJugadores.stream().filter(jugador -> jugador.getEstaLesionado()&& jugador.getEsTitular()).count();
    }
}
