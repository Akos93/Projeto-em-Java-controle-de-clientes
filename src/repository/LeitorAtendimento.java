package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe responsável por ler atendimentos de um arquivo.
 */

public class LeitorAtendimento {
    private static final String CAMINHO = "atendimentos.txt";

    public static void ler() {
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO))) {
            String linha;
            boolean vazio = true;
            System.out.println("\nHistorico de atendimentos:");
            int contador = 1;
            while ((linha = br.readLine()) != null) {
                System.out.println(contador++ + ". " + linha);
                vazio = false;
            }
            if (vazio) {
                System.out.println("Nenhum atendimento registrado.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler atendimentos: " + e.getMessage());
        }
    }
}
