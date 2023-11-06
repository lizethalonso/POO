package presencial;

public class Cliente {
    public static void main(String[] args) {
        //crear los objetos, mediante la instanciacion del constuctor.
        SocioPileta socio1= new SocioPileta(1,"Jorgito",100.0,"ciclismo",500.0,false);
        SocioPileta socio2= new SocioPileta(2,"German",100.0,"Natacion",500.0,true);
        System.out.println(socio1.calcularCostoMensual());
        System.out.println(socio2.calcularCostoMensual());
        socio1.habilitadoParaPileta();
        System.out.println(socio1.getNombre()+" ,"+"el costo nuevo a abonar es :::"+socio1.calcularCostoMensual());

    }
}
