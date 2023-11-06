package Clase.presencial;

import java.util.Date;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponible, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponible, porcentajeTinta);
    }

    @Override
    public String imprimir() {
        if(tienePapel()&&!necesitaTinta()){
            return "imprimiendo epson";
        }else{
            return "verifique papel y/o tinta";
        }

    }
}
