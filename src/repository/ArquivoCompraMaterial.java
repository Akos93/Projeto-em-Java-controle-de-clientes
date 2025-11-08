package repository;

import entities.CompraMaterial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe responsável por salvar compras de material em um arquivo.
 */


public class ArquivoCompraMaterial {
    private static final String CAMINHO = "compras.txt";

    public static void salvar(CompraMaterial compra) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO, true))) {
            bw.write("Data da compra: " + compra.getData());
            bw.write(", Descricao: " + compra.getDescricao());
            bw.write(", Valor: R$ " + String.format("%.2f", compra.getValor()));
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar compra de material: " + e.getMessage());
        }
    }
}



