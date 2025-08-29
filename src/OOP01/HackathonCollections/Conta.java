package OOP01.HackathonCollections;

//Classe Conta com metodos de depósito, saque, transferência e extrato.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {
    private final int numero;
    private final Cliente titular;
    private double saldo;
    private final List<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public boolean depositar(double valor, Scanner sc) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add(new Transacao("Depósito", valor));
            return true;
        }
        System.out.println("Valor de Depósito Inválido!");
        return false;
    }

    public boolean sacar(double valor, Scanner sc) {
        if (valor <= 0) {
            System.out.println("Valor Inválido para Saque!");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.extrato.add(new Transacao("Saque", -valor));
            return true;
        }
        System.out.println("Saldo Insuficiente para Saque!");
        return false;
    }

    public void registrarTransacaoRecebida(double valor, int contaOrigem) {
        this.saldo += valor;
        this.extrato.add(new Transacao("Transferência", valor, contaOrigem, this.numero));
    }

    public void registrarTransacaoEnviada(double valor, int contaDestino) {
        this.saldo -= valor;
        this.extrato.add(new Transacao("Transferência", -valor, contaDestino, this.numero));
    }

    public void imprimirExtrato() {
        if (!extrato.isEmpty()) {
            System.out.println("Extrato da conta " + numero + ":");
            for (Transacao t : extrato) {
                System.out.println(t);
            }
        } else {
            System.out.println("Extrato vazio.");
        }
    }
}
