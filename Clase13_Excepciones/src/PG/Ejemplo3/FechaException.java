package PG.Ejemplo3;

public class FechaException extends  Exception{

    public FechaException()
    {
        super();
    }
    public FechaException(String mensaje)
    {
        super(mensaje);
    }
    public String toString()
    {
        return "Se produjo el siguiente Excepción " + this.getClass().getName() +"\n" +
                " Mensaje: " + this.getMessage() + "\n" ;
    }
}
