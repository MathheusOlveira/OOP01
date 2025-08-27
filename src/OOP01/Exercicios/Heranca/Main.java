package OOP01.Exercicios.Heranca;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente com R$1000 de saldo e R$500 de limite
        ContaCorrente conta = new ContaCorrente("Maria Souza", "98765-4", 1000.0, 500.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());
        System.out.println("Limite do Cheque Especial: R$" + conta.getLimiteChequeEspecial());

        // Tentando sacar R$1200 (dentro do limite do cheque especial)
        double valorSaque = 1200.0;
        System.out.println("\nTentando sacar R$" + valorSaque + " com cheque especial...");

        boolean sucesso = conta.sacarComChequeEspecial(valorSaque);
        if (sucesso) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }

        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Tentando sacar R$500 (vai ultrapassar o limite total)
        valorSaque = 500.0;
        System.out.println("\nTentando sacar R$" + valorSaque + " novamente...");

        sucesso = conta.sacarComChequeEspecial(valorSaque);
        if (sucesso) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}

