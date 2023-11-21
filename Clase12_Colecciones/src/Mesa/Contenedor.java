package Mesa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Contenedor {
    private Integer identificador;
    private Procedencia procedencia;
    private Boolean materialesPeligrosos;
    private List<Contenedor> listaContenedores = new ArrayList<>();

    public Contenedor(Integer identificador, Procedencia procedencia, Boolean materialesPeligrosos) {
        this.identificador = identificador;
        this.procedencia = procedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public void agregarContenedor(Contenedor contenedor){
        listaContenedores.add(contenedor);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "identificador=" + identificador +
                ", procedencia=" + procedencia +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}'+ "\n";
    }

    public void mostrarContenedor(){
        // Mostrar por número de identificador
        List<Contenedor> listaContenedorOrdenada = listaContenedores.stream()
                         .sorted(Comparator.comparing(Contenedor::getIdentificador))
                         .toList();

        System.out.println(listaContenedorOrdenada.toString());

        // Para ordenar manualmente, se trata de duplicar la lista original
        // (List<Contenedor> listaOrdenada = new ArrayList<>(listaContenedores);)
        // y hacer el bubble sort con la nueva lista.

    }

    public int calcularPeligrososUbicacionDesconocida(){
        return (int) listaContenedores.stream()
                .filter(contenedor -> contenedor.materialesPeligrosos && (contenedor.getProcedencia()==Procedencia.Desconocida))
                .count();
    }


    public void ordenarListaContenedores(){
        System.out.println("Lista de contenedores: ");

        /*for (int i = 0; i<listaContenedores.size();i++)
            for (int j = 0; j<listaContenedores.size()-1;j++){
                if (listaContenedores.get(j).identificador > listaContenedores.get(j+1).identificador){
                    Contenedor temp = listaContenedores.get(j);
                    listaContenedores.set(j, listaContenedores.get(j+1));
                    listaContenedores.set(j+1,temp);
                }
            }
        System.out.println(listaContenedores.toString());*/

         listaContenedores = listaContenedores.stream()
            .sorted(Comparator.comparing(Contenedor::getIdentificador))
            .collect(Collectors.toList());

        System.out.println(listaContenedores.toString());
    }
}
