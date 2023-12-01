package presencial;

public class Tamagotchi {
    //tenemos que asociarnos con los estados posibles
    // relacion de asociacion
    private EstadoTamagotchi estado;

    public Tamagotchi(){
        estado= new Feliz(); //inicializa
    }
    //ahora vienen todos los estados posibles para la mascota
    public void recibirComida(){
        estado.recibirComida();
        //es una buena practica, ya que estamos trabajando con herencia y estados preguntar por las instancias
        if(estado instanceof Feliz){
            estado= new Sediento();
        }
         else if (estado instanceof Sediento ) {
            estado= new Triste();
        } else if (estado instanceof Hambriento) {
             estado= new Feliz();
                    }
    }
    public void recibirBebida(){
        estado.recibirBebida();
        if(estado instanceof Feliz){
            estado= new Hambriento();
        } else if (estado instanceof Sediento) {
            estado= new Feliz();
        } else if (estado instanceof Hambriento) {
            estado= new Triste();
        } else if (estado instanceof Triste) {
            System.out.println("titila y hace 3 beep");

        }
    }
    public void recibirMimos(){
        estado.recibirMimos();
        if(estado instanceof Triste){
            estado= new Feliz();
        }
    }
}
