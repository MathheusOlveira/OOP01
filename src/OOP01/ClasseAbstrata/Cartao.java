package OOP01.ClasseAbstrata;

public abstract class Cartao {
    protected String numero;
    protected double limite;

    public Cartao(String numero, double limite){
        this.numero = numero;
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);

    public String getNumero(){
        return numero;
    }
    public double getLimite(){
        return limite;
    }

    protected void setLimite(double limite){
        this.limite = limite;
    }
}
