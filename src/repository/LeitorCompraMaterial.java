package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe responsável por ler compras de material de um arquivo.
 */
public class LeitorCompraMaterial {
    private static final String CAMINHO = "compras.txt";

    public static void ler() {
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO))) {
            String linha;
            boolean vazio = true;
            System.out.println("\nHistorico de compras de material:");
            int contador = 1;
            while ((linha = br.readLine()) != null) {
                System.out.println(contador++ + ". " + linha);
                vazio = false;
            }
            if (vazio) {
                System.out.println("Nenhuma compra de material registrada.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler compras de material: " + e.getMessage());
        }
    }
}
