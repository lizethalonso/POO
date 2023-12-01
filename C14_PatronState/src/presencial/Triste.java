package presencial;

public class Triste implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("vomita");
    }

    @Override
    public void recibirBebida() {
        System.out.println("Se pone peor de triste");

    }

    @Override
    public void recibirMimos() {
        System.out.println("Se pone feliz");

    }
}
