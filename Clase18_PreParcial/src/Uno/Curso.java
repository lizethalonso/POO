package Uno;

public class Curso extends OfertaAcademica{
    private Integer cargaHorariaMensual;
    private Integer duracionMeses;
    private Double valorHora;

    public Curso(String nombre, String descripcion, Integer cargaHorariaMensual, Integer duracionMeses, Double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.duracionMeses = duracionMeses;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio() {
        return cargaHorariaMensual*duracionMeses*valorHora;
    }

    public Integer getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public Integer getDuracionMeses() {
        return duracionMeses;
    }

    public Double getValorHora() {
        return valorHora;
    }
}
