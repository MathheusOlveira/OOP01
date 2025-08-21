package Semana01.Exercicios.Heranca;

public class TransferenciaBancaria extends Transacao {
    protected String contaOrigem;
    protected String contaDestino;

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino) {
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }
    public void resumoTransferencia() {
        System.out.printf("Transferência de R$ %.2f de %s para %s na data %s%n", valor, contaOrigem, contaDestino, data);
    }
}
