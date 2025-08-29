package OOP01.HackathonCollections;

import java.util.Objects;

// Classe Cliente conforme solicitado, com equals e hashCode baseados em CPF.

public class Cliente {
    private String nome, cpf;
    private int id;

    public Cliente(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
