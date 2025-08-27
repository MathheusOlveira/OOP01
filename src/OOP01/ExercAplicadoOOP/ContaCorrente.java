package OOP01.ExercAplicadoOOP;


//Classe ContaCorrente filhinha da Conta, com o método que apenas imprime.
public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, Cliente clienteTitular, double saldo) {
        super(numeroConta, clienteTitular, saldo);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Juros não Aplicado! ");
    }
}
