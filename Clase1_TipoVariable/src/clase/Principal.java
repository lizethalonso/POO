package clase;

public class Principal {
    public static void main(String[] args) { //metodo = funciones
        int variable1 = 2; // Tipo de dato primitivo
        Integer variable2 = 2; // Clases envolventes = tienen superpoderes
        // Estas me dan más funcionalidades (comparar, pasar a string, etc.)
        variable2.equals(variable1);
        System.out.println(variable2.compareTo(18)); // Me bota un -1 (sería algo como false)
        double notaParcial = 8.9; // Dato primitivo
        Double notaExamen = 9.7; // Dato envolvente
        System.out.println(notaParcial);
        System.out.println(notaExamen.equals(notaParcial));

    }
}
