package OOP01.Colecoes;
import java.util.HashSet;
import java.util.Set;

public class InvestidorProdutosExclusivos02 {

    public static void adicionarProduto(Set<String> produtos, String nomeProduto) {
        if (produtos.add(nomeProduto)) {
            System.out.println("Produto adicionado: " + nomeProduto);
        } else {
            System.out.println("Produto já adquirido: " + nomeProduto);
        }
    }

    public static void exibirProdutos(Set<String> produtos) {
        System.out.println("\n" + "Produtos adquiridos:");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }
    }

    public static void main(String[] args) {
        Set<String> produtosInvestidor = new HashSet<>();

        adicionarProduto(produtosInvestidor, "Fundo Imobiliário");
        adicionarProduto(produtosInvestidor, "Ações Premium");
        adicionarProduto(produtosInvestidor, "Cripto Exclusiva");
        adicionarProduto(produtosInvestidor, "Ações Premium");

        exibirProdutos(produtosInvestidor);
    }
}