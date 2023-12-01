package presencial;

public class Feliz implements  EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Se pone sediento");

    }

    @Override
    public void recibirBebida() {
        System.out.println(" se pone hambriento");

    }

    @Override
    public void recibirMimos() {
        //sin cambios

    }
}
