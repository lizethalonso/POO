package Mesas;

public class Nave extends Objeto {
    private double velocidad;
    private Integer vida;
    private String dir;

    public Nave(Integer posx, Integer posy, Character direccion, double velocidad, Integer vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(Integer posx, Integer posy, Character direccion) {
        if (direccion!= super.getDireccion()) {
            girar(direccion);
            if (direccion == 'N'){
                dir = "Norte";
            } else if (direccion == 'S'){
                dir = "Sur";
            } else if (direccion == 'E'){
                dir = "Este";
            } else {
                dir = "Oeste";
            }
            System.out.println("La nave gir贸 en direcci贸n " + dir);
        }
        System.out.println("La nave no gir贸");

        setPosx(posx);
        setPosy(posy);
    }

    public void girar (Character direccion){
        super.setDireccion(direccion);

    }

    public void restaVida(int valor){
        if (valor < vida && valor > 0){
            this.vida = this.vida - valor;
        } else{
            this.vida = 0;
        }
    }


    @Override
    public String toString() {
        return "Nave en " + super.toString() + " con direcci贸n " + getDireccion() + " y velocidad " + velocidad;
    }
}
