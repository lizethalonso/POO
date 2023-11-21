package Simulacro;

public class Velero extends Embarcacion{
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esloraLongMts, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, esloraLongMts);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande (){
        return this.cantidadMastiles > 4;
    }
}
