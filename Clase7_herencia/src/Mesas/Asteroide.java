package Mesas;

public class Asteroide extends Objeto{
    private Integer lesion;


    public Asteroide(Integer posx, Integer posy, Character direccion, Integer lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(Integer posx, Integer posy, Character direccion) {
        setPosx(posx);
        setPosy(posy);
        setDireccion(direccion);
    }

    @Override
    public String toString() {
        return "Asteroide en " + super.toString();
    }
}
