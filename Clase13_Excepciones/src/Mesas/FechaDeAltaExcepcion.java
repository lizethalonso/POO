package Mesas;

public class FechaDeAltaExcepcion extends Exception{
    public FechaDeAltaExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
