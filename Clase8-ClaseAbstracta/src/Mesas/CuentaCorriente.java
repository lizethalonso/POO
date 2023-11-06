package Mesas;

public class CuentaCorriente extends Cuenta{
    private Double saldo;
    private Double descubiertoAutorizado;

    public CuentaCorriente(Cliente clienteAsociado, Double saldo, Double descubiertoAutorizado) {
        super(clienteAsociado);
        this.saldo = saldo;
        this.descubiertoAutorizado = descubiertoAutorizado;
    }

    @Override
    public void depositar(Double cantidad) {
        System.out.println("Saldo inicial: "+ saldo);
        saldo += cantidad;
        System.out.println("Saldo disponible luego de depositar: "+ saldo);
    }

    public void depositar(Cheque cheque) {
        System.out.println("Saldo inicial: "+ saldo);
        saldo += cheque.getMonto();
        System.out.println("Se está depositando a su cuenta " + cheque.getMonto() + " el cheque número: " + cheque.getNumCheque());
        System.out.println("Saldo disponible luego de depositar su cheque: "+ saldo);
    }

    @Override
    public void extraer(Double cantidad) {
        if(saldo >= cantidad){
            System.out.println("Saldo inicial: "+ saldo);
            saldo-=cantidad;
            System.out.println("Saldo disponible luego de retirar: "+ saldo);
        }else if(descubiertoAutorizado >= cantidad){
            System.out.println("Descubierto inicial: "+ descubiertoAutorizado);
            descubiertoAutorizado -= cantidad;
            System.out.println("Descubierto disponible luego de retirar: "+ descubiertoAutorizado);
        }else{
            System.out.println("Saldo y/o descubierto no es suficiente para retirar ");
        }
    }

    @Override
    public Double mostrarSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDescubiertoAutorizado() {
        return descubiertoAutorizado;
    }

    public void setDescubiertoAutorizado(Double descubiertoAutorizado) {
        this.descubiertoAutorizado = descubiertoAutorizado;
    }
}
