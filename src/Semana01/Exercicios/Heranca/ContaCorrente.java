package Semana01.Exercicios.Heranca;

//Filho

public class ContaCorrente extends ContaBancaria {
    protected double limiteChequeEspecial;

    // Construtor
    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Método de saque com cheque especial
    public boolean sacarComChequeEspecial(double valor) {
        if (valor > 0 && valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}

