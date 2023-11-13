package Parcial;


import java.time.LocalDate;

public class ObraSocial extends Paciente{
    private String nombreObraSocial;
    private Integer numeroAsociado;

    public ObraSocial(Consulta consulta, LocalDate fechaNacimiento, String nombre, String apellido, Boolean primeraVez, String nombreObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraVez);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    public Boolean esMayor(ObraSocial obraSocial){
        return this.numeroAsociado > obraSocial.numeroAsociado;
    }


}
