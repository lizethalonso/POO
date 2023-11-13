package Mesas;

public class Senuelo extends SistemaDeArmas implements Volador{

    public Senuelo(Integer energia) {
        super(energia);
    }

    @Override
    public void volar() {
        System.out.println("Volando");
    }
}
