package entities;

import java.time.LocalDate;

/**
 * Classe que representa um atendimento realizado a um cliente.
 */

public class Atendimento {
    private LocalDate data;
    private Cliente cliente;
    private double valorRecebido;
    private double gastoMaterial;
    private double gastoDeslocamento;

    public Atendimento (LocalDate data, Cliente cliente, double valorRecebido, double gastoMaterial,
                        double gastoDeslocamento) {
        if (valorRecebido < 0 || gastoMaterial < 0 || gastoDeslocamento < 0) {
            throw new IllegalArgumentException("Valores monetários não podem ser negativos.");
        }
        this.data = data;
        this.cliente = cliente;
        this.valorRecebido = valorRecebido;
        this.gastoMaterial = gastoMaterial;
        this.gastoDeslocamento = gastoDeslocamento;

    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public double getGastoMaterial() {
        return gastoMaterial;
    }

    public double getGastoDeslocamento() {
        return gastoDeslocamento;
    }


    public double calcularValorLiquido() {
        return valorRecebido - (gastoMaterial + gastoDeslocamento);
    }

    @Override
    public String toString() {
        return "Data: " + data
                + ", Cliente: " + cliente.getNome()
                + ", Telefone: " + cliente.getTelefone()
                + ", Valor recebido: R$ " + String.format("%.2f", valorRecebido)
                + ", Gasto de material: R$ " + String.format("%.2f", gastoMaterial)
                + ", Gasto com deslocamento: R$ " + String.format("%.2f", gastoDeslocamento)
                + ", Valor líquido: R$ " + String.format("%.2f", calcularValorLiquido());
    }

}




