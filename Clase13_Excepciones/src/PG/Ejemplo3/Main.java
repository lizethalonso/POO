package PG.Ejemplo3;

public class Main {

    public static void main(String[] args) {

        try {
            Fecha fecha= new Fecha(100,10,2000);}
        catch (FechaException e){
            System.err.println(e.getMessage());

        }
    }
}
