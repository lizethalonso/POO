package presencial;

public class CuentaCorriente extends Cuenta implements GravadorDeImpuestos{
    private double descubiertoPermitido;
    @Override
    public void extraer(double monto) {
        if(monto<=saldo+descubiertoPermitido){
            saldo-=monto;
            System.out.println("se extrajo de su cuenta corriente : "+monto);
            System.out.println("saldo disponible: "+saldo);
        }
        System.out.println("No puede extraer ese monto, intente con un monto menor.");
    }

    @Override
    public double gravar(double porcentaje) {
        double impuesto= saldo*(porcentaje/100);
        saldo-=impuesto;
        return impuesto;
    }


}
