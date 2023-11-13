package Mesas;

public class Main {
    public static void main(String[] args) {
        Tanque tanque = new Tanque(80);
        tanque.mostrar();
        tanque.atacar();

        System.out.println("----------------------------------------------------");

        SistemaDeArmas armas = new Senuelo(40);
        Senuelo senuelo = (Senuelo)armas;
        ((Senuelo) armas).volar();
    }
}
