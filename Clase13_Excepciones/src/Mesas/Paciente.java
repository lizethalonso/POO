package Mesas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    LocalDate fechaInternacion;
    LocalDate fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, LocalDate fechaInternacion) throws FechaInternacionExcepcion {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMM 'de' yyyy");
        String hoyFormateado = hoy.format(formatter);
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.isBefore(hoy))
            this.fechaInternacion=fechaInternacion;
        else
            throw new FechaInternacionExcepcion("La fecha de internación del paciente "
                    + this.nombre + " " + this.apellido + " no debe ser posterior a la " +
                    "fecha de hoy: " + hoyFormateado);
    }

    public LocalDate getFechaInternacion() {
        return fechaInternacion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(LocalDate fechaAlta) throws FechaDeAltaExcepcion{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMM 'de' yyyy");
        String fechaInternacionFormateada = fechaInternacion.format(formatter);
        if (fechaAlta.isAfter(fechaInternacion)){
            System.out.println("Ok, el paciente " + this.nombre + " "
                    + this.apellido +" puede salir de la clínica");
        }else
            throw new FechaDeAltaExcepcion("La fecha de alta de " + this.nombre + " "
                    + this.apellido + " no puede ser anterior a la " +
                    "fecha de su internación " + fechaInternacionFormateada);
    }
    // Convertir Date a LocalDate
    //LocalDate hoySimple = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
}


