package OOP01;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.mostrarInformacoes();

        meuCarro.marca="Toyota";
        meuCarro.modelo="Corola";
        meuCarro.ano=2022;

        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.mostrarInformacoes();
    }
}
