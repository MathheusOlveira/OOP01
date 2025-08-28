package OOP01.Colecoes02;

import java.util.ArrayList;
import java.util.List;

public class ClienteOrdemChegada01 {
    public static class Cliente {
        private String nome;
        private int id;
        private String cpf;

        public Cliente(int id, String nome, String cpf) {
            this.nome = nome;
            this.id = id;
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }

        @Override
        //public String toString() {
        //    return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + '}';
        //}     Outra forma de fazer o toString.
        public String toString() { return String.format("ID: %d | Nome: %s | CPF: %s", id, nome, cpf); }
    }

    public static void main(String[] args) {
        java.util.List<Cliente> clientes = new java.util.ArrayList<>();
        clientes.add(new Cliente(1, "Ana Verde", "123.456.789-00"));
        clientes.add(new Cliente(2, "Bruno Azul", "987.654.321-00"));
        clientes.add(new Cliente(3, "Carla Amarela", "456.789.123-00"));
        clientes.add(new Cliente(4, "Daniel Preto", "789.123.456-00"));
        clientes.add(new Cliente(5, "Eva Rosa", "321.654.987-00"));

        System.out.println("\n" + "Clientes cadastrados na ordem de chegada:");
        clientes.forEach(System.out::println);

        String cpfBusca = "456.789.123-00";
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfBusca)) {
                System.out.println("\n" + "Cliente encontrado: " + cliente);
            }
        }
    }
}