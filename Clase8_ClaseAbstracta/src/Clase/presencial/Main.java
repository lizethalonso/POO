package Clase.presencial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ImpresoraEpson impresoraEpson= new ImpresoraEpson("Epson123","usb",new Date(1990,05,10),0,17.0);
        System.out.println(impresoraEpson.imprimir());

    }
}
