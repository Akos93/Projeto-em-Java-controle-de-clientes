package entities;

import java.time.LocalDate;

public class CompraMaterial {
    private LocalDate dataCompra;
    private double valor;

    public CompraMaterial(LocalDate dataCompra, double valor) {
        this.dataCompra = dataCompra;
        this.valor = valor;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Data da compra: " + dataCompra
                + "Valor: R$ " + String.format("%.2f", valor);
    }
}
