package OOP01.ExercAplicadoOOP;
// Matheus Oliveira de Assunção - Exercício Aplicado de OOP.
// Main testando com 2 clients, cada um com uma conta diferente, simulando as operações
// bancárias de depositar, sacar e aplicar juros, porem sem scanner por pura preguiça.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana Verde", "123.456.789-00");
        Cliente cliente2 = new Cliente("João Azul", "987.654.321-00");
        ContaCorrente conta1 = new ContaCorrente("0001", cliente1, 0);
        ContaPoupanca conta2 = new ContaPoupanca("0002", cliente2, 0);

        System.out.println(cliente1.getNome() + " - " + cliente1.getCpf());
        conta1.depositar(1000);
        conta1.sacar(500);
        conta1.aplicarJuros();
        System.out.println("Saldo Conta Corrente: " + conta1.getSaldo());

        System.out.println("\n" + cliente2.getNome() + " - " + cliente2.getCpf());
        conta2.depositar(1000);
        conta2.sacar(500);
        conta2.aplicarJuros();
        System.out.println("Saldo Conta Poupança: " + conta2.getSaldo());

    }
}
