package presencial;

public class Hambriento implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Se pone feliz");
    }

    @Override
    public void recibirBebida() {
        System.out.println("Se pone triste");
    }

    @Override
    public void recibirMimos() {
        //sin cambios

    }
}
