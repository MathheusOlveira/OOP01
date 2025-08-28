package OOP01.Colecoes;

import java.util.Comparator;
import java.util.List;

public class ClientePorSaldo06 {
    public static class Cliente {
        String nome;
        double saldo;

        public Cliente(String nome, double saldo) {
            this.nome = nome;
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }
    }
    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        clientes.add(new Cliente(nome, saldo));
    }
    public static void ordernarPorSaldo(List<Cliente> clientes){
        clientes.sort(Comparator.comparing (Cliente::getSaldo));
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new java.util.ArrayList<>();
        adicionarCliente(clientes, "Ana", 2500.0);
        adicionarCliente(clientes, "Bruno", 1500.0);
        adicionarCliente(clientes, "Carla", 3000.0);
        adicionarCliente(clientes, "Daniel", 1000.0);

        System.out.println("Clientes antes da ordenação:");
        clientes.forEach(System.out::println);

        ordernarPorSaldo(clientes);

        System.out.println("\nClientes após a ordenação por saldo:");
        clientes.forEach(System.out::println);
    }
}