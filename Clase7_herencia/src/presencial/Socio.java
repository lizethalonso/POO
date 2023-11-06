package presencial;

public class Socio {
    private Integer numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(Integer numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio; //12213902839290
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }
    public Double calcularCostoMensual(){
        return cuotaMensual+(0.05*cuotaMensual);// el resultado de la cuota +5%
    }

    public Integer getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }
}
