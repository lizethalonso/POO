package ExamenProfe;

public class ExamenParcial extends Examen{
    private int numeroDeUnidad;
    private int cantidadDeIntentos;

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota, int numeroDeUnidad, int cantidadDeIntentos) {
        super(alumno, titulo, enunciado, nota); //LLAMANDO AL CONSTRUCTOR DEL PADRE
        this.numeroDeUnidad = numeroDeUnidad;
        this.cantidadDeIntentos = cantidadDeIntentos;
    }
    public Boolean sePuedeRecuperar(){
        if(numeroDeUnidad<=3){
            return cantidadDeIntentos<3;
        }else{
            return cantidadDeIntentos<2;
        }
    }
}
