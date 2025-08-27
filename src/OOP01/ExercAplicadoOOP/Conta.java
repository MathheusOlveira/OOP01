package OOP01.ExercAplicadoOOP;

//Classe Abstrata Conta com atributos privados numeroConta, clienteTitular e saldo,
// e seus respectivos getters e setters.
// @Override dos metodos da Interface OperacoesBancarias, espero que o caluclo esteja correto.
//Ainda incerto se é aqui que da implement da Interface OperacoesBancarias.

public abstract class Conta implements OperacoesBancarias {
    private String numeroConta;
    private Cliente clienteTitular;
    private double saldo;

    public Conta(String numeroConta, Cliente clienteTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.clienteTitular = clienteTitular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + ". Novo saldo: R$" + saldo);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Saque inválido.");
        }
    }

    public abstract void aplicarJuros();

}
