package Parcial;

import java.time.LocalDate;
import java.time.LocalTime;


public class Consulta {
    private LocalDate fechaConsulta;
    private String especialidad;
    private LocalTime horaConsulta;

    public Consulta(LocalDate fechaConsulta, String especialidad, LocalTime horaConsulta) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaConsulta = horaConsulta;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}
