package Parcial;

import java.time.LocalDate;

public class Particular extends Paciente{
    private Double valorConsulta;
    private Integer dni;

    public Particular(Consulta consulta, LocalDate fechaNacimiento, String nombre, String apellido, Boolean primeraVez, Double valorConsulta, Integer dni) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraVez);
        this.valorConsulta = valorConsulta;
        this.dni = dni;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public Integer getDni() {
        return dni;
    }

}
