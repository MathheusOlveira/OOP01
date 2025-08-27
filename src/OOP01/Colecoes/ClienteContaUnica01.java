package OOP01.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ClienteContaUnica01 {

    HashSet<String> nomes = new HashSet<>();

    public static void adicionarConta(Set<Integer> contas, int numeroConta) {
        if (contas.add(numeroConta)) {
            System.out.println("Conta " + numeroConta + " adicionada com sucesso.");
        } else {
            System.out.println("Conta " + numeroConta + " já existe. ");
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta) {
        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas) {
        System.out.println("Contas cadastradas: " + contas);
    }

    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();
        adicionarConta(contas, 5569);
        adicionarConta(contas, 6789);
        adicionarConta(contas, 5569);
        System.out.println("Existe conta 456? " + existeConta(contas, 456));
        exibirContas(contas);

    }
}