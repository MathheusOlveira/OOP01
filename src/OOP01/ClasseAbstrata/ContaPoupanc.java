package OOP01.ClasseAbstrata;

public class ContaPoupanc extends Conta{
    public ContaPoupanc(int numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void atualizarMensal(){
        setSaldo(getSaldo() * 1.005);
    }
}
