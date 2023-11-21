package presencial;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private Double saldoEnCuenta;
    private Double limiteDeCuenta;
    private Double deuda;

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.saldoEnCuenta = 0.0;
        this.limiteDeCuenta = 20.0;
        this.deuda = 0.0;
    }

    public void comprar(double importe) throws Exception{
        if(saldoEnCuenta+importe>limiteDeCuenta){
            //saldo= 10, importe = 20, limite = 20;
            throw new Exception("Supero el limite establecito para la compra.");

            //System.out.println("no se pudo comprar");
        }else{//saldo= 10, importe = 20, limite = 50;

            saldoEnCuenta+=importe; //=30
            System.out.println("Compra realizada con exito con un importe de : "+importe);
        }
    }
    public void saldarDeuda(double importe) throws ClienteException {
        if (deuda <= 0) {
            throw new ClienteException("No tiene deuda que saldar.");
        }

        if (importe <= 0) {
            throw new ClienteException("El importe debe ser mayor que cero para saldar la deuda.");
        }

        if (importe > deuda) {
            throw new ClienteException("El importe ingresado es mayor que la deuda pendiente.");
        }

        deuda -= importe;
        System.out.println("Deuda saldada por $" + importe + ". Deuda restante: $" + deuda);
    }

}
