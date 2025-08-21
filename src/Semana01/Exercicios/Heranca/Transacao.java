package Semana01.Exercicios.Heranca;

public class Transacao {
    protected String id;
    protected double valor;
    protected String data;

    public Transacao(String id, double valor, String data){
        this.id = id;
        this.valor = valor;
        this.data = data;
    }
    public Transacao( double valor, String data){
        this.valor = valor;
        this.data = data;
    }
    public Transacao(String data){
        this.data = data;
    }
    public Transacao(double valor){
        this.valor = valor;
    }
}
