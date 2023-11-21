package Mesas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Lucas", "Becerra", "dddd00", LocalDate.of(2024, 2, 12));
            paciente.darAlta(LocalDate.of(2020, 1, 2));
        } catch (FechaInternacionExcepcion | FechaDeAltaExcepcion e) {
            System.err.println(e.getMessage());
        }
        try {
            Paciente paciente2 = new Paciente("Lucias", "Be", "dddd", LocalDate.of(2022, 2, 12));
            paciente2.darAlta(LocalDate.of(2020, 1, 2));
        } catch (FechaInternacionExcepcion | FechaDeAltaExcepcion e) {
            System.err.println(e.getMessage());
        }
    }
}

