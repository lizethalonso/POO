package presencial;

public class Cliente {
    public static void main(String[] args) {
        CuentaCorriente cuenta1= new CuentaCorriente();
        cuenta1.depositar(1000);
        cuenta1.informarSaldo();

        double impuesto= cuenta1.gravar(5);
        System.out.println("impuesto gravado: "+impuesto);
        cuenta1.informarSaldo();
    }
}
