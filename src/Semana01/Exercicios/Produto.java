package Semana01.Exercicios;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
        // "this." é usado pporque a variavel tem o mesmo "nome" que o atributo da classe
        // poderia ser utilizado da seguinte forma:
        // quantidade += quant //
        // dando um "nome" diferente para a variavel, não seria necessário o uso do "this."
    }
    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }
    public void exibirDados() {
        System.out.println("Nome: " + nome); // aqui o "this" não seria necessário pois o metodo não utiliza nenhuma variavel chamada "nome" (pois não existe conflito do "nome" entre variavel e classe)
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
