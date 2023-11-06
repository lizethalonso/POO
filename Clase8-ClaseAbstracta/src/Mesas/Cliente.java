package Mesas;

public class Cliente {
    private Integer numeroCliente;
    private String apelido;
    private String dni;
    private Integer cuit;

    public Cliente(Integer numeroCliente, String apelido, String dni, Integer cuit) {
        this.numeroCliente = numeroCliente;
        this.apelido = apelido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }
}
