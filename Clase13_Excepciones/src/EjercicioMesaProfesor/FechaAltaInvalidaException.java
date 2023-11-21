package EjercicioMesaProfesor;

public class FechaAltaInvalidaException  extends Exception{
    public FechaAltaInvalidaException() {
        super("La fecha de alta no puede ser anterior a la fecha de internación.");
    }
}
