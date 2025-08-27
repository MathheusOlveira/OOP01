package OOP01.Colecoes;
import java.util.HashMap;
import java.util.Map;

public class SaldoCliente {

    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) {
        if (contas.containsKey(numeroConta)) {
            System.out.println("Conta já cadastrada: " + numeroConta);
        } else {
            contas.put(numeroConta, saldoInicial);
            System.out.println("Conta cadastrada: " + numeroConta + " com saldo inicial: " + saldoInicial);
        }
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor) {
        if (contas.containsKey(numeroConta)) {
            double saldoAtual = contas.get(numeroConta);
            contas.put(numeroConta, saldoAtual + valor);
            System.out.println("Depósito de " + valor + " realizado na conta " + numeroConta + ". Saldo atualizado: " + contas.get(numeroConta));
        } else {
            System.out.println("Conta não encontrada: " + numeroConta);
        }
    }

    public static void exibirSaldos(Map<String, Double> contas) {
        System.out.println("Saldos dos clientes:");
        for (Map.Entry<String, Double> entry : contas.entrySet()) {
            System.out.println("Conta: " + entry.getKey() + " - Saldo: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();
        System.out.println("-------------------------");
        adicionarCliente(contas, "12345-6", 1400.0);
        adicionarCliente(contas, "78901-2", 800.0);
        adicionarCliente(contas, "12345-6", 189.0);
        System.out.println("-------------------------");
        depositar(contas, "12345-6", 200.0);
        depositar(contas, "11111-1", 50.0);

        exibirSaldos(contas);
    }
}