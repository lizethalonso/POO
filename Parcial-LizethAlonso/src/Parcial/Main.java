package Parcial;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Consulta consulta1 = new Consulta(LocalDate.of(2023,11,15),"Cardiología", LocalTime.of(15,20));
        Consulta consulta2 = new Consulta(LocalDate.of(2023,11,15),"Pediatria", LocalTime.of(8,0));
        Consulta consulta3 = new Consulta(LocalDate.of(2023,11,15),"Oftalmología", LocalTime.of(12,40));
        Particular particular = new Particular(consulta1,LocalDate.of(1995,5,6),"Pedro", "Campos",true,125000.0,1744545);
        ObraSocial obraSocial1 = new ObraSocial(consulta2,LocalDate.of(2023,1,20),"Maria","Lopez",false,"Sanitas",100);
        ObraSocial obraSocial2 = new ObraSocial(consulta3,LocalDate.of(1960,12,14),"Miguel","Alvarez",true,"Colmedicos",120);

        System.out.println("Paciente particular");
        System.out.println("Valor consulta: "+particular.getValorConsulta());
        System.out.println("¿Requiere evaluación inicial?: "+particular.evaluacionInicial());

        System.out.println("---------------------------------------------------------------");
        System.out.println("Paciente obra social");
        System.out.println("¿Requiere evaluación inicial?: "+obraSocial1.evaluacionInicial());
        System.out.println("¿El número de asociado de "+obraSocial1.getNombre()+" es mayor que el número de asociado de " + obraSocial2.getNombre() +"?: "+obraSocial1.esMayor(obraSocial2));
        System.out.println("¿El número de asociado de "+obraSocial2.getNombre()+" es mayor que el número de asociado de " + obraSocial1.getNombre() +"?: "+obraSocial2.esMayor(obraSocial1));
    }
}
