package Simulacro;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Lucas", "López", "ABC123");
        Embarcacion embarcacion = new Yate(capitan,120000.0,25000.0,2019,20.1,15);
        Yate yate2 = new Yate(capitan,150000.0,25000.0,2018,30.0,8);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Valor alquiler: "+embarcacion.calcularAlquiler());
        System.out.println("----------------------------------------------------------------------");
        if (embarcacion instanceof Yate){
            //Yate yate = (Yate) embarcacion;
            System.out.println("¿Es más lujoso?: " + ((Yate) embarcacion).esMasLujoso(yate2));
        }else {
            System.out.println("No es una instancia de Yate");
        }
        System.out.println("----------------------------------------------------------------------");

        Velero velero = new Velero(capitan,300000.0,50000.0,2023,12.2,2);
        System.out.println("¿El velero es grande?: "+velero.esGrande());

    }
}
