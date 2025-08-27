package OOP01.Exercicios;

public class MainClienteVip {
    public static void main(String[] args) {
        ClienteVip cv = new ClienteVip();

        cv.setNome("Matheus");
        cv.setCpf("777777777777");
        cv.setLimiteCredito(10000);
        cv.exibirCliente();
    }
}
