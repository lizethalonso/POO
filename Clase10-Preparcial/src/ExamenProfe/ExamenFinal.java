package ExamenProfe;

public class ExamenFinal extends Examen{
    private double notaOral;
    private String descripcion;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, double notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }
    public Boolean esMayorQue(ExamenFinal otroExamen){
        double notaExamen1= (this.nota+notaOral)/2;
        double notaExamen2= (otroExamen.nota+otroExamen.notaOral)/2;
        return notaExamen1>notaExamen2;
    }
}
