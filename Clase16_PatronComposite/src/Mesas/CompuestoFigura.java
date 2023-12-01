package Mesas;

import java.util.ArrayList;
import java.util.List;

public class CompuestoFigura extends Figura{
    private List<Figura> compuestoFigura = new ArrayList<>();

    public CompuestoFigura(String name) {
        super(name);
    }

    public void agregarFigura(Figura figura) {
        compuestoFigura.add(figura);
    }

    @Override
    public Double calcularAreaOSuperficie() {
        Double totalSuperficie = 0.0;
        for (Figura figura : compuestoFigura) {
            totalSuperficie += figura.calcularAreaOSuperficie();
        }
        return totalSuperficie;
    }
}
