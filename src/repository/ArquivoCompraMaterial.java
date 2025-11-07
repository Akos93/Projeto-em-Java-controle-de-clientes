package repository;

import entities.CompraMaterial;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class    ArquivoCompraMaterial {
    public static void salvar(CompraMaterial compra) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("compras.txt", true))) {
            bw.write(compra.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar compra de material: " + e.getMessage());
        }
    }
}



