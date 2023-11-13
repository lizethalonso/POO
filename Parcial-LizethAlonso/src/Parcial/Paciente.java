package Parcial;

import java.sql.Date;
import java.time.LocalDate;

public class Paciente {
    private Consulta consulta;
    private LocalDate fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraVez;

    public Paciente(Consulta consulta, LocalDate fechaNacimiento, String nombre, String apellido, Boolean primeraVez) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraVez = primeraVez;
    }

    public Boolean evaluacionInicial(){
        return  primeraVez;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(Boolean primeraVez) {
        this.primeraVez = primeraVez;
    }
}
