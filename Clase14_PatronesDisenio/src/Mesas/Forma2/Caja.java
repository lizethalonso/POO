package Mesas.Forma2;

public class Caja extends Producto{
    private Double longitud;
    private Double ancho;
    private Double altura;

    public Caja(Double peso) {
        super(peso);
        this.longitud = 10.0;
        this.ancho = 10.0;
        this.altura = 10.0;
    }

    @Override
    public Double calcularEspacio() {
        Double print = longitud*ancho*altura;
        System.out.println(print);
        return print;
    }
}
