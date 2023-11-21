package EjercicioMesaProfesor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            LocalDate fechaInternacion = LocalDate.of(2023, 9, 10);
            Paciente paciente = new Paciente("Juan", "Pérez", "12345678", fechaInternacion);
            System.out.println("Paciente creado correctamente.");

            LocalDate fechaAlta = LocalDate.of(2023, 9, 5);
            paciente.darAlta(fechaAlta); // Esto generará una FechaAltaInvalidaException
        } catch (FechaInternacionInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (FechaAltaInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
