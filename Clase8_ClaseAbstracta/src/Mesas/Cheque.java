package Mesas;

import java.time.LocalDate;
import java.util.Date;

public class Cheque {
    private Double monto;
    private String banco;
    private LocalDate fechaPago;
    protected Integer numCheque;

    public Cheque(Double monto, String banco, LocalDate fechaPago, Integer numCheque) {
        this.monto = monto;
        this.banco = banco;
        this.fechaPago = fechaPago;
        this.numCheque = numCheque;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(Integer numCheque) {
        this.numCheque = numCheque;
    }
}
