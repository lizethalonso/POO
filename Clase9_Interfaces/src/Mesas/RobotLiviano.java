package Mesas;

public class RobotLiviano extends SistemaDeArmas implements Guerrero, Volador{
    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        if (energia >= 10){
            System.out.println("Preparando armas");
            System.out.println("------------------------------------------------------");
            System.out.println("Atacando........");
        }else{
            System.out.println("No cuenta con suficiente energía");
        }
    }

    @Override
    public void defender() {
        if (energia >= 10) {
            System.out.println("Preparando armas y escudos");
            System.out.println("------------------------------------------------------");
            System.out.println("Defendiendo........");
        }else{
            System.out.println("No cuenta con suficiente energía");
        }
    }

    @Override
    public void volar() {

    }
}
