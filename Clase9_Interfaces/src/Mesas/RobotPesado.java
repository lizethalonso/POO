package Mesas;

public class RobotPesado extends SistemaDeArmas implements Guerrero{

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        if (energia >= 70){
            System.out.println("Preparando armas");
            System.out.println("------------------------------------------------------");
            System.out.println("Atacando........");
        }else{
            System.out.println("No cuenta con suficiente energía");
        }
    }

    @Override
    public void defender() {
        if (energia >= 20) {
            System.out.println("Preparando armas y escudos");
            System.out.println("------------------------------------------------------");
            System.out.println("Defendiendo........");
        }else{
            System.out.println("No cuenta con suficiente energía");
        }
    }
}
