package Mesas;

public class FechaInternacionExcepcion extends Exception{
    public FechaInternacionExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
