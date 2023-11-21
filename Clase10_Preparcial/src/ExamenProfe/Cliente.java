package ExamenProfe;

public class Cliente {
    public static void main(String[] args) {
        Alumno alumno= new Alumno("Carlitos","Fuentes",122222);
        Examen examen1= new ExamenParcial(alumno,"Examen POO","Polimorfismo",1.0,2,6);
        boolean resultado= examen1.estaAprobado();
        System.out.println("Estado de aprobacion:;;;;"+resultado);
        //necesito castear examen a parcial
        if(examen1 instanceof ExamenParcial) //la pregunta es opcinal, pero es buena practica.
        {
            ExamenParcial parcial= (ExamenParcial) examen1; //casteo Explicito
            System.out.println("estado posible de recuperatorio:::"+((ExamenParcial) examen1).sePuedeRecuperar());

        }

    }
}
