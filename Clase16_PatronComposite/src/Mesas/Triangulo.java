package Mesas;

public class Triangulo extends Figura{
    private Double base;
    private Double alto;

    public Triangulo(String name, Double base, Double alto) {
        super(name);
        this.base = base;
        this.alto = alto;
    }

    @Override
    public Double calcularAreaOSuperficie() {
        return (base*alto)/2;
    }
}
