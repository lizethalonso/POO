package Uno;

public class Main {
    public static void main(String[] args) {

        OfertaAcademica ofertaAcademica1 = new Curso("FrontEnd","FrontEnd",16,2,1000.00);
        OfertaAcademica ofertaAcademica2 = new Curso("Backend", "Backend",20,2,900.00);
        OfertaAcademica ofertaAcademica3 = new ProgramaIntensivo("FullStack", "Back + Front", 20.0);
        OfertaAcademica ofertaAcademica4 = new TallerIntensivo("Design Thinking", "DS", 7,5000.0);
        OfertaAcademica ofertaAcademica5 = new TallerIntensivo("Metodologías", "MT", 9,4000.0);
        OfertaAcademica ofertaAcademica6 = new Carrera("Ing. Software","Ingeniería",200000.0);

        ((ProgramaIntensivo) ofertaAcademica3).agregarCursosAlPrograma(ofertaAcademica1);
        ((ProgramaIntensivo) ofertaAcademica3).agregarCursosAlPrograma(ofertaAcademica2);

        ((Carrera) ofertaAcademica6).agregarCursoTaller(ofertaAcademica4);
        ((Carrera) ofertaAcademica6).agregarCursoTaller(ofertaAcademica1);
        ((Carrera) ofertaAcademica6).agregarCursoTaller(ofertaAcademica2);

        Instituto instituto = new Instituto();
        instituto.agregarOfertaAcademica(ofertaAcademica1);
        instituto.agregarOfertaAcademica(ofertaAcademica2);
        instituto.agregarOfertaAcademica(ofertaAcademica3);
        instituto.agregarOfertaAcademica(ofertaAcademica4);
        instituto.agregarOfertaAcademica(ofertaAcademica5);
        instituto.agregarOfertaAcademica(ofertaAcademica6);
        instituto.generarInforme();
    }
}
