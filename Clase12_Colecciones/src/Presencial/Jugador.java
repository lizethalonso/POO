package Presencial;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(int numeroCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(Boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(Boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", estaLesionado=" + estaLesionado +
                ", esTitular=" + esTitular +
                '}';
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        // -1 el objeto actual es menor
        // 0 el objeto actual es igual
        // 1 el objeto actual es mayor
        return  Integer.compare(numeroCamiseta, otroJugador.getNumeroCamiseta());
    }
}
