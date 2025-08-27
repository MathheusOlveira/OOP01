package OOP01.ExercAplicadoOOP;

// Classe ContaPoupanca que herda de Conta e implementa o método aplicarJuros
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta, Cliente clienteTitular, double saldo) {
        super(numeroConta, clienteTitular, saldo);
    }

    @Override
    public void aplicarJuros() {
        double valor = getSaldo() * 1.01;
        //double juros = getSaldo() + valor;
        System.out.println("Juros aplicado! Novo saldo: R$" + valor);
    }

}
