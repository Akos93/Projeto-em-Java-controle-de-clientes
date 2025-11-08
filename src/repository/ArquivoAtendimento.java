package repository;

import entities.Atendimento;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoAtendimento {
    private static final String CAMINHO = "atendimentos.txt";

    public static void salvar(Atendimento atendimento) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO,true))) {
            bw.write("Data: " + atendimento.getData());
            bw.write(", Cliente: " + atendimento.getCliente().getNome());
            bw.write(", Telefone: " + atendimento.getCliente().getTelefone());
            bw.write(", Valor recebido: R$ " + String.format("%.2f", atendimento.getValorRecebido()));
            bw.write(", Gasto de material: R$ " + String.format("%.2f", atendimento.getGastoMaterial()));
            bw.write(", Gasto de deslocamento: R$ " + String.format("%.2f", atendimento.getGastoDeslocamento()));
            bw.write(", Valor líquido: R$ " + String.format("%.2f", atendimento.calcularValorLiquido()));
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar atendimento: " + e.getMessage());
        }
    }
}






