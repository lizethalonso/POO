package Mesas.Forma2;

public class Pelota extends Producto{
    private Double radio;

     public Pelota(Double peso, Boolean esPelotaTenis){
        super(peso);
        this.radio = esPelotaTenis ? 0.32 : 11.0;;
    }

    @Override
    public Double calcularEspacio() {
         Double print = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
         System.out.println(print);
         return print;
    }
}
