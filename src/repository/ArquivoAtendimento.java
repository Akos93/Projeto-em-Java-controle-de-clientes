package repository;

import entities.Atendimento;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoAtendimento {

    public static void salvar(Atendimento atendimento) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("atendimentos.txt", true))) {
            bw.write(atendimento.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar atendimento: " + e.getMessage());
        }
    }
}






