package Uno;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private Double bonificacion;
    private List<OfertaAcademica> listaCursosDelPrograma = new ArrayList<>();

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica curso : listaCursosDelPrograma) {
            precioTotal += curso.calcularPrecio();
        }
        return precioTotal*(1-bonificacion/100);
        // valorDescuento = (precioTotal*bonificacion)/100;
        // return precioTotal -= valorDescuento;
    }

    public void agregarCursosAlPrograma(OfertaAcademica curso){
        listaCursosDelPrograma.add(curso);
    }
}
