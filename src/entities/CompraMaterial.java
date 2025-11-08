package entities;

import java.time.LocalDate;

/**
 * Classe que representa uma compra de material.
 */

public class CompraMaterial {
    private String descricao;
    private LocalDate dataCompra;
    private double valor;


    public CompraMaterial(String descricao, LocalDate dataCompra, double valor) {
        this.descricao = descricao;
        this.dataCompra = dataCompra;
        this.valor = valor;

    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return dataCompra;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Data da compra: "
                + dataCompra
                + ", Descricao: "
                + descricao
                + ", Valor: R$ "
                + String.format("%.2f", valor);
    }
}
