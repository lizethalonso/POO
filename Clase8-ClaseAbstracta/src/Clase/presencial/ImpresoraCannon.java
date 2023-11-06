package Clase.presencial;

import java.util.Date;

public class ImpresoraCannon extends Impresora{
    public ImpresoraCannon(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponible, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponible, porcentajeTinta);
    }

    @Override
    public Boolean necesitaTinta() {
        return porcentajeTinta<10;
    }

    @Override
    public String imprimir() {
        return null;
    }
}
