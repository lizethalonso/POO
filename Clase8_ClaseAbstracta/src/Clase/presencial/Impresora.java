package Clase.presencial;

import java.util.Date;

public abstract class Impresora {
    //atributos
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponible;
    protected Double porcentajeTinta;

    //EL CONSTRUCTOR EN UNA CLASE ABSTRACTA NO PUEDE INSTANCIARSE DE MANERA DIRECTA
    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponible, Double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponible = hojasDisponible;
        this.porcentajeTinta = porcentajeTinta;
    }
  public Boolean tienePapel(){
        return hojasDisponible >0 ;
  };
  public Boolean necesitaTinta(){
      return porcentajeTinta<=5;
  };
  public abstract String imprimir(); //es un metodo abstracto que no debo desarrollar
}
