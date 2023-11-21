package Simulacro;

public class Yate extends Embarcacion{
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esloraLongMts, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, esloraLongMts);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Boolean esMasLujoso(Yate otroYate){
        return this.cantidadCamarotes > otroYate.cantidadCamarotes;
    }

}
