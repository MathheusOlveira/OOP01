package Semana01.Exercicios;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor Invalido!!");
        }
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo Insuficiente!!");
        }
    }

    public void exibirExtrato(){
        System.out.println("-----Extratinho-----");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + this.saldo);
    }

}
