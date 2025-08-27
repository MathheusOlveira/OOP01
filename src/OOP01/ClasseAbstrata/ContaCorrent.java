package OOP01.ClasseAbstrata;

public class ContaCorrent extends Conta{
    public ContaCorrent(int numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void atualizarMensal(){
        setSaldo(getSaldo() - 15);
    }
}
