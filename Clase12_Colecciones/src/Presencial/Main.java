package Presencial;

public class Main {
    public static void main(String[] args) {
        Equipo equipoA= new Equipo("Colo Colo");
        Jugador jugador= new Jugador(10,"Pipi Martinez",true,true);
        Jugador jugador2= new Jugador(220,"Joaquin Martinez",true,false);
        Jugador jugador3= new Jugador(30,"Roman",true,true);
        equipoA.agregarJugador(jugador);
        equipoA.agregarJugador(jugador2);
        equipoA.agregarJugador(jugador3);

        equipoA.mostrarJugadoresTitulares();
        System.out.println("cantidad de lesionados y titulares::::"+equipoA.getCantidadDeLesionados());
    }
}
