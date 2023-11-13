package presencial;

public class CajadeAhorro extends Cuenta{
    private static final  double intereses_caja_de_ahorro=1.2;
    @Override
    public void extraer(double monto) {
        if(monto<=saldo){
            saldo-=monto;
            System.out.println("se extrajo de su caja de ahorro : "+monto);
            System.out.println("saldo disponible: "+saldo);
                    }
        System.out.println("No puede extraer ese monto, intente con un monto menor.");

    }
    public void cobrarIntereses(){
        saldo+=saldo*(intereses_caja_de_ahorro/100);
    }
}
