package Mesas;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"López","1121587456",123);
        CuentaCorriente ctaCte = new CuentaCorriente(cliente,1200000.0,3000000.0);
        System.out.println("--------------------------------------------------");
        System.out.println("                 RETIRAR DINERO                   ");
        System.out.println("--------------------------------------------------");
        System.out.println("**********No alcanza saldo para retirar **********");
        ctaCte.extraer(4000000.0);
        System.out.println("************Sacando de descubierto ***************");
        ctaCte.extraer(2500000.0);
        System.out.println("****************Sacando de saldo *****************");
        ctaCte.extraer(200000.0);

        System.out.println("***************************************************");
        System.out.println(ctaCte.getClienteAsociado());

        System.out.println("--------------------------------------------------");
        System.out.println("                 DEPÓSITO CHEQUE                  ");
        System.out.println("--------------------------------------------------");
        ctaCte.depositar(1000000.0);
        Cheque cheque01 = new Cheque(1000000.0,"Banco Popular", LocalDate.of(2023,2,28), 100);
        ctaCte.depositar(cheque01);
        System.out.println(cheque01.getFechaPago());

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("                 DEPÓSITO AHORRO                  ");
        System.out.println("--------------------------------------------------");
        CajaAhorro ahorros1 = new CajaAhorro(cliente,200000.0,1.2);
        ahorros1.depositar(1.0);
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("                  RETIRAR AHORRO                  ");
        System.out.println("--------------------------------------------------");
        ahorros1.extraer(1.0);
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("                  COBRAR INTERÉS                  ");
        System.out.println("--------------------------------------------------");
        ahorros1.cobrarIntereses(2);
    }

}
