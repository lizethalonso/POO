package Mesas;

public class Rectangulo extends Figura{

    private Double alto;
    private Double largo;

    public Rectangulo(String name, Double alto, Double largo) {
        super(name);
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularAreaOSuperficie() {
        return alto*largo;
    }
}
