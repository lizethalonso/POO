package EjercicioMesaProfesor;

import java.time.LocalDate;

public class Paciente {
    private String nombre;
    private String apellido;
    private String DNI;
    private LocalDate fechaInternacion;
    private LocalDate fechaAlta;

    public Paciente(String nombre, String apellido, String DNI, LocalDate fechaInternacion) throws FechaInternacionInvalidaException {
        if (fechaInternacion.isAfter(LocalDate.now())) {
            throw new FechaInternacionInvalidaException();
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fechaInternacion = fechaInternacion;
    }

    public void darAlta(LocalDate fechaAlta) throws FechaAltaInvalidaException {
        if (fechaAlta.isBefore(fechaInternacion)) {
            throw new FechaAltaInvalidaException();
        }
        this.fechaAlta = fechaAlta;
    }
}
