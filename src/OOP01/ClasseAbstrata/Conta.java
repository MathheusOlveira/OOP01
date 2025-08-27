package OOP01.ClasseAbstrata;

public abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
