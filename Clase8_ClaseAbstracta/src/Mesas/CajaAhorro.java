package Mesas;

public class CajaAhorro extends Cuenta{
    private Double saldo;
    private Double tasaInteres;

    public CajaAhorro(Cliente clienteAsociado, Double saldo, Double tasaInteres) {
        super(clienteAsociado);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(Double cantidad) {
        saldo += cantidad;
        System.out.println("Sr. " + getClienteAsociado().getApelido() + " su nuevo saldo luego del depósito es: " + saldo);
    }

    @Override
    public void extraer(Double cantidad) {
        if(saldo>=cantidad){
            saldo-=cantidad;
            System.out.println("Saldo disponible luego de retirar: "+ saldo);
        }else{
            System.out.println("No hay saldo suficiente");
        }
    }

    @Override
    public Double mostrarSaldo() {
        return saldo;
    }

    public void cobrarIntereses(int meses){
        saldo += ((saldo*(tasaInteres/100))*meses);
        System.out.println("Saldo disponible luego de cobrar interés: "+ saldo);
    }
}
