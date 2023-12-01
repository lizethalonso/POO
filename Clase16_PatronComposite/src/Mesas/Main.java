package Mesas;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Rectangulo("Rectángulo", 5.0,4.0);
        Figura figura2 = new Circulo("Circulo",1.0);
        Figura figura3 = new Circulo("Circulo",1.0);
        Figura figura4 = new Circulo("Circulo",1.0);

        CompuestoFigura compuestoFigura = new CompuestoFigura("Vagón");
        compuestoFigura.agregarFigura(figura);
        compuestoFigura.agregarFigura(figura2);
        compuestoFigura.agregarFigura(figura3);
        compuestoFigura.agregarFigura(figura4);
        Double total = compuestoFigura.calcularAreaOSuperficie();
        System.out.println("La superficie total del " + compuestoFigura.getName() + " es de: " + total);
        System.out.println(figura2.calcularAreaOSuperficie());
    }
}
