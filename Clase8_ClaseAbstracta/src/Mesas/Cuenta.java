package Mesas;

public abstract class Cuenta {
    private Cliente clienteAsociado;

    public abstract void depositar(Double cantidad);
    public abstract void extraer(Double cantidad);
    public abstract Double mostrarSaldo();

    public Cuenta(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

}
