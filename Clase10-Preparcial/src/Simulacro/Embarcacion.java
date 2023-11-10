package Simulacro;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double esloraLongMts;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esloraLongMts) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.esloraLongMts = esloraLongMts;
    }

    public Double calcularAlquiler(){
        if(anioFabricacion>2020){
            return precioBase + valorAdicional;
        }else {
            return precioBase;
        }
    }
}
