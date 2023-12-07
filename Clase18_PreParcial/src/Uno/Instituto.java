package Uno;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> listaDeOfertaAcademica = new ArrayList<>();

    public void agregarOfertaAcademica(OfertaAcademica item){
        listaDeOfertaAcademica.add(item);
    }

    public void generarInforme(){
        System.out.println("Informe de Oferta Académica disponible: ");
        System.out.println("........................................");
        for (OfertaAcademica ofertaAcademica : listaDeOfertaAcademica) {
            if (ofertaAcademica instanceof Curso){
                System.out.println("Curso: " + ofertaAcademica.getNombre() + " - Precio: " + ofertaAcademica.calcularPrecio());
            }else if (ofertaAcademica instanceof ProgramaIntensivo){
                System.out.println("Programa Intensivo: " + ofertaAcademica.getNombre() + " - Precio: " + ofertaAcademica.calcularPrecio());
            } else if (ofertaAcademica instanceof TallerIntensivo) {
                System.out.println("Taller Intensivo: " + ofertaAcademica.getNombre() + " - Precio: " + ofertaAcademica.calcularPrecio());
            } else if (ofertaAcademica instanceof Carrera) {
                System.out.println("Carrera: " + ofertaAcademica.getNombre() + " - Precio: " + ofertaAcademica.calcularPrecio());
            }else{
                System.out.println("Instancia no válida");
            }
        }
    }

}
