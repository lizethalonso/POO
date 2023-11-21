package EjercicioMesaProfesor;

public class FechaInternacionInvalidaException extends Exception {
    public FechaInternacionInvalidaException() {
        super("La fecha de internación no puede ser posterior al día de hoy.");
    }
}
