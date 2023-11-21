package ExamenProfe;

public abstract class Examen {
    private Alumno alumno; //relacion de asociacion
    private String titulo;
    private String enunciado;
    protected Double nota;

    public Examen(Alumno alumno, String titulo, String enunciado, Double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    public Boolean estaAprobado(){
        return nota>=4;
    }
}
