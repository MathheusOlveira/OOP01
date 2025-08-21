package Semana01.Exercicios;

public class aaaaaaaaaaaaaaaaaaa {
    private String titular;
    private String numeroConta;
    private double  saldo;

    public aaaaaaaaaaaaaaaaaaa(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public aaaaaaaaaaaaaaaaaaa(){
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }
    public aaaaaaaaaaaaaaaaaaa(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void exibirConta(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

}
