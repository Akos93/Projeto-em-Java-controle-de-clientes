package entities;

/**
 * Classe que representa um cliente.
 */

public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente nao pode ser vazio.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone do cliente nao pode ser vazio.");
        }
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente nao pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone (String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone do cliente nao pode ser vazio.");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: "
                + nome
                + ", Telefone: "
                + telefone;



    }



}
