package Uno;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private Double costoBasico;
    private List<OfertaAcademica> listaCursosTalleres = new ArrayList<>();

    public Carrera(String nombre, String descripcion, Double costoBasico) {
        super(nombre, descripcion);
        this.costoBasico = costoBasico;
    }

    public void agregarCursoTaller(OfertaAcademica ofertaAcademica){
        if (ofertaAcademica instanceof ProgramaIntensivo){
            System.out.println("No se pueden agregar programas intensivos a la Carrera");
        }else if (ofertaAcademica instanceof Curso){
            if (((Curso) ofertaAcademica).getCargaHorariaMensual() > 10){
                listaCursosTalleres.add(ofertaAcademica);
            }
            else {
                System.out.println("La carga horario del curso no debe ser menor o igual a 10");
            }
        }else{
            listaCursosTalleres.add(ofertaAcademica);
        }
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica cursoTaller : listaCursosTalleres) {
            precioTotal += cursoTaller.calcularPrecio();
        }
        return costoBasico + precioTotal;
    }
}
