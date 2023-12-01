package Mesas;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(String name, Double radio) {
        super(name);
        this.radio = radio;
    }

    @Override
    public Double calcularAreaOSuperficie() {
        return radio*radio*Math.PI;
    }
}
