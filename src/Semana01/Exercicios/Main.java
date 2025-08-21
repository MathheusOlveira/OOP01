package Semana01.Exercicios;

public class Main {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.exibirDados();

        meuProduto.nome="Sanduba";
        meuProduto.preco=15.00;
        meuProduto.quantidade=2;

        meuProduto.removerEstoque(5);
        meuProduto.adicionarEstoque(5);
        meuProduto.exibirDados();

    }
}
